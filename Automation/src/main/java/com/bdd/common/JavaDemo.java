package com.bdd.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.bdd.utilities.Utility;

public class JavaDemo {

	public static void main(String[] args) {
		
		//ChromeOptions co = new ChromeOptions();
		//co.addArguments("==remote-allow-origins=*");
		//System.setProperty("Webdriver.chrome.driver", "C:\\SeleniumFramwork\\chromedriver\\chromedriver.exe");
		System.setProperty("Webdriver.edge.driver", "C:\\SeleniumFramwork\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Utility.timeout));
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		

	}

}
