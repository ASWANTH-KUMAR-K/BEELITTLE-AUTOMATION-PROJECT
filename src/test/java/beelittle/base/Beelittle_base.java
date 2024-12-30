package beelittle.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Beelittle_base {
	public static WebDriver driver;
	public String url="https://www.beelittle.in/";
	@BeforeTest
	public void setup() {
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		
		
	}
	

}
