package pageobjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserRegistration 
{

	@FindBy(id="uniform-id_gender2") public WebElement Gender;
    @FindBy(id="customer_firstname") public WebElement FirstName;
    @FindBy(id="customer_lastname") public WebElement LastName;
    @FindBy(id="passwd") public WebElement Password;
     @FindBy(id="days") public Select selectdays;





public void LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}

public void UserRegister()
{
	Gender.click();
	FirstName.sendKeys("Madhuri");
	LastName.sendKeys("Atchakala");
	Password.sendKeys("Password123");
	selectdays.selectByValue("28");
}
}
