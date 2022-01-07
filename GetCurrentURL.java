package Sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//import junit.framework.Assert;

public class GetCurrentURL {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		String expectedurl = "https://www.facegrfrrtbook.com/";
		
		String actualurl = driver.getCurrentUrl();
		
		System.out.println(actualurl);
		
		if(expectedurl.equals(actualurl))
		{
			System.out.println("Test case passed");
		}
		
		else
		{
			System.out.println("Test case Failed");
		}
	}

		
		
	
		
}
