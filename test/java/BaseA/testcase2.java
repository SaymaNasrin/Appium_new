package BaseA;

import org.testng.annotations.Test;
import pages.first_terms_accept_page;

public class testcase2 extends baseappiumclass{
	
	@Test(priority = 1, enabled=true)
	
	public void close() {
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.close();
	}
	
	@Test(priority = 2, enabled=true)
	public void OpenCam() {
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.camera();
	}

	@Test(priority = 3, enabled=true)
	public void capture() {
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.capture();
	}
}
