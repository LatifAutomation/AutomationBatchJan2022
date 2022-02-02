package PageObjectmodel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{

	//Identify the elements
	
	WebDriver ldriver;
	By header=By.xpath("//h1[text()='App & Browser Testing Made Easy']");
	By signin=By.linkText("Sign in");
	By getfree=By.id("signupModalButton");
	String expectedurl="https://www.browserstack.com/";
	
	
	public HomePage(WebDriver driver) 
	{
		this.ldriver=driver;
	}
	
	
	public void headerVerify()
	{
		String actualtext = ldriver.findElement(header).getText();
		
		assertEquals("App & Browser Testing Made Easy",actualtext);
     }
	
	public void validateURL()
	{
		
		assertEquals(expectedurl,ldriver.getCurrentUrl());
	}

	
	public void clickOnGetFree()
	{
		
		ldriver.findElement(getfree).click();
		
	}
	
	
}
