package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/pc/Desktop/Automation%20Assignment/LinkText.html");
		driver.manage().window().maximize();
		
		//Link1
		
		
		String lname = driver.findElement(By.partialLinkText("2")).getText();
		System.out.println(lname);
		
		
	}

}
