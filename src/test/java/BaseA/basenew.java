package BaseA;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
public class basenew {
	public AppiumDriver<MobileElement> driver;
	String platform;
	
	public void setup() throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
this.platform = "android";
		
		if (platform.equalsIgnoreCase("Android")) {
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "12");
			caps.setCapability("deviceName", "emulator-5554");
			caps.setCapability("appPackage", "com.jayway.contacts");
			caps.setCapability("appActivity", "com.jayway.contacts.MainActivity");
			caps.setCapability("app", "/Users/saymanasrin/Downloads/appium/Contacts.apk");
			caps.setCapability("fullReset", false);
			caps.setCapability("noReset", true);
		
		}
		else if (platform.equalsIgnoreCase("iOS")){
			
			caps.setCapability("platformName", "iOS");
			caps.setCapability("platformVersion", "12");
			caps.setCapability("deviceName", "emulator-5554");
			caps.setCapability("app", "/Users/saymanasrin/Downloads/appium/ContactsSimulator.app");
			
		 	
		}
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,caps);
	
	}
	
}




	u