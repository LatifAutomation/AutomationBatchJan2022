package AlertsandPopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://chercher.tech/practice/popups");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("confirmation")).click();
		
		
		Alert alt=driver.switchTo().alert();
		
		String alerttext = alt.getText();
		System.out.println(alerttext);
		
		//Ok button
		
		//alt.accept();
		
		//Cancel button
		alt.dismiss();
		
		
		
	}

}
