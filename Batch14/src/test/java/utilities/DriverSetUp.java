package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {
	public WebDriver driver;
	
	
	@BeforeSuite //testNg annotation
	public void setDriver() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	@AfterSuite
	public void quitDriver() {
		driver.quit();
	}
}
