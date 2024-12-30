package beelittle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_adding_page {
	

	WebDriver driver;
	@FindBy(xpath="//a[text()=\"Clothing\"]/child::span")
	WebElement clothing;   
	/////click
	@FindBy(xpath="//*[@id=\"ss-iaevvmt\"]")
	WebElement jabla_nappy;
	@FindBy(xpath="//img[@src=\"/aalam/stock/item/11190/image/_/face_img?size=xhdpi\"]")
	WebElement product;
	@FindBy(xpath="//*[@id=\"root\"]/div[5]/div/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/div[1]/input")
	WebElement pin;
	@FindBy(xpath="//*[@id=\"root\"]/div[5]/div/div[2]/div/div[2]/div[3]/div[2]/div/div[2]/div/span/span[1]")
	WebElement pin_click;
	@FindBy(xpath="//*[@id=\"root\"]/div[5]/div/div[2]/div/div[2]/div[6]/div/div[2]/span/span/span")
	WebElement add_to_cart;
	@FindBy(xpath="//*[@id=\"root\"]/div[5]/div/div[2]/div/div[2]/div[6]/div/div[2]/span/span")
	WebElement go_to_cart;
	@FindBy(xpath="//button/parent::div[@class=\"uk-width-expand uk-text-left uk-first-column\"]")
	WebElement checkout;
	@FindBy(name="mobilenum")
	WebElement mobile;
	@FindBy(xpath="/html/body/div[6]/div/div/div[2]/form/div[2]/button")
	WebElement login;
	
	
	
	
	public Product_adding_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clothing_click() {
		Actions act=new Actions(driver);
		act.moveToElement(clothing).perform();
		
	}
	
	public void jabla_nappy_click() {
		jabla_nappy.click();
		
	}
	public void product_click() throws InterruptedException {
		Thread.sleep(2000);
		product.click();
	}
	
	public void pin_pass(String pincode) throws InterruptedException {
		Thread.sleep(1000);
		pin.sendKeys(pincode);
	
	}
	
	public void pin_click() {
		pin_click.click();
	}
	
	public void go_to_cart_click() throws InterruptedException {
		Thread.sleep(2000);
		add_to_cart.click();
		Thread.sleep(2000);
		go_to_cart.click();
		
	}
	
	public void checkout_click() throws InterruptedException {
		Thread.sleep(2000);
		checkout.click();
		mobile.sendKeys("9074577022");
		login.click();
	}

}
