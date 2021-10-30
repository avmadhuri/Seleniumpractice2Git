package pageobjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(linkText="Sign in") public WebElement signIn;
    @FindBy(id="email") public WebElement userEmail;
    @FindBy(id="passwd") public WebElement userPassword;
    @FindBy(id="SubmitLogin") public WebElement submitLogin;
@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")public WebElement getuserAuthentication;
@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")public WebElement RegisterUser;
@FindBy(id="email_create") public WebElement Enteremail;
@FindBy(xpath="//*[@id=\\\"SubmitCreate\\\"]/span") public WebElement CreateAccount;

	
	

	public LoginPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void customerLogin()
    {
    	signIn.click();
    	userEmail.sendKeys("avmadhuri2015@gmail.com");
    	userPassword.sendKeys("Password123");
    	submitLogin.click();	
}
  
	
	public String verifyUser()
	{
		return getuserAuthentication.getText();
	}
	
	public void RegisterAccount()
	{
		
		Enteremail.sendKeys("avmadhuri2015@gmail.com");
		CreateAccount.click();
		
	}



    
    
    
    public void VerifyUser()
    {
    	
    }
    
    
    
}

