package edxProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dashboard {

	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[2]/div[1]/div[1]/a")private WebElement cources;
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[2]/div[1]/div[2]/a")private WebElement program;
	@FindBy(xpath="/html/body/div[2]/header/div[2]/div[2]/div[1]/div[3]/a")private WebElement discover;
	
	public dashboard(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void course()
	{
		cources.click();
	}
	public void program()
	{
		program.click();
	}
	public void discover()
	{
		discover.click();
	}
	
	
	
}
