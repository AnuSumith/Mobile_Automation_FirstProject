package com.mobileAutomation.stepdefinition;





import com.mobileAutomation.PO.BaseClass;
import com.mobileAutomation.PO.MobileAutoPO;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;


public class MobileStepDefinition extends BaseClass{
	public AppiumDriver driver;
	public MobileAutoPO loginobject;
	@Given("The User Install the Application")
	public void the_user_install_the_application() {
		loginobject = new MobileAutoPO(driver);	
		loginobject.acknowledgeInstallation();
	}

	@Then("The User Verify the email field is displayed")
	public void the_user_verify_the_email_field_is_displayed() { 
	Assert.assertTrue(loginobject.verifyEmailfield());
	}

	@Then("The User Verify the password filed is displayed")
	public void the_user_verify_the_password_filed_is_displayed() {
	Assert.assertTrue(loginobject.verifyPasswordfield());   
	}

	@When("The User enter data into Email Field")
	public void the_user_enter_data_into_email_field() {
		loginobject.getUsername();    
	}

	@When("The User enter data into password Field")
	public void the_user_enter_data_into_password_field() {
		loginobject.getPassword(); 
	}

	@Then("The User clicked on button")
	public void the_user_clicked_on_button() {
		loginobject.getSubmit(); 
	}

}
