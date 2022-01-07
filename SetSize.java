package Sample;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//Dimension d=new Dimension(350,280);
		
		//driver.manage().window().setSize(d);
		
		
		int wdt = driver.manage().window().getSize().getWidth();
		System.out.println(wdt);
		
		
		
		int hght = driver.manage().window().getSize().getHeight();
		System.out.println(hght);
		

	}

}
