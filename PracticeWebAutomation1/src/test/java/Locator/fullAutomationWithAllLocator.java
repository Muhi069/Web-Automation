package Locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utility.Driver;

public class fullAutomationWithAllLocator extends Driver{
	
	@Test
	public void doAll() throws InterruptedException {
		//click the drop down
		driver.get("https://www.amazon.com/ref=nav_logo"); 
		driver.getTitle();
		System.out.println(driver.getTitle());
	}
	
	
	//this doesn't run
//	@Test
//	public void testing2() throws InterruptedException {
//		driver.get("https://www.amazon.com/ref=nav_logo"); 
//		WebElement click= driver.findElement(By.xpath("//*[@id=\"8xx2LnqkW4ycEo9ohuHWAw\"]/div[2]/a/div/img"));
//		click.click();
//		Thread.sleep(2000);
//	}

	
	
	//kaj kam automate
	@Test
	public void testing() throws InterruptedException {
		driver.get("https://www.amazon.com/ref=nav_logo"); 
		WebElement dropDown= driver.findElement(By.cssSelector("select[aria-describedby='searchDropdownDescription'][title='Search in']"));
		//WebElement dropDown= driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		dropDown.click();
		Thread.sleep(2000);
		
		//search something
		WebElement searchBox= driver.findElement(By.xpath("//input[@type= 'text']"));
		searchBox.sendKeys("akko keycaps");
		WebElement searchButton= driver.findElement(By.cssSelector("input[id= 'nav-search-submit-button']"));
		searchButton.click();
		Thread.sleep(3000);
		
		//click a search result
		WebElement imageSelect= driver.findElement(By.cssSelector("div[class= 'a-section aok-relative s-image-fixed-height']>img[alt *='Akko Hot Swappable']")); 
		//cssSelector parent child method
		
		//driver.switchTo().newWindow(WindowType.TAB); //new tab open er code 
		imageSelect.click();
		Thread.sleep(2000);
		
		
		
	}
	
	
	// mouse hover on webpage
	@Test
	public void mouseHover() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement hover= driver.findElement(By.xpath("//button[@id= 'mousehover']"));
		Actions action= new Actions(driver);
		action.moveToElement(hover).perform();
		Thread.sleep(2000);
	}
	/*
	 * 	mouse hover action code:
	 * 		webelement x= driver.findElement(by.xpath());
	 * 		Actions action= new Actions(driver);
	 * 		action.moveToElement(x).perform();
	 */
	
	
	@Test
	public void print() {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement amount= driver.findElement(By.xpath("//div[@class= 'totalAmount']"));
		System.out.println(amount.getText());
	}
	
	
	// find Elements er implementation 
	@Test
	public void Elements() throws InterruptedException {
		driver.get("https://www.techwithtim.net/");
		List<WebElement> elements= driver.findElements(By.xpath("//* [@type]"));
		System.out.println("Number of elements: " +elements.size());
		
		for(int i=0; i<elements.size(); i++) {
			System.out.println("Names: " +elements.get(i).getAttribute("value"));
		}
		
		Thread.sleep(2000);
	}
	
	
	
	@Test
	public void locateCheckBoxMultipleAttributeBycssSelector() throws InterruptedException{ //CheckBox Multiple Attribute by one cssSelector(element locatoe)
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> checkBox1 = driver.findElements(By.cssSelector("input[type='checkbox']"));
		checkBox1.get(0).click();
		checkBox1.get(1).click();
		checkBox1.get(2).click();
		Thread.sleep(2000);
	}
	
	
	@Test // (priority= 1, description= "something message")
	public void PixelSearch() throws InterruptedException {
		driver.get("https://www.amazon.com/ref=nav_logo");
		WebElement searchBox= driver.findElement(By.xpath("//input[@type= 'text']"));
		searchBox.sendKeys("Google pixel phones");
		WebElement searchButton= driver.findElement(By.cssSelector("input[id= 'nav-search-submit-button']"));
		searchButton.click();
		WebElement dropDown= driver.findElement(By.xpath("//span [@class= 'a-dropdown-label']"));
		dropDown.click();
		WebElement HtoL= driver.findElement(By.xpath("// a [@class= 'a-dropdown-link'][@id= 's-result-sort-select_2']"));
		HtoL.click();
		Thread.sleep(3000);
		WebElement highest= driver.findElement(By.cssSelector("div[class= 'a-section aok-relative s-image-fixed-height'] > img[alt *= 'Google Pixel 7 Pro - 5G']"));
		highest.click();
		WebElement colorSelect= driver.findElement(By.cssSelector("input[aria-labelledby=\"color_name_1-announce\"]"));
		colorSelect.click();
		WebElement rom= driver.findElement(By.cssSelector("input[aria-labelledby=\"size_name_1-announce\"]"));
		rom.click();
		WebElement addToList= driver.findElement(By.xpath("//a[@class='a-button-text a-text-left']"));
		addToList.click();
		Thread.sleep(6000);
	
		
	}
}
