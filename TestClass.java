package PageObjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.browserstack.com/");
		
		driver.manage().window().maximize();
		
		HomePage hp=new HomePage(driver);
		
		hp.headerVerify();
		hp.validateURL();
		hp.clickOnGetFree();
		
		System.out.println(" Free Account Execution Started");
		FreeTrial ft=new FreeTrial(driver);
		
		ft.verifyHeader();
		ft.enterFullName("Pramod Borude");
		ft.enteremail("pramodborude728@gmail.com");
		ft.enterPass("Test@1234");
		Thread.sleep(300);
		ft.checkboxClick();
		Thread.sleep(300);
		ft.clickSignUp();
		
		
		
	}

}
