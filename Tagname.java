package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/Automation%20Assignment/TagName.html");
		driver.manage().window().maximize();
		
		
		//Identify the First Name field
		
		//For identifying the elements we need to inspect it
		
		//Right click on the page and click on inspect
		
		//WebElement ele = driver.findElement(By.tagName("input"));
		
		//ele.sendKeys("Testing");
		
		
		By loc = By.tagName("input");
		
		
		
		WebElement fname = driver.findElement(loc);
		
		fname.sendKeys("Selenium");
		
		fname.sendKeys("Performance");
		
		
		//driver.findElement(By.tagName("input")).sendKeys("Manual Testing");
		
		
		

	}

}
