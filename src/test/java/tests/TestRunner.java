package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/Feature/mobile.feature",
		glue = { "com.mobileAutomation.stepdefinition" },
		tags = {"@DEMO1"}
		
		
		
		)
public class TestRunner {
	
	

}
