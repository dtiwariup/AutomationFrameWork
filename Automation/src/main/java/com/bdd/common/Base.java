package com.bdd.common;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.bdd.extentReport.SetExtentReport;
import com.bdd.utilities.Utility;

public class Base {
	public static WebDriver driver;
	public static String address;
	protected static SetExtentReport htmlReportManager;
	public Base() {
		htmlReportManager=SetExtentReport.getInstance();
	}

	public static WebDriver getDriver() {

		System.setProperty("Webdriver.chrome.driver", "C:\\SeleniumFramwork\\chromedriver\\chromedriver.exe");
		// System.setProperty("Webdriver.edge.driver",
		// "C:\\SeleniumFramwork\\edgedriver\\msedgedriver.exe");
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		// driver = new EdgeDriver();

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.timeout));
		driver.manage().deleteAllCookies();
		return driver;
	}

//Assertion from WebElement
	public static void visiblewait(String Element, int time, String ElementName) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Element)));
		} catch (Exception e) {
			Assert.fail("element " + ElementName + "is not displayed");
		}
	}
	//create parent folder to store screenshot and report
	public static String parentFolder() {
		String parentfoldername = "Automation_Report_Screenshot_" + new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		File pfile = new File(parentfoldername);
		if(!pfile.exists()) {
			if(pfile.mkdir()) {
				System.out.println("Parent File Created");
			}
		}
		else {
			System.out.println("Parent File not created");
		}
		return parentfoldername;
	}
	
	//take screenshot and store in folder
	
	public String getSceenshot() throws IOException {
		String screenshotFolder="/Screeshot/"+ new SimpleDateFormat("dd-MM-yyyy HH-mm-ss").format(new Date())+".png";
		String currentPath=address+screenshotFolder;
		TakesScreenshot tsc=(TakesScreenshot)driver;
		File source=tsc.getScreenshotAs(OutputType.FILE);
		String destinationFile =currentPath;
		FileUtils.copyFile(source, new File(destinationFile));
		destinationFile="../"+Utility.foldername+"/"+screenshotFolder;
		return destinationFile;
		
	}

}