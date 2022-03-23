package BaseA;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class baseappiumclass {

	public AppiumDriver<MobileElement> driver;
	String platform;
	
	@BeforeClass
	public void setup() throws Exception {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("platformName", "android");
		caps.setCapability("platformVersion", "12");
		caps.setCapability("deviceName", "emulator-5554");
		caps.setCapability("appPackage", "com.simplemobiletools.gallery");
		caps.setCapability("appActivity", "com.simplemobiletools.gallery.activities.MainActivity");
		caps.setCapability("app", "/Users/saymanasrin/Downloads/appium/simple-gallery.apk");
		caps.setCapability("fullReset", false);
		caps.setCapability("noReset", true);
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,caps);
		
	
		
	}
	@AfterSuite
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
