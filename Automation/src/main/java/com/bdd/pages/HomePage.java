package com.bdd.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;
import com.bdd.common.Base;
import com.bdd.locator.Locators;

public class HomePage extends Base {

	By skipbtn = By.xpath(Locators.skip_button);
	By register = By.xpath(Locators.register_text);

	public void clikSkip() throws IOException {
		try {
			driver.findElement(skipbtn).click();
			htmlReportManager.eTest.log(Status.PASS,
					"Click Skip is pass " + "," + htmlReportManager.eTest.addScreenCaptureFromPath(getSceenshot()));

		} catch (AssertionError ae) {
			htmlReportManager.eTest.log(Status.FAIL, "Click Skip assertion fail " + "," + ae.getMessage() + ","
					+ htmlReportManager.eTest.addScreenCaptureFromPath(getSceenshot()));
			ae.printStackTrace();

		} catch (Exception e) {
			htmlReportManager.eTest.log(Status.FAIL, "Click Skip exception fail  " + "," + e.getMessage() + ","
					+ htmlReportManager.eTest.addScreenCaptureFromPath(getSceenshot()));
			e.printStackTrace();
		}
	}

	public void verifyRegisterText() {
		String el = driver.findElement(register).getText();
		System.out.println(el);
	}

}
