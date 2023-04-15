package com.bdd.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.bdd.common.Base;
import com.bdd.locator.Locators;

import org.testng.*;

public class SignupPage extends Base {

	By fname = By.xpath(Locators.firstname);
	By lname = By.xpath(Locators.lastname);
	By addr = By.xpath(Locators.address);
	By email = By.xpath(Locators.emailaddress);
	By phone = By.xpath(Locators.phonenumber);
	By gender = By.xpath(Locators.gender);
	By hobby = By.xpath(Locators.hobbies);
	By language_click = By.xpath(Locators.languageclick);
	By language_select = By.xpath(Locators.languageList);
	By skill_click = By.xpath(Locators.skill_click_loc);
	By skill_select = By.xpath(Locators.skill_select_loc);
	By skillLable = By.xpath(Locators.skillLable_loc);
	By submitBtn = By.xpath(Locators.submitBtn_loc);
	By countryClick = By.xpath(Locators.countryClick_loc);
	By countryList = By.xpath(Locators.countryList_loc);
	By dobYear = By.xpath(Locators.year_dob_loc);
	By dobYear_Select=By.xpath(Locators.year_dob_click_loc);
	By dobMonth = By.xpath(Locators.month_dob_loc);
	By dobMonth_Select=By.xpath(Locators.month_dob_click_loc);
	By dobDay = By.xpath(Locators.day_dob_loc);
	By dobDay_Select=By.xpath(Locators.day_dob_click_loc);
	By fpwd = By.xpath(Locators.password_loc);
	By spwd = By.xpath(Locators.confirm_password_loc);

	public void name(String Fname, String Lname) {
		visiblewait(Locators.firstname, 5, "First_Name"); // Assertion
		driver.findElement(fname).sendKeys(Fname);
		driver.findElement(lname).sendKeys(Lname);
	}

	public void address(String AddressLocation) {
		driver.findElement(addr).sendKeys(AddressLocation);
	}

	public void emailAddress(String Email) {
		driver.findElement(email).sendKeys(Email);
	}

	public void phoneNumber(String Phone) {
		driver.findElement(phone).sendKeys(Phone);
	}

	public void genderName(String Gender) {
		List<WebElement> ge = driver.findElements(gender);
		boolean flag = false;

		for (int i = 0; i < ge.size(); i++) {
			if (ge.get(i).getAttribute("value").equalsIgnoreCase(Gender)) {
				flag = true;
				ge.get(i).click();
				break;
			}
		}
		if (flag == true) {
			System.out.println("Gender Pass");
		} else {
			Assert.fail("Gender is mismatch");
		}

	}

	public void hobbies(String Hobby) {
		List<WebElement> hb = driver.findElements(hobby);
		for (int i = 0; i < hb.size(); i++) {
			if (hb.get(i).getAttribute("Value").equalsIgnoreCase(Hobby)) {
				hb.get(i).click();
				break;
			}
		}

	}

	public void language(String Language) throws InterruptedException {
		driver.findElement(language_click).click();
		Thread.sleep(2000);
		List<WebElement> lng = driver.findElements(language_select);
		for (int i = 0; i < lng.size(); i++) {
			if (lng.get(i).getText().equalsIgnoreCase(Language)) {
				lng.get(i).click();
				break;
			}
		}
		driver.findElement(skillLable).click();

	}

	public void skill(String Skills) {
		driver.findElement(skill_click).click();
		List<WebElement> ekl = driver.findElements(skill_select);
		for (int i = 0; i < ekl.size(); i++) {
			if (ekl.get(i).getAttribute("Value").equalsIgnoreCase(Skills)) {
				ekl.get(i).click();
				break;
			}
		}
		driver.findElement(skillLable).click();
	}

	public void selectCountry(String Country) {
		driver.findElement(countryClick).click();
		List<WebElement> coun = driver.findElements(countryList);
		for (int i = 0; i < coun.size(); i++) {
			if (coun.get(i).getText().equalsIgnoreCase(Country)) {
				coun.get(i).click();
				break;

			}

		}
		driver.findElement(skillLable).click();
	}

	public void birthYear(String Year) {
		{
			driver.findElement(dobYear).click();
			List<WebElement> yr = driver.findElements(dobYear_Select);
			for (int i = 0; i < yr.size(); i++) {
				if (yr.get(i).getText().equalsIgnoreCase(Year)) {
					yr.get(i).click();
					break;
				}
			}
		}
	}

	public void birthMonth(String Month) {
		{
			driver.findElement(dobMonth).click();
			List<WebElement> mo = driver.findElements(dobMonth_Select);
			for (int i = 0; i < mo.size(); i++) {
				if (mo.get(i).getText().equalsIgnoreCase(Month)) {
					mo.get(i).click();
					break;
				}
			}
		}
	}

	public void birthDay(String Day) {
		{

			driver.findElement(dobDay).click();
			List<WebElement> mo = driver.findElements(dobDay_Select);
			for (int i = 0; i < mo.size(); i++) {
				if (mo.get(i).getText().equalsIgnoreCase(Day)) {
					mo.get(i).click();
					break;
				}
			}

		}

	}

	public void firstPassword(String Password) {
		{
			driver.findElement(fpwd).sendKeys(Password);
		}

	}

	public void secondPassword(String Cpassword) {
		{
			driver.findElement(spwd).sendKeys(Cpassword);		}

	}

	public void submitCTA() {
		driver.findElement(submitBtn).click();
	}
}
