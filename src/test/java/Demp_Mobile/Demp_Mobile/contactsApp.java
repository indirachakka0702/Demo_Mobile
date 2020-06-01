package Demp_Mobile.Demp_Mobile;

import java.time.Duration;

import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class contactsApp extends TestBase{

	
	//To launch contacts app from my device
		@Test
		public void contacts_TC_01() throws Exception{
		
			Thread.sleep(3000);
			//driver.findElement(By.xpath("//android.widget.TextView[@content-desc='A Reliance']")).click();
			driver.findElement(MobileBy.AccessibilityId("Chinnu")).click();
			driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
			driver.findElement(MobileBy.AccessibilityId("Alli")).click();
			driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();	
			Thread.sleep(10000);
			
		}
		@Test
		public void contacts_TC_02_scrollDown() throws Exception{
		
			Thread.sleep(3000);
			
			//You have screen --> list of items displayed --> soap,liquid, 
			//3 pages'
			
			String sList="android:id/list";
			String sContContains="Yathisha Chicago Meditation";
			MobileElement scroll = (MobileElement) driver
			.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"" + sList
					+ "\")).scrollIntoView(new UiSelector().textContains(\"" + sContContains + "\"))");
			Thread.sleep(10000);
			
		}

		@Test
		public void contacts_TC_03_swipe() throws Exception{
		
			Thread.sleep(3000);
			//Swiping from left to right
			TouchAction swp = new TouchAction(driver);
			swp.press(PointOption.point(27, 1148)).
			waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000))).
			moveTo(PointOption.point(1022, 1148)).release().perform();
			
			
			Thread.sleep(5000);
			
			swp = new TouchAction(driver);
			swp.press(PointOption.point(1022, 1148)).
			waitAction(new WaitOptions().withDuration(Duration.ofMillis(1000))).
			moveTo(PointOption.point(27, 1148)).release().perform();
			
			Thread.sleep(10000);
			
			
			
		}
// in your phone settings-> Developer options->Pointer location(enable)-> first
		
		/*
		 1. //
		 2. ClassName
		 3. Unique property for that locator
		 //android.widget.TextView[@content-desc='A Reliance']
		 //android.widget.TextView[@index='4']
		 //android.widget.TextView[@content-desc='A Reliance' and @index='4']
		   
		   
	driver.findelement(By.name("5"));
	driver.findelement(By.className("//android.widget.ImageButton"));
	driver.findelement(By.id("com.android.calculator2:id/digit_5"));
	driver.findelement(By.id("digit_5"));
	driver.findelement(By.xpath("//android.widget.ImageButton"));
	driver.findelement(By.xpath("//android.widget.Button[@content-desc='Delete']"));
	driver.findelement(By.xpath("//android.widget.Button[@text ='5' and @index='4']"));
	driver.findelement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_7') and @text ='7']"));
	driver.findelement(By.xpath("//android.widget.Button[@text='7']"));
	driver.findelement(By.xpath("//android.widget.Button[contains(@resource-id,'digit_7')]")); //digit_70 digit_7
	driver.findElement(MobileBy.AccessibilityId("A Reliance")).click();
		
		 * */
	}


