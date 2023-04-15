package com.bdd.stepdefinitions;

import java.io.IOException;

import com.bdd.common.Base;
import com.bdd.common.Implementation;
import com.bdd.excelReader.ReadExcel;
import com.bdd.pages.DatePickerPage;
import com.bdd.pages.HomePage;
import com.bdd.pages.SignupPage;
import com.bdd.pages.SwitchToPage;
import com.bdd.pages.WidgetsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions extends Base {

//---------------------------------------HomePage---------------------------------------//	
	HomePage homepage = new HomePage();
	SignupPage signuppage = new SignupPage();
	SwitchToPage switchtopage = new SwitchToPage();
	WidgetsPage widgetpage=new WidgetsPage();
	DatePickerPage datepicker=new DatePickerPage();

	@Given("User navigate to home page")
	public void user_navigate_to_home_page() throws IOException {
		Implementation.launchUrl();
	}

	@When("User click on Skip Sign In CTA")
	public void user_click_on_skip_sign_in_cta() throws Exception {
		homepage.clikSkip();
	}

	@Then("User successfully navigate to signup page")
	public void user_successfully_navigate_to_signup_page() {
		homepage.verifyRegisterText();
	}

//------------------------------Signup---------------------------------------------------------//	

	@Given("User enter firstname and lastname")
	public void user_enter_firstname_and_lastname() throws IOException {
		String Fname = ReadExcel.readExcel(1, 1, "Sheet1");
		String Lname = ReadExcel.readExcel(1, 2, "Sheet1");
		signuppage.name(Fname, Lname);
	}

	@When("User enter the address")
	public void user_enter_the_address() throws IOException {
		String Address = ReadExcel.readExcel(1, 3, "Sheet1");
		signuppage.address(Address);

	}

	@When("User enter email address")
	public void user_enter_email_address() throws IOException {
		String Email_ID = ReadExcel.readExcel(1, 4, "Sheet1");
		signuppage.emailAddress(Email_ID);

	}

	@When("User enter the phone number")
	public void user_enter_the_phone_number() throws IOException {

		String phone_number = ReadExcel.readExcel(1, 5, "Sheet1");
		signuppage.phoneNumber(phone_number);

	}

	@When("User select the gender")
	public void user_select_the_gender() throws IOException {
		String gender_name = ReadExcel.readExcel(1, 6, "Sheet1");
		signuppage.genderName(gender_name);

	}

	@When("User select hobbies")
	public void user_select_hobbies() throws IOException {
		String hobby_name = ReadExcel.readExcel(1, 7, "Sheet1");
		signuppage.hobbies(hobby_name);
	}

	@When("User select language")
	public void user_select_language() throws IOException, InterruptedException {

		String language_name = ReadExcel.readExcel(1, 8, "Sheet1");
		signuppage.language(language_name);
	}

	@When("User select skill")
	public void user_select_skill() throws IOException {
		String skill_name = ReadExcel.readExcel(1, 9, "Sheet1");
		signuppage.skill(skill_name);
	}

	@When("User select the country")
	public void user_select_the_country() throws IOException {
		String country_select = ReadExcel.readExcel(1, 11, "Sheet1");
		signuppage.selectCountry(country_select);

	}

	@When("User select the Year")
	public void user_select_the_year() throws IOException {
		String year = ReadExcel.readExcel(1, 12, "Sheet1");
		signuppage.birthYear(year);

	}

	@When("User select the Month")
	public void user_select_the_month() throws IOException {
		String month = ReadExcel.readExcel(1, 13, "Sheet1");
		signuppage.birthMonth(month);

	}

	@When("User select the Day")
	public void user_select_the_day() throws IOException {
		String day = ReadExcel.readExcel(1, 14, "Sheet1");
		signuppage.birthDay(day);

	}

	@When("User enter the password")
	public void user_enter_the_password() throws IOException {
		String pass = ReadExcel.readExcel(1, 15, "Sheet1");
		signuppage.firstPassword(pass);

	}

	@When("User enter the confirm password")
	public void user_enter_the_confirm_password() throws IOException {
		String cpass = ReadExcel.readExcel(1, 16, "Sheet1");
		signuppage.secondPassword(cpass);

	}

	@Then("User click on submit button")
	public void user_click_on_submit_button() {
		signuppage.submitCTA();
	}

//------------------------------------SwitchToPage---------------------------------------------//
	@Given("Validate the alert text")
	public void validate_the_alert_text() {
	switchtopage.alertText();
	}


	@Then("Click on alert button")
	public void click_on_alert_button() {
		switchtopage.alertbtnClick();
	}

	@Given("click on alertwithOk button")
	public void click_on_alertwith_ok_button() {
	    switchtopage.confirmWithOkMenu();
	}
	@Then("click on confirmbox")
	public void click_on_confirmbox() {
	   switchtopage.confirmButton();
	}
	

//--------------------Switch_NewTab_Window_Handle--------------------------------------------//
	
	@Given("Click on open new tab window")
	public void click_on_open_new_tab_window() throws InterruptedException {
		switchtopage.openNewTab();
	   
	}
	@Then("Click on new tab window button")
	public void click_on_new_tab_window_button() throws InterruptedException {
	  switchtopage.clickOpenNewTab();
	}
	
	@Given("Click on open new seprate window")
	public void click_on_open_new_seprate_window() {
	   switchtopage.openNewSeprateWindow();
	}
	@Then("Click on open seprate window button")
	public void click_on_open_seprate_window_button() {
		switchtopage.clickNewSeprateWindow();
	    
	}
	@Given("Click on open seprate multiple window")
	public void click_on_open_seprate_multiple_window() {
	   
	}
	@Then("Click on open seprate multiple window button")
	public void click_on_open_seprate_multiple_window_button() {
	    
	}
//--------------------------------------------------WidgetPage--------------------------------------//
	@Given("Click on widget menu")
	public void click_on_widget_menu() {
		widgetpage.widgetMenuClick();

	}
	@When("Click on Accordian submenu")
	public void click_on_accordian_submenu() {
		widgetpage.accordionMenuClick();

	}
	@Then("Click on collapsable group")
	public void click_on_collapsable_group() {
		
	  
	}
	
//----------------------------------------Widget-datepicker--------------------------------------//
	@Given("click on datepciker calander")
	public void click_on_datepciker_calander() {
	 datepicker.datePickerCal();
	}
	
	@Then("choose the date")
	public void choose_the_date() {
	 datepicker.enterTheDate();
	}

}
