package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName2 {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/pc/Desktop/Automation%20Assignment/tagName2.html");
		
		driver.manage().window().maximize();
		
		//first Name--> Pramod
		
		WebElement fname = driver.findElement(By.tagName("input"));
		
		fname.sendKeys("gfgfg");
		
		//Middle Name
		
		WebElement mname = driver.findElement(By.tagName("input"));
		mname.sendKeys("XYZ");
		
		//Last Name
		
		WebElement lname = driver.findElement(By.tagName("input"));
		
		lname.sendKeys("hghgh");
		
		
	}

}
