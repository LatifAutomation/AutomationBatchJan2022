package Sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstScript {

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.gecko.driver", "D://chromedriver.exe");
		
		//ChromeDriver driver=new ChromeDriver();
		
		ChromeDriver sonali=new ChromeDriver();
				
		sonali.get("https://www.facebook.com/");
		
		sonali.manage().window().maximize();
		sonali.close();
		
		//mohina.get("https://www.amazon.in/");
		
		//mohina.close();
		
		
		

	}

}
