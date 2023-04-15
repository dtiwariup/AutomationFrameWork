package com.bdd.testRunner;
import org.testng.TestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions (
		plugin= {"json:target/cucumber.json"},
		features= {"src/test/resource/com/bdd/features"},
		glue= {"com.bdd.stepdefinitions"},
		monochrome=true,
		dryRun=false,
		tags="@home"
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	TestNGCucumberRunner testcucumber = new TestNGCucumberRunner(this.getClass());

}
