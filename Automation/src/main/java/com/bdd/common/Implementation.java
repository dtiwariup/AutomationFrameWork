package com.bdd.common;

import java.io.IOException;

import com.bdd.excelReader.ReadExcel;

public class Implementation extends Base {
	//ReadExcel readexcel = new ReadExcel();
	
	public static void launchUrl() throws IOException {
		if(driver==null || driver.toString().contains("null")) {
			driver=getDriver();
		}
		String Url=ReadExcel.readExcel(1, 0, "Sheet1");
		driver.get(Url);
	}

}
