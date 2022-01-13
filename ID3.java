package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ID3 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//Search box
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
        driver.findElement(By.id("nav-search-submit-button")).click();
      
		
	}

}
