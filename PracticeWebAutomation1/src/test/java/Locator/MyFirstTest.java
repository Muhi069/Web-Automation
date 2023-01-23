package Locator;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstTest {
	
//	@Test
//	public void testWebPageTitle() throws InterruptedException {
//		
//		WebDriver driver= new ChromeDriver();
//		
//		driver.get("https://www.techwithtim.net/");
////		WebElement title= driver.findElement(By.tagName("title"));
////		System.out.println(title.getAttribute("title"));
//		
//		System.out.println(driver.getTitle());
//		driver.manage().window().maximize();
//		assertEquals(driver.getTitle(), "Tech With Tim - Python & Java Programming Tutorials - techwithtim.net");
//		Thread.sleep(1000);
//		driver.close();
//	}
	
	
//	@Test
//	public void description() {
//		WebDriver driver= new ChromeDriver();
//		
//		driver.get("https://www.techwithtim.net/");
//		System.out.println(driver.getTitle());
//		driver.manage().window().maximize();
//		WebElement description= driver.findElement(By.xpath("//*[@id=\"panel-6-3-1-0\"]/div/div/h2"));
//		System.out.println(description.getText());
//		assertEquals(description.getText(), "What is techwithtim.net?");
//		driver.close();
//	}
	
//	
//	@Test
//	public void testByLinkText() throws InterruptedException {
//		WebDriver driver= new ChromeDriver();
//		
//		driver.get("https://www.techwithtim.net/");
//		System.out.println(driver.getTitle());
//		driver.manage().window().maximize();
//		WebElement linkText= driver.findElement(By.linkText("Python Programming"));
//		linkText.click();
//		Thread.sleep(3000);
//		driver.close();
//	}
	
	
	@Test
	public void searchBoxTesting() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techwithtim.net/");
		driver.manage().window().maximize();
		WebElement sBox= driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/label/input"));
		sBox.clear();
		sBox.sendKeys("Python");
		sBox.sendKeys(Keys.RETURN);  // selenium code for pressing ENTER key 
		
		Thread.sleep(1000);
		driver.close();
	}

}