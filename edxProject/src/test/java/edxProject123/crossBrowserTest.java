package edxProject123;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import edxProject.login;
import edxProject.logot;
import edxProject.register;

public class crossBrowserTest {
	WebDriver driver;
	  register reg;
	  login ln;
	  logot lgOT;
	  
	  @Parameters("browser")
	  
	  @BeforeTest
	  public void beforeTest(String browser)
	  {
		  System.out.println(browser);
		  if(browser.equals("Chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
			  driver=new ChromeDriver();
		  }
		  if(browser.equals("Firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\geckodriver.exe");
			  driver=new FirefoxDriver(); 
		  }
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize(); 
		  driver.get("https://authn.edx.org/register");
	  }
	  
		@BeforeClass
		public void beforeClass()
		 {
			reg=new register(driver);
			ln=new login(driver);
			 lgOT=new logot(driver);
		  
		  }
		  @BeforeMethod
		  public void beforeMethod()
		  {
			 
			  
			  reg.fullname();
			  reg.eMail();
			  reg.userNM();
			  reg.password();
			  reg.counTry();
			  reg.submit();
			//  reg.SignIN();
		  }
		  
		  @Test
		  public void test1(){
			  
			  ln.signin();
			  ln.uname();
			  ln.passWd();
			  ln.loGIN();
			  ln.close();
		  	  
		  }
		 
		   @AfterMethod
		  public void afterMethod()
		  {
		  lgOT.prof();
		  lgOT.signout();
		   
		  }
		  @AfterClass
		  public void afterClass()
		  {
			  reg=null;
				ln=null;
				 lgOT=null;
		  }
		  
		  @AfterTest
		  public void afterTest()
		  {
			  driver.close();
			  System.gc();
			  
		  }
		  
}
		

