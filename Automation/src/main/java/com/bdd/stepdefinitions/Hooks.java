package com.bdd.stepdefinitions;

import com.aventstack.extentreports.Status;
import com.bdd.common.Base;
import com.bdd.utilities.Utility;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base {
	@Before(order = 1)
	public void printScenarioName(Scenario scenario) {
		System.out.println(scenario.getName() + "EXECUTATION IS STARTED");
		String pFolder =Base.parentFolder();
		address = Utility.screenshotAndReportFolder(pFolder);
		htmlReportManager.createHtmlReport(scenario.getName());
		htmlReportManager.createTestReport(scenario.getName());
		htmlReportManager.eTest.log(Status.INFO, scenario.getName() + "execution is started");

	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		System.out.println(scenario.getName() + "EXECUTION IS COMPLETED");
		htmlReportManager.eTest.log(Status.INFO, scenario.getName() + "execution is completed");
		htmlReportManager.saveReport();
	}

	@After(order = 0)
	public void windowClose() {
		driver.quit();
	}
}
