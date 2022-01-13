package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/Automation%20Assignment/ID.html");
		
		driver.manage().window().maximize();
		
		//First Name
		
		WebElement fname = driver.findElement(By.tagName("input"));
		fname.sendKeys("Manual");
		
		//Middle Name
		
		WebElement middname = driver.findElement(By.id("mname"));
		middname.sendKeys("Selenium");
		
		//Last Name
		
		WebElement lasname = driver.findElement(By.id("lname"));
		lasname.sendKeys("Performance");

	}

}
