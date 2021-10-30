package pageobjectModel;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import com.project.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class POM_001
{
	WebDriver driver;
	
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://automationpractice.com/index.php");
	  }
	  
	  
	  public void f() 
	  {
		  LoginPage page  = new LoginPage(driver);
		  page.customerLogin();
		  Assert.assertEquals(page.verifyUser(), "Authentication failed.");
		 
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  LoginPage page  = new LoginPage(driver);
		  page.RegisterAccount();
		  
		  
	  }
	  
	  @Test
	  public void UserRegister()
	  {
		  
		 
		  UserRegistration usreg=new UserRegistration();
		  usreg.UserRegister();
		  
	  }


}
