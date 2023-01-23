package Locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.DriverSetUp;

public class MyFirstWebTest extends DriverSetUp{

	/*@Test
	public void testWebPageTitle() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.7.2");
		// System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		assertEquals(driver.getTitle(), "Maven Repository: org.seleniumhq.selenium » selenium-java » 4.7.2");

		Thread.sleep(3000);
		driver.quit();
	}

	public void description() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.7.2");
		// System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		WebElement description = driver.findElement(By.className("im-description"));
		assertEquals(description.getText(),
				"Selenium provides support for the automation of web browsers. It provides extensions to emulate user interaction with browsers, a distribution server for scaling browser allocation, and the infrastructure for implementations of the W3C WebDriver specification.");
		driver.quit();

	}*/
	
	/*@Test

	public void testNameByLink() {
	
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
			driver.manage().window().maximize();
			WebElement name = driver.findElement(By.linkText("WebDriverManager"));
			assertEquals(name.getText(),"Automated driver management and other helper features for Selenium WebDriver in Java");
			driver.quit();
		}*/
	
	@Test
	public void testSearchFieldByID() throws InterruptedException{
		
		driver.get("https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager/5.3.1");
		WebElement searchInput= driver.findElement(By.id("query"));
		searchInput.sendKeys("testng");
		WebElement searchButton= driver.findElement(By.xpath("//*[@id=\"search\"]/form/input[2]"));
		searchButton.click();
		Thread.sleep(5000);
		
		assertEquals(driver.getTitle(), "Maven Repository: testng");
		Thread.sleep(10000); 
		
		
		driver.quit();
	}
	
	
}

	

