package Sample;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		Point p=new Point(278,125);
		
		driver.manage().window().setPosition(p);
		
		int xco = driver.manage().window().getPosition().getX();
		System.out.println(xco);
		
		int yco = driver.manage().window().getPosition().getY();
		System.out.println(yco);
		
	}

}
