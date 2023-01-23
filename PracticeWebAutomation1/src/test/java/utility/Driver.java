package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Driver {
	public WebDriver driver;
	
	
	@BeforeSuite
	public void setDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@AfterSuite
	public void endDriver() {
		driver.quit();
	}
}
