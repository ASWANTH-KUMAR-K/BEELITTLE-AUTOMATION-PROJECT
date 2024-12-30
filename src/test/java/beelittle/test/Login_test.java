package beelittle.test;

import org.testng.annotations.Test;

import beelittle.base.Beelittle_base;
import beelittle.page.Beelittle_login_page;
import beelittle.util.Excelutils;

public class Login_test extends Beelittle_base{
	@Test
	
	public void login() throws InterruptedException {
		
		Beelittle_login_page lp=new Beelittle_login_page(driver);
		lp.login_click();
		String xl="D:\\automation\\selenium\\Beelittle_login.xlsx";
		String sheet="Sheet1";
		
		int rowCount=Excelutils.getRowCount(xl, sheet);
		System.out.println(rowCount);
		
		for (int i=1;i<=rowCount;i++)
		{
			int cellCount=Excelutils.getCellCount(xl, sheet, i);
			String Email=Excelutils.getCellValue(xl, sheet, i, 0);
			System.out.println("Email :"+Email);
				
				
				lp.valuepass(Email);
				lp.login_button_click();
				
				//login veri
				String actualurl=driver.getCurrentUrl();
				String expctdurl="https://www.beelittle.in/store/auth";
				
				if(actualurl.equals(expctdurl)) 
				{
					System.out.println("Log in fail");
					driver.get(url);
				}
				else 
				{
					
					System.out.println("Log in sucess");
					
				}
				lp.login_click();
				
			}
			
			
		
				  				
	}

}
