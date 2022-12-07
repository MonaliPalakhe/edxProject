package edxProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class register {
  
	
	
	
	@FindBy(xpath="//input[@id='name']")private WebElement fname;
	@FindBy(xpath="//input[@id='email']")private WebElement email;
	@FindBy(xpath="//input[@id='username']")private WebElement username;
	@FindBy(xpath="//input[@id='password']")private WebElement pass;
	@FindBy(xpath="//input[@id='country']")private WebElement country;
	@FindBy(xpath="//button[@type='submit']")private WebElement reg;
	
	
	public register(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	

	public void fullname()
	{
		fname.sendKeys("MONALI ASHOK PALAKHE");
	}
	public void eMail()
	{
		email.sendKeys("manasisutar2210@gmail.com");
	}
	public void userNM()
	{
		username.sendKeys("monalipalakhe");
	}
	public void password()
	{
		pass.sendKeys("mypass@10");
	}
	public void counTry()
	{
		country.sendKeys("India");
	}
	public void submit()
	{
	reg.click();
	}
	
	
	
}
