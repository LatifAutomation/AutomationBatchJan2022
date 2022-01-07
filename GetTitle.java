package Sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/electronics");
		
		driver.manage().window().maximize();
		
		String expectedtitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";

		//System.out.println(driver.getTitle());
		
		String actualtitle = driver.getTitle();
		
		System.out.println(actualtitle);
		
		if(expectedtitle.equals(actualtitle))
		{
		    
			System.out.println("Test case got pass");
		}
		
		else
		{
			System.out.println("Test case got Failed");
		}

	}

}
