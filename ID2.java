package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//Email Address
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		
		//Password
		
		WebElement pwd = driver.findElement(By.id("pass"));
		pwd.sendKeys("Test@1234");
		

	}

}
