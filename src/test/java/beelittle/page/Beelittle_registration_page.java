package beelittle.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Beelittle_registration_page {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"ss-iwfna9g\"]")
	WebElement signup;
	@FindBy(xpath="//*[@id=\"root\"]/div[5]/div/div/div/div/div/div/form/div[3]/a/span[2]")
	WebElement create_account;
	@FindBy(name="first_name")
	WebElement first_name;
	@FindBy(name="mobile")
	WebElement mobile_number;
	@FindBy(name="email_id")
	WebElement email_id ;
	@FindBy(xpath="//*[@id=\"root\"]/div[5]/div/div/div/div/div/div/form/div[4]/button")
	WebElement sign_up;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/nav/div[2]/div[5]/div/a")
	WebElement sign_log;
	
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/nav/div[2]/div[5]/div/div/ul/li[7]/a")
	WebElement log_out;
	
	
	
	public Beelittle_registration_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void signup_click() throws InterruptedException {
		Thread.sleep(2000);
		signup.click();
	}
	public void craete_account() throws InterruptedException{
		Thread.sleep(2000);
		create_account.click();
	}	
	
	public void passvalues(String fname,String m_number,String mail_id ) throws InterruptedException {
		first_name.sendKeys(fname);
		mobile_number.sendKeys(m_number);
		email_id.sendKeys(mail_id);
		
		
		
	}
	
	
	public void create_button_click() throws InterruptedException {
		sign_up.click();
		Thread.sleep(2000);
		
	}
	
	public void log_out_click() throws InterruptedException {
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		//WebElement circle=driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/nav/div[2]/div[5]/div/a/span/svg/circle[2]"));
		act.moveToElement(sign_log).perform();
		Thread.sleep(2000);
		log_out.click();
		
	}
	
	
	

}
