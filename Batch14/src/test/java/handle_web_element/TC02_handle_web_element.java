package handle_web_element;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import utilities.DriverSetUp;

public class TC02_handle_web_element extends DriverSetUp {
	
	public String base_url= "https://rahulshettyacademy.com/AutomationPractice/";
	
	
	@Test
	public void navigateToWebPage() throws InterruptedException {
		driver.get(base_url);
		driver.navigate().to("https://rahulshettyacademy.com/documents-request"); // doesn't wait to load the page completely
		driver.navigate().back();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
	
	
	@Test
	public void dandleBrowserWindow() throws InterruptedException {
		driver.get(base_url);
		Thread.sleep(3000);
//		driver.switchTo().newWindow(WindowType.TAB);
//		Thread.sleep(3000);
//		driver.get(base_url);
//		
//		Thread.sleep(2000);
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get(base_url);
//		
//		driver.close(); // driver current je tab e ase oita close kore dibe 
		
		
		driver.findElement(By.xpath("//*[@id=\"openwindow\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"opentab\"]")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		List<String> windowhandleList= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windowhandleList.get(0));
		System.out.println(windowhandleList.get(1));
		System.out.println(windowhandleList.get(2));
		
		driver.switchTo().window(windowhandleList.get(1));
		System.out.println(driver.getTitle());
		System.out.println(windowhandleList.get(1));
		
		driver.switchTo().window(windowhandleList.get(2));
		System.out.println(driver.getTitle());
		System.out.println(windowhandleList.get(2));
	}
}
