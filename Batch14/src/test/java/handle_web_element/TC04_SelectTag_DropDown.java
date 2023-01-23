package handle_web_element;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilities.DriverSetUp;

public class TC04_SelectTag_DropDown extends DriverSetUp{
	
	@Test
	public void testRadioButton() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement selectOption= driver.findElement(By.id("dropdown-class-example"));
		selectOption.click();
		
		Select select= new Select(selectOption); // selenium select class for dropdown and choose options
		select.selectByIndex(2);
		
		SoftAssert softAssert= new SoftAssert();
		
		assertEquals(select.getFirstSelectedOption().getText(), "Option2");
		Thread.sleep(2000);
		
		select.selectByValue("option3");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Option1");
		Thread.sleep(2000);
		
		//deselect: selected gula unselect 
		
		System.out.println(select.getOptions().size());
		System.out.println(select.getOptions().get(2).getText());
	}
}
