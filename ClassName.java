package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) 
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/Automation%20Assignment/ClassName.html");
		driver.manage().window().maximize();
		
		//First Name
		driver.findElement(By.tagName("input")).sendKeys("Manual");
		
		// Middle name
		
		driver.findElement(By.id("A")).sendKeys("Automation");
		
		//Last Name
		
		driver.findElement(By.name("lname")).sendKeys("Testing");
		
		//Current Address
		driver.findElement(By.name("address")).sendKeys("Pune");
		
		//Permanannt Address
		
		driver.findElement(By.className("paddress")).sendKeys("Mumbai");
		

	}

}
