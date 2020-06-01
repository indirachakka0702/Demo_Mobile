package Demp_Mobile.Demp_Mobile;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidUtils{

	public void launchApp(String sAppName) throws Exception{
		// code to require to launch an app
		// 1. android/ ios 2. Device name = 3. Device Os 4.App package info 5.App activity
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");//"platformName"
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY323FGW2R");
		if(sAppName.equals("calc"))
		{
			cap.setCapability("appPackage", "com.google.android.calculator");
			cap.setCapability("appActivity","com.android.calculator2.Calculator");
		}
		else if(sAppName.equals("Contacts"))
		{
			cap.setCapability("appPackage", "com.google.android.contacts");
			cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
		}
		
		//launch appium app --> Then get the appium IP and port --> Bind it to your driver 
		// Appium become an server - hub --> Selenium code will become an node -->
		TestBase.driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		System.out.println("App Launched");
 }
}