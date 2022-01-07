package Sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) 
	{
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		
		//driver.close();
		
		driver.quit();
		
		
		

	}

}
