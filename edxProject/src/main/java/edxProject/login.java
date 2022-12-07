package edxProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {

	@FindBy(xpath="//a[text()='Sign in']")private WebElement SIGNIN;
	@FindBy(xpath="//input[@id='emailOrUsername']")private WebElement uname;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[@id='sign-in']")private WebElement loGin;
	@FindBy(xpath="//button[text()='Close']")private WebElement close;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signin()
	{
		SIGNIN.click();
	}
	
	public void uname()
	{
		uname.sendKeys("manasisutar2210@gmail.com");
	}
	public void passWd()
	{
		password.sendKeys("mypass@10");
	}
	
	public void loGIN()
	{
		loGin.click();
	}
	
	public void close()
	{
		close.click();
	}
	
	
	
	
}
