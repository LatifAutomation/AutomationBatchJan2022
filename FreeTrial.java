package PageObjectmodel;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FreeTrial 
{
  WebDriver driver;
	
	By header=By.xpath("//h1[contains(text(),'FREE Account')]");
	By fname=By.id("user_full_name");
	By email=By.id("user_email_login");
	By pwd=By.id("user_password");
	By chkbox=By.id("tnc_checkbox");
	By signup=By.id("user_submit");
	
	
	
	public FreeTrial(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void verifyHeader()
	{
		System.out.println(driver.findElement(header).getText());
		assertEquals("Create a FREE Account",driver.findElement(header).getText());
	}
	
	public void enterFullName(String name)
	{
		driver.findElement(fname).sendKeys(name);
		
	}
	
	public void enteremail(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	
	public void enterPass(String pass)
	{
		driver.findElement(pwd).sendKeys(pass);
	}
	
	public void checkboxClick()
	{
		driver.findElement(chkbox).click();
	}
	
	public void clickSignUp()
	{
		driver.findElement(signup).click();
	}
}


