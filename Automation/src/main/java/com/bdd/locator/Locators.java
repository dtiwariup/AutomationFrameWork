package com.bdd.locator;

public class Locators {
	
	public static String skip_button="//button[@id='btn22']";
	
	public static String register_text="//h2[text()='Register']";
	
	//-------------------------Signup-----------------------------------------//
	
	public static String firstname="//input[@placeholder='First Name']";
	
	public static String lastname= "//input[@placeholder='Last Name']";
	
	public static String address="//textarea[contains(@class,'form-control ng-pristine')]";
	
	public static String emailaddress="//input[contains(@class,'form-control ng-pristine ng-untouched ng-valid-email')]";
	
	public static String phonenumber="//input[contains(@class,'form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern')]";
	
	public static String gender ="//input[@name='radiooptions']";
	
	public static String hobbies="//input[@type='checkbox']";
	
	public static String languageclick="//div[@id='msdd']";
	public static String languageList="//a[@class='ui-corner-all']";
	
	public static String skill_click_loc="//select[@id='Skills']";
	public static String skill_select_loc="//select[@id='Skills']//option";
	public static String skillLable_loc="//label[text()='Skills']";
	
	public static String submitBtn_loc="//button[@id='submitbtn']";
	
	public static String countryClick_loc="//span[@class='select2-selection select2-selection--single']";
	public static String countryList_loc="//li[@class='select2-results__option']";
	
	public static String password_loc="//input[@id='firstpassword']";
	public static String confirm_password_loc="//input[@id='secondpassword']";
	
	public static String year_dob_loc="//select[@id='yearbox']";
	public static String  year_dob_click_loc="//select[@id='yearbox']//option";
	public static String month_dob_loc="//select[@placeholder='Month']";
	public static String month_dob_click_loc="//select[@placeholder='Month']//option";
	public static String day_dob_loc="//select[@id='daybox']";
	public static String day_dob_click_loc="//select[@id='daybox']//option";
	
	//--------------------------------SwitchToPage----------------------------------------------//
	
	public static String switch_to_menu_loc="(//a[@href='SwitchTo.html'])[position()=1]";
	public static String alerts_loc="//a[@href='Alerts.html']";
	public static String alert_text_loc="//a[@href='#OKTab']";
	public static String confirm_menu_loc="//a[text()='Alert with OK & Cancel ']";
	public static String confirm_button_loc="//button[contains(text(),'click the button to display a confirm box ')]";
	public static String alerxt_btn_loc="//*[contains(@class,'btn btn-danger')]";
	public static String alert_msg_pop_loc="//div[@id='dismiss-button']";
	public static String window_click_btn_loc="//a[@href='http://www.selenium.dev']";
	
	public static String window_loc="//a[@href='Windows.html']";
	public static String open_new_tab_window="//a[@href='#Tabbed']";
	public static String open_new_tab_window_btn="//*[@id=\"Tabbed\"]/a/button";
	
	public static String open_new_seprate_window="//a[text()='Open New Seperate Windows']";
	public static String open_new_seprate_window_btn="//div[@id='Seperate']/button[@class='btn btn-primary']";
	
	public static String open_seprate_multiple_window="//a[@href='#Multiple']";
	public static String open_seprate_multiple_window_btn="//div[@id='Multiple']/button[@class='btn btn-info']";
	
	public static String frame_loc="//a[@href='Frames.html']";
	
	
		
	//------------------------------WidgetPage--------------------------------------------------//
	public static String widget_menu_loc="//a[@href='Widgets.html']";
	public static String accordian_menu_loc="//a[@href='Accordion.html']";
	public static String accordion_list_loc="//div[@class='parrent media-body']";
	
	
	//----------------------------------------WidgetDatepicker--------------------------------------//
	public static String cal_date_loc="//img[@class='imgdp']";
	public static String cal_enble_date_loc="//input[@id='datepicker2']";
}
