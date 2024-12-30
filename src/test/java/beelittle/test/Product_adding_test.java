package beelittle.test;

import org.testng.annotations.Test;

import beelittle.base.Beelittle_base;
import beelittle.page.Beelittle_login_page;
import beelittle.page.Product_adding_page;

public class Product_adding_test extends Beelittle_base {
	@Test
	
	
	public void product_adding() throws InterruptedException {
		/*Beelittle_login_page lp=new Beelittle_login_page(driver);
		lp.login_click();
		lp.valuepass("9074577022");
		lp.login_button_click();*/
		 Product_adding_page pd=new  Product_adding_page(driver);
		 pd.clothing_click();
		 pd.jabla_nappy_click();
		
		 pd.product_click();
		 //pd.pin_pass("670002");
		 ///pd.pin_click();
		 pd.go_to_cart_click();
		 pd.checkout_click();
	}

}

