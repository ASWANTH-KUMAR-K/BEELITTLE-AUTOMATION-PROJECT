package beelittle.page;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Place_order_page {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"payment_options\"]/div[2]/div/div/div/div/div[1]/label/input")
	WebElement  payment_selection;
	@FindBy(xpath="(//span[text()=\"Place Order\"])[1]")
	WebElement place_order;








	public Place_order_page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void payment_mode_selection_click() throws InterruptedException, IOException {
		//Thread.sleep(2000);


		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

		//js.executeScript("window.scrollBy(0,2000)", "");
		//WebElement ele=driver.findElement(By.xpath("//*[@id=\"red_container_main\"]/div[47]/h5/a/img"));//to scroll up to selected portion
		//	js.executeScript("arguments[0].scrollIntoView(true);", total);

		Thread.sleep(2000);



	}

	public void place_order_button() throws InterruptedException, IOException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		payment_selection.click();


		Thread.sleep(2000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("D:\\automation\\selenium\\eclipse\\com.beelittle\\beelittle_screenshot\\placeorder1.png"));

		place_order.click();

	}










}
