package Locator;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import utility.Driver;

public class TabAndWindowHandler extends Driver{
	
	
	@Test
	public void newTab() throws InterruptedException {
		driver.get("https://www.amazon.com/ref=nav_logo");
		/*
		 *  open link in new tab syntax:
		 *  	String clicklnk= Keys.chord(Keys.CONTROL,Keys.ENTER);
		 *  	driver.findElement(By.xpath(. .).sendKeys(clinklnk);
		 *  
		 *  this is another syntax but this doesn't work too:
		 *  	driver.findElement(By.xpath(. .).sendKeys(Keys.CONTROL +"t")
		 */
		
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("span[class=\"hm-icon-label\"]")).click();
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@type= 'text']"));
		searchBox.sendKeys("Samsung Galaxy S22 Ultra");
		driver.findElement(By.cssSelector("input[id= 'nav-search-submit-button']")).click();
		Thread.sleep(2000);
		
		//daraz site e gelam
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.daraz.com.bd/#");
		WebElement sBox= driver.findElement(By.cssSelector("input[type='search']"));
		sBox.sendKeys("Samsung Galaxy S22 ULTRA 5G");
		driver.findElement(By.cssSelector("button[class='search-box__button--1oH7'")).click();
		Thread.sleep(2000);

		
		//back to amazon 
		List<String> windowHandleList= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowHandleList.get(0));
		Thread.sleep(2000);
		
		WebElement searchBox1= driver.findElement(By.xpath("//input[@type= 'text']"));
		searchBox1.clear();
		Thread.sleep(2000);
		searchBox1.sendKeys("Spigen cover");
		searchBox1.click();
		Thread.sleep(2000);
		
		//open faceBook
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		
		// print all tab information
		System.out.println(windowHandleList.size());
		for(int i=0; i<windowHandleList.size(); i++) {
			System.out.println(windowHandleList.get(i));
		}
	}
}
