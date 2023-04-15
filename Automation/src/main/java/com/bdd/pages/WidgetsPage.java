package com.bdd.pages;

import org.openqa.selenium.By;

import com.bdd.common.Base;
import com.bdd.locator.Locators;
import org.testng.*;

public class WidgetsPage extends Base{
	By widget_menu_ltr=By.xpath(Locators.widget_menu_loc);
	By accordion_menu_ltr=By.xpath(Locators.accordian_menu_loc);
	By accordion_list_ltr=By.xpath(Locators.accordion_list_loc);

	public void widgetMenuClick() {
		driver.findElement(widget_menu_ltr).click();
		
	}
	
	public void accordionMenuClick() {
		driver.findElement(accordion_menu_ltr).click();
		driver.findElement(accordion_list_ltr);
		//for(int i=0;i<accordion_list_ltr.)
		
	}
}
