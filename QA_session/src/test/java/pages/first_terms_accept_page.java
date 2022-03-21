package pages;

import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class first_terms_accept_page {
	
	public first_terms_accept_page(AppiumDriver<MobileElement> driver)
	 {
		 PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	 }
	
	
	@AndroidFindBy (id = "permission_allow_button") MobileElement clickBtn;
	
	
	public void btn() {
		clickBtn.click();
	}
	
	@AndroidFindBy (id = "com.apple.movetoios:id/agree_button") MobileElement agreeBtn;
	
	public void agrBtn() {
		agreeBtn.click();
	}
	
	@AndroidFindBy (id = "search") MobileElement clickIcon;
	
	public void iconbtn() {
		clickIcon.click();
	}
	
	@AndroidFindBy (id = "search_src_text") MobileElement textField;
	
	public void search(String name) {
		textField.click();
		textField.clear();
		textField.sendKeys(name);
	}
	
	@AndroidFindBy (id = "search_close_btn") MobileElement closeBtn;
	public void close() {
		closeBtn.click();
	}
	
	@AndroidFindBy (id = "open_camera") MobileElement openCamera;
	
	public void camera() {
		openCamera.click();
	}
	
	@AndroidFindBy (id = "shutter_button") MobileElement clickPicture;
	
	public void capture() {
		clickPicture.click();
	}
}

