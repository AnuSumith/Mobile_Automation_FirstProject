package com.mobileAutomation.PO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class MobileAutoPO extends BaseClass{
public AppiumDriver driver;
By username =By.xpath("//*[@content-desc='user_name']");
By password =By.xpath("//*[@content-desc='password']");
By button = By.xpath("//*[@content-desc=\"btn\"]");

public MobileAutoPO(AppiumDriver driver) {
	this.driver = driver;
}
public boolean verifyEmailfield()
{
	boolean res = driver.findElement(username).isDisplayed();
	System.out.println("username verify Status = " + res);
	return res;
}


public boolean verifyPasswordfield()
{
	boolean res1 = driver.findElement(password).isDisplayed();
	System.out.println("password verify Status = " + res1);
	return res1;
}

public void acknowledgeInstallation() {
	System.out.println("Application Installed");
}
public WebElement getUsername() 
{
return driver.findElement(username);	
}
public WebElement getPassword() 
{
return driver.findElement(password);	
}
public WebElement getSubmit() 
{
return driver.findElement(button);	
}

public void login (String userName, String passWord) 
{
	MobileAutoPO obj =new MobileAutoPO(driver);
	obj.getUsername().sendKeys(userName);
	obj.getPassword().sendKeys(passWord);
	obj.getSubmit().click();
	
}

}