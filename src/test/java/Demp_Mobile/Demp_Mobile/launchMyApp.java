package Demp_Mobile.Demp_Mobile;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class launchMyApp extends TestBase{

	/*
	  Android Studio - All the android related supporting files will be there in that
	  --> adb   --- communication/ command --> from laptop to your device
	  -->SDK manager - new operating device
	  -->avd manager --- Emulatot(android look like phone)
	  --> ui automator -- to find an locator
	 
	 Appium -- Tool where you can Automate mobile devices - Open source-Free
	 
	 selenium laungage level binding(java) ---> will taking to WebDriver --> will launching Browser
	 
	 Mobile
	 selenium laungage level binding(java) ---> will taking to Appium ---> will taking to Android Devices
	 
	 Physical Android device OR Emulator
	 
	 1. Enable Developer option
	 2. Check your android version
	    meanwhile launch sdk manager and check that version SDK's are installed or not
	    
	    --> launching app using appium
	     selenium laungage level binding(java) ---> Appium --> Android Devices
	     --> Calculator app --- unique name for calc or any other app which is there in market
	     calc
	     app details:
	     Packages--> by writing a code--> Package-->
	     
	   ***  dumpsys window windows | grep -E ‘mCurrentFocus’
	     
	     Package info : unique identification of your app
	     Activity : The first activity which your app does
	     
	     Activity --> whenever your app launches what will be your first screen?
	     
	     Package info : com.android.calculator2
	     Activity : com.android.calculator2.Calculator
	     
	     splash --> The first screen --> your app logo
	     Activity --> com.<some>.<some>.splashScreen
	 
	   1.
	 How to identify an element
	 
	 it is about on real physical device - How to create an emulator device
	 
	  */
	//Contacts app -- Amazon
	@Test
	public void TC_01_Sum() throws Exception{
		System.out.println("");
		driver.findElement(By.id("digit_7")).click();
		driver.findElement(By.id("digit_5")).click();
		driver.findElement(By.id("op_mul")).click();
		driver.findElement(By.id("digit_5")).click();
		driver.findElement(By.id("eq")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("result_final")).getText());
		Thread.sleep(10000);
	 
 }
}
