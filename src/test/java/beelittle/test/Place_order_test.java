package beelittle.test;

import java.io.IOException;

import org.testng.annotations.Test;

import beelittle.base.Beelittle_base;
import beelittle.page.Place_order_page;
import beelittle.page.Product_adding_page;

public class Place_order_test extends Beelittle_base {
	@Test
	
	
	public void placeorder_payment_section() throws InterruptedException, IOException {
		 Product_adding_page pd=new  Product_adding_page(driver);
		 pd.clothing_click();
		 pd.jabla_nappy_click();
		
		 pd.product_click();
		
		 pd.go_to_cart_click();
		 pd.checkout_click();
		Place_order_page po=new Place_order_page(driver);
	//	Thread.sleep(2000);
		po.payment_mode_selection_click();
		Thread.sleep(2000);
		po.place_order_button();
	}

}
