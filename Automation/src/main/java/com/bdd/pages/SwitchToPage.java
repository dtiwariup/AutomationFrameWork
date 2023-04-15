package com.bdd.pages;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;

import com.bdd.common.Base;
import com.bdd.locator.Locators;
import org.testng.*;
import org.testng.asserts.SoftAssert;

public class SwitchToPage extends Base {
	private static final String Window = null;
	By swith_menu_lctr = By.xpath(Locators.switch_to_menu_loc);
	By alerts_menu_lctr = By.xpath(Locators.alerts_loc);
	By alerts_btn_lctr = By.xpath(Locators.alerxt_btn_loc);
	By window_menu_lctr = By.xpath(Locators.window_loc);
	By frame_lctr = By.xpath(Locators.frame_loc);
	By extrapoup_lctr = By.xpath(Locators.alert_msg_pop_loc);
	By window_click_btn_lctrBy = By.xpath(Locators.window_click_btn_loc);
	By alert_lctr = By.xpath(Locators.alert_text_loc);
	By confirm_menu_lctr = By.xpath(Locators.confirm_menu_loc);
	By confirm_butn_lctr = By.xpath(Locators.confirm_button_loc);

	By new_tab_lctr = By.xpath(Locators.open_new_tab_window);
	By new_tab_btn_lctr = By.xpath(Locators.open_new_tab_window_btn);

	By new_window_lctr = By.xpath(Locators.open_new_seprate_window);
	By new_window_btn_lctr = By.xpath(Locators.open_new_seprate_window_btn);

	By multiple_window_lctr = By.xpath(Locators.open_seprate_multiple_window);
	By multiple_window_btn_lctr = By.xpath(Locators.open_seprate_multiple_window_btn);

	/*
	 * public void switchMenuClick() throws InterruptedException {
	 * driver.findElement(swith_menu_lctr).click();
	 * 
	 * }
	 * 
	 * public void alertMenuClick() throws InterruptedException {
	 * visiblewait(Locators.alerts_loc, 5, "Alert locator name");
	 * driver.findElement(alerts_menu_lctr).click(); Thread.sleep(5000);
	 * visiblewait(Locators.alert_msg_pop_loc, 5, "AlertMessage locator name");
	 * driver.switchTo().frame(driver.findElement(By.xpath(
	 * "//iframe[@id='ad_iframe']"))); driver.findElement(extrapoup_lctr);
	 * driver.switchTo().defaultContent();
	 * 
	 * 
	 * }
	 */

	public void alertText() {
		driver.findElement(alert_lctr).getText();
	}

	public void alertbtnClick() {
		driver.findElement(alerts_btn_lctr).click();
		driver.switchTo().alert().accept();
	}

	public void confirmWithOkMenu() {
		driver.findElement(confirm_menu_lctr).click();
	}

	public void confirmButton() {
		driver.findElement(confirm_butn_lctr).click();
		driver.switchTo().alert().dismiss();
		System.out.println("cancel button is clicked");
	}

	public void openNewTab() throws InterruptedException {

		driver.findElement(new_tab_lctr).getText();
		String get_Title = driver.getTitle();
		assertEquals(get_Title, "Frames & windows");
		System.out.println("title is matched");

	}

	public void clickOpenNewTab() throws InterruptedException {
		Thread.sleep(5000);

		driver.findElement(new_tab_btn_lctr).click();
		// driver.switchTo().newWindow(WindowType.TAB); // switch to new tab only
		// driver.switchTo().window(Window);
		String parent_window = driver.getWindowHandle();
		Set<String> s = driver.getWindowHandles();
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String child_window = itr.next();
			if (!parent_window.equals(child_window)) {
				driver.switchTo().window(child_window);
				driver.close();
			}

		}
		driver.switchTo().window(parent_window);
	}

	public void openNewSeprateWindow() {
		driver.findElement(new_window_lctr).click();
		String str = driver.getTitle();
		assertEquals(str, "Frames & windows");
		System.out.println("title matched");
	}

	public void clickNewSeprateWindow() {
		driver.findElement(new_window_btn_lctr).click();
		//driver.switchTo().newWindow(WindowType.WINDOW); // switch to new window
		String parent=driver.getWindowHandle();
		Set<String> ss=driver.getWindowHandles();
		Iterator<String> itr=ss.iterator(); 
				{
					while(itr.hasNext()) {
					String child=	itr.next();
						if(!parent.equals(ss)) {
							driver.switchTo().window(child);
							driver.close();
						}
						
					}
					driver.switchTo().window(parent);
					driver.close();
		}
		driver.close();

	}

	public void openMultipleWindow() {

	}

	public void clickToOpenMultipleWindow() {

	}
}
