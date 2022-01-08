package Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTo {

	public static void main(String[] args) throws InterruptedException 
	{
       
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//driver.navigate().to("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
		
		Thread.sleep(300);
		
		driver.navigate().to("https://www.facebook.com/");
		
	}

}
