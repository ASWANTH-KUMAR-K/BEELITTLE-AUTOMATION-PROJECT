package beelittle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Beelittle_login_page {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"ss-iwfna9g\"]")
	WebElement login;
	@FindBy(name="mobile")
	WebElement mobile;
	@FindBy(xpath="//*[@id=\"root\"]/div[5]/div/div/div/div/div/div/form/div[2]/button")
	WebElement log_in;
	
	
	public Beelittle_login_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void login_click() {
		
		login.click();
		
	}
	public void valuepass(String mail) throws InterruptedException {
		Thread.sleep(2000);
	//	mobile.click();
		mobile.sendKeys(mail);
		
	}
	
	public void login_button_click() {
		log_in.click();
	}
	

}


