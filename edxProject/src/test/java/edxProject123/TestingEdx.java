package edxProject123;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edxProject.dashboard;
import edxProject.login;
import edxProject.logot;
import edxProject.register;





public class TestingEdx {
	WebDriver driver;
	  register reg;
	  login ln;
	  logot lgOT;
	  dashboard d;
	  
		@BeforeClass
		public void beforeClass()
		 {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\JAVA\\Java Programs\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  
		  }
		  @BeforeMethod
		  public void beforeMethod()
		  {
			  driver.get("https://authn.edx.org/register");
			  reg=new register(driver);
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
			  ln=new login(driver);
			  ln.signin();
			  ln.uname();
			  ln.passWd();
			  ln.loGIN();
			  ln.close();
		  	  
		  }
		  
		  
		  
		  @Test
		  public void test2()
		  {
			d=new dashboard(driver);
			d.program();
			String url="https://courses.edx.org/dashboard/programs/";
			Assert.assertEquals(url,"https://courses.edx.org/dashboard/programs/");
		  }
		  
		    @AfterMethod
		  public void afterMethod()
		  {
		  lgOT=new logot(driver);
		  lgOT.prof();
		  lgOT.signout();
			   
			   
			   
		  }
		  @AfterClass
		  public void afterClass()
		  {
			  driver.close();
		  }
}
		  