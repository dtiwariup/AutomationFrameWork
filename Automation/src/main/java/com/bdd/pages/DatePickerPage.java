package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.common.Base;
import com.bdd.locator.Locators;

public class DatePickerPage extends Base {
	
	By cal_date_picker_lctr=By.xpath(Locators.cal_date_loc);
	By cal_enble_date_lctr=By.xpath(Locators.cal_enble_date_loc);

	public void datePickerCal() {
		driver.findElement(cal_enble_date_lctr).click();
	}
	public void enterTheDate() {
		//driver.findElement(cal_enble_date_lctr).sendKeys("04/12/2023");
		driver.findElement(cal_enble_date_lctr).sendKeys();
	}
}
