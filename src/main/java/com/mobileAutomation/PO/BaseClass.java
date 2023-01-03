package com.mobileAutomation.PO;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class BaseClass {
	static AppiumDriver driver;
	public void setup() throws MalformedURLException 
	{
		DesiredCapabilities caps =new DesiredCapabilities();
		caps.setCapability("deviceName", "Samsung Galaxy S9");
		caps.setCapability("deviceOrientation", "portrait");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("platformName", "Android");
		caps.setCapability("app", "storage:filename=Appzlogic.apk");
		caps.setCapability("noReset", false);
		caps.setCapability("unicodeKeyboard", true);
		caps.setCapability("clearSystemFiles", true);
		caps.setCapability("showXcodeLog", true);
		caps.setCapability("unicodeKeyboard", true);
		URL url = new URL ("https://oauth-anusrndrn-02a90:377d06e0-a9b2-4979-a39f-5b6dedffa071@ondemand.us-west-1.saucelabs.com:443/wd/hub)");
	    driver = new AppiumDriver(url,caps);
	}

}
