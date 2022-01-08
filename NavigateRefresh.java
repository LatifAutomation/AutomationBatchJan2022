package Navigation;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateRefresh {

	public static void main(String[] args) throws InterruptedException
{
		// TODO Auto-generated method stubChromeDriver driver=new ChromeDriver();
	      
		  ChromeDriver driver=new ChromeDriver();
		  
	      
	      driver.get("https://www.amazon.in/");
	      
	      String title1 = driver.getTitle();
	      System.out.println(title1);
	      
	      String url1 = driver.getCurrentUrl();
	      System.out.println(url1);
	      
	      Thread.sleep(5000);
	      
	      driver.navigate().to("https://www.facebook.com/");
	      
	      String title2 = driver.getTitle();
	      System.out.println(title2);
	      
	      String url2 = driver.getCurrentUrl();
	      System.out.println(url2);
	      
	      //Navigate Back Method
	      
	      Thread.sleep(3000);
	      
	      driver.navigate().back();
	      
	      String title3 = driver.getTitle();
	      System.out.println(title3);
	      
	      String url3 = driver.getCurrentUrl();
	      System.out.println(url3);
	      
	      Thread.sleep(3000);
	      
	      //Navigate Forward
	      
	      driver.navigate().forward();
	      
	      String title4 = driver.getTitle();
	      System.out.println(title4);
	      
	      String url4 = driver.getCurrentUrl();
	      System.out.println(url4);
	      
	      Thread.sleep(3000);
	      
	      //Refresh the page
	      
	     driver.navigate().refresh();
	     
	      String title5 = driver.getTitle();
	      System.out.println(title5);
	      
	      String url5= driver.getCurrentUrl();
	      System.out.println(url5);
	      
	     
	}

}
