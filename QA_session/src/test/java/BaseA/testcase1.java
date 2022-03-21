package BaseA;

import org.testng.annotations.Test;

import pages.first_terms_accept_page;

public class testcase1 extends baseappiumclass {
	public void SearchP() {
		
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.btn();		
	}
	
	public void Agree() {
		first_terms_accept_page firsttermpage = new first_terms_accept_page(driver);
		firsttermpage.agrBtn();
	}

}
