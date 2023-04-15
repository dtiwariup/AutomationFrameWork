package com.bdd.extentReport;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.ResourceCDN;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.bdd.common.Base;

import freemarker.template.SimpleDate;

public class SetExtentReport extends Base {
	public ExtentHtmlReporter eHthmlReporter;
	public ExtentReports eReports;
	public ExtentTest eTest;
	public SetExtentReport() {

	}

	public static SetExtentReport getInstance() {
		return HtmlReportManagerHolder.htmlReportManager;

	}

	private static class HtmlReportManagerHolder {
		public static final SetExtentReport htmlReportManager = new SetExtentReport();

	}

	protected Object readResolve() {
		return getInstance();

	}
public void createHtmlReport(String TestCase) {
	eHthmlReporter=new ExtentHtmlReporter(address+"/"+TestCase+"_"+new SimpleDateFormat("dd-MM-yyyy HH-mm-ss")
			.format(new Date())+".html");
	eHthmlReporter.loadXMLConfig(new File(System.getProperty("user.dir")+"//extentreport.xml"));
	eHthmlReporter.config().setResourceCDN(ResourceCDN.EXTENTREPORTS);
	eHthmlReporter.setAppendExisting(true);
	eReports=new ExtentReports();
	eReports.attachReporter(eHthmlReporter);
	eReports.setSystemInfo("Device", "Window");
	eReports.setSystemInfo("Environemnt", "UAT");
	eReports.setSystemInfo("Name", "Dhruv");
	
}
public void createTestReport(String TestCase) {
	 eTest = eReports.createTest(TestCase);
	 
}
public void saveReport() {
	eReports.flush();
	eHthmlReporter=null;
	eReports=null;
	eTest=null;
}
}
