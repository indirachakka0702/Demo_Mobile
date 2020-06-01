package Demp_Mobile.Demp_Mobile;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;

public class TestBase {

	public static AndroidDriver<WebElement> driver=null;
	public static AndroidUtils oU_Android = new AndroidUtils();
	public String sAppName = "";
	public static commonUtils oU_Comm = new commonUtils();
	@BeforeSuite
	public void TriggerinBeforeSuiteDependency() throws Exception{
		oU_Comm.loadPropertyFiles(System.getProperty("user.dir")+"//conf.properties.txt");
		oU_Android.launchApp(System.getProperty("appNameToLaunch"));
	}
	@AfterSuite
	public void closeApp() throws Exception{
		driver.quit();
	}
}
