package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/Automation%20Assignment/Name.html");
		
		driver.manage().window().maximize();
		
		
		//First name
		
		
		driver.findElement(By.tagName("input")).sendKeys("Testing");
		
		//Middle Name
		
		driver.findElement(By.id("mname")).sendKeys("Manual Testing");
		
		//Last Name
		driver.findElement(By.name("lastnam")).sendKeys("Automation Testing");

	}

}
