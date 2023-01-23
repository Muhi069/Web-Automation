package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.DriverSetUp;

public class Locator_learning_Advance extends DriverSetUp{
	
	@Test
	public void LocateRadioButtonByCssSelector() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio= driver.findElement(By.cssSelector("input[value= \"radio1\"]"));
		radio.click();
		Thread.sleep(2000);
		
	}
	/*
	 * 	syntax: tagname[attribute= 'value']
	 */
	
	
	
	@Test
	public void LocateRadioButtonByXpath() throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement radio2= driver.findElement(By.xpath("//input[@value= 'radio2']"));
		radio2.click();
		Thread.sleep(2000);
		
	}
	/*
	 * 	syntax: //tagname[@attribute= 'value']
	 */
	
	
	
	@Test
	public void LocateHeadingByCssSelectorTagName() throws InterruptedException {  //this is cssselector but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement h1= driver.findElement(By.cssSelector("h1"));
		System.out.println(h1.getText());
		Thread.sleep(2000);
		
	}
	
	
	
	@Test
	public void LocateHeadingByXpathTagName() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement h1= driver.findElement(By.xpath("//h1"));
		System.out.println(h1.getText());
		Thread.sleep(2000);
	}
	
	//
	
	
	
	@Test
	public void LocateRadioButtonByCssSelectorDirectChild() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement RadioButton= driver.findElement(By.cssSelector("fieldset> legend "));
		System.out.println(RadioButton.getText());
		Thread.sleep(2000);
	}
	/*
	 * 	syntax: parent_tagname > parent er ekdom porer child tagname
	 */
	
	
	
	@Test
	public void LocateRadioButtonByXpathDirectChild() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement RadioButton= driver.findElement(By.xpath("//fieldset /legend "));
		System.out.println(RadioButton.getText());
		Thread.sleep(2000);
	}
	/*
	 * 	syntax: //parent_tagname /parent er ekdom porer child tagname
	 */
	
	
	
	@Test
	public void LocateCheckboxByCssSelectorMultipleAttribute() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBox1= driver.findElement(By.cssSelector("input[type='checkbox'][name='checkBoxOption1']"));
		checkBox1.click();
		Thread.sleep(2000);
	}
	/*
	 *	syntax: tagname[attribute= 'value'][attribute= 'value']
	 */
	
	
	
	@Test
	public void LocateCheckboxByXpathMultipleAttribute() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement checkBox1= driver.findElement(By.xpath("//input[@type= 'checkbox' and @name= 'checkBoxOption1']"));
		checkBox1.click();
		Thread.sleep(2000);
	}
	/*
	 * 	syntax: //tagname[@attribute= 'value' and @attribute= 'value']
	 */
	
	
	
	@Test
	public void LocateDropDownByCssSelectorSubStringAttribute() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDown= driver.findElement(By.cssSelector("select[id *= 'dropdown-class']"));
		dropDown.click();
		Thread.sleep(2000);
	}
	/*
	 *  css selector sub string locator:
	 *  tagname[attribute *= "value"] -> input[id *= 'dropdown-calss']
	 */
	
	
	@Test
	public void LocateDropDownByXpathSubStringAttribute() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDown= driver.findElement(By.xpath("//select[contains(@id, 'dropdown-class')]"));
		dropDown.click();
		Thread.sleep(2000);
	}
	/*
	 * xpath sub stirng lcoator:
	 *    //<tagname>[contains(@attribute, 'value')]  
	 */
	
	
	
	@Test
	public void LocateDropDownByXpathStartsWithSubStringAttribute() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDown= driver.findElement(By.xpath("//select[starts-with(@id, 'dropdown-class')]"));
		dropDown.click();
		Thread.sleep(2000);
	}
	/*
	 *    xpath selector starts-with substring
	 *    //<tagname>[starts-with(@attribute, 'value')] 
	 */
	
	
	
	@Test
	public void LocateDropDownByCssSelecotorStartsWithSubStringAttribute() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDown= driver.findElement(By.cssSelector("select[id^= 'dropdown-class']"));
		dropDown.click();
		Thread.sleep(2000);
	}
	/*
	 * css selector starts with sub string 
	 * 	<tagname>[attribute ^= "value"] -> input[id ^= 'dropdown-calss']
	 */
	
	
	
	//this does not work. css ends with substring 
	@Test
	public void LocateDropDownByCssSelecotorEndsWithSubStringAttribute() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDown= driver.findElement(By.cssSelector("select[id $= 'class']"));
		dropDown.click();
		Thread.sleep(2000);
	}
	/*
	 *  ends with sub string css selector
	 *  	 tagname[attribute $= 'sub string value']
	 */
	
	
	
	// this also does not work. 
	@Test
	public void LocateDropDownByXpathWithNoTagName() throws InterruptedException {  //this is xpath but with tag name only
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement dropDown= driver.findElement(By.xpath("//*[@select= 'dropdown-class']"));
		dropDown.click();
		Thread.sleep(2000);
	}
	
	
}

