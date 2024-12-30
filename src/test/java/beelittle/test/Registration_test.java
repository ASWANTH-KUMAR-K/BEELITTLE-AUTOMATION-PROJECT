package beelittle.test;

import org.testng.annotations.Test;

import beelittle.base.Beelittle_base;
import beelittle.page.Beelittle_registration_page;
import beelittle.page.Product_adding_page;
import beelittle.util.Excelutils;

public class Registration_test extends  Beelittle_base {
	@Test
	
	public void signup() throws InterruptedException 
	{
		
		Beelittle_registration_page rp=new Beelittle_registration_page(driver);
		rp.signup_click();
		rp.craete_account();
		String xl="D:\\automation\\selenium\\beelittle registration.xlsx";
		String sheet="sheet1";
		
		int rowCount=Excelutils.getRowCount(xl, sheet);
		System.out.println(rowCount);
		
		for (int i=1;i<=rowCount;i++)
		{
			int cellCount=Excelutils.getCellCount(xl, sheet, i);
			
			for(int j=0;j<cellCount;j+=3) 
			{	
				String firstname=Excelutils.getCellValue(xl, sheet, i, j);
				System.out.println("Email :"+firstname);
				  				
				String ph_number=Excelutils.getCellValue(xl, sheet, i, j+1);
				System.out.println("Password :"+ph_number);
				
				String mailid=Excelutils.getCellValue(xl, sheet, i, j+2);
				System.out.println("Password :"+mailid);
				
				
				rp.passvalues(firstname, ph_number, mailid);
				rp.create_button_click();
				rp.log_out_click();
				
				
				driver.get(url);
				
				rp.signup_click();
				rp.craete_account();
			}
		}
	}	

}
