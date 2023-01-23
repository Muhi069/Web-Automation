package handle_web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetUp;

public class TC03_iFrameCheckBoxRadioButton extends DriverSetUp{
	
	@Test
	public void testRadioButton() throws InterruptedException {
		driver.get("https://jqueryui.com/checkboxradio/");
		
		
		
		driver.switchTo().frame(0); //iFrame by index, iframe e dhuklam
		WebElement radiobutton1= driver.findElement(By.cssSelector("label[for='radio-1']"));
		radiobutton1.click();
		
		driver.switchTo().defaultContent(); //iframe theke ber holam
		WebElement title= driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		System.out.println(title.getText());
		
		WebElement iFrame= driver.findElement(By.xpath("//iFrame[@class= 'demo-frame']"));
		driver.switchTo().frame(iFrame); //iFrame by webelement
		
		WebElement radioButton2= driver.findElement(By.cssSelector("label[for='radio-2']"));
		radioButton2.click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("label[for='checkbox-4']")).click();
		driver.findElement(By.cssSelector("label[for='checkbox-3']")).click();
		Thread.sleep(3000);
		
	}
}
