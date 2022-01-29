package DropDownHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class GetOptions {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		// Identify the drop down
		WebElement drp = driver.findElement(By.id("searchDropdownBox"));
		
		// Create the object of 
		
		Select sel=new Select(drp);
		
		
		
		
		List<WebElement> opts = sel.getOptions();
		
		int sz = opts.size();
		
		Assert.assertEquals(42, sz);
		
		System.out.println(sz);
		
		for(int i=0;i<sz;i++)
		{
			WebElement ele = opts.get(i);
			String txt = ele.getText();
			System.out.println(txt);
			
			
		}
		
		
		
		
		
		

	}

}
