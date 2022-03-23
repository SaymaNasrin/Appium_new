package BaseA;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pages.first_terms_accept_page;

public class testcase1 extends baseappiumclass {
	
	@Test(priority = 1, enabled=true)
	public void SearchP() {
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.btn();		
	}
	
	@Test(priority = 2, enabled=true)
	public void Agree() {
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.agrBtn();
	}
    @Test (priority = 2, enabled=true)
	public void Icon() {
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.iconbtn();
	}
	@Test(priority = 4, enabled=true)
	
	public void SearchText() {
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.search("image");
	}
}
