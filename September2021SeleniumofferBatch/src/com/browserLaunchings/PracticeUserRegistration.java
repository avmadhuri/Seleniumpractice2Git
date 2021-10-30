package com.browserLaunchings;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PracticeUserRegistration extends BaseTest{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
   init();
		
		launch("chromebrowser");
		
		navigateUrl("PracticeRegistration");
		
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
       
        String emailgenerated=p.getProperty("First_name")+p.getProperty("Last_name")+randomNum()+p.getProperty("domain");
        driver.findElement(By.id("email_create")).sendKeys("emailgenerated");
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
        Thread.sleep(4000);
        //WebDriverWait wait =new WebDriverWait(driver,30);
        WebElement radio=driver.findElement(By.id("id_gender2"));
        //wait.until(ExpectedConditions.elementToBeClickable(radio));
        
        radio.click();
        
 
        driver.findElement(By.id("customer_firstname")).sendKeys("Madhuri");
        driver.findElement(By.id("customer_lastname")).sendKeys("Atchakala");
        driver.findElement(By.id("passwd")).sendKeys("Password123");
        WebElement days1=driver.findElement(By.id("days"));
        WebElement month=driver.findElement(By.id("months"));
        WebElement year=driver.findElement(By.id("years"));
        
        Select dropdown=new Select(days1);
        Select monthselect=new Select(month);
        Select yearselect=new Select(year);
        
        dropdown.selectByValue("28");    
        monthselect.selectByVisibleText("June ");
        yearselect.selectByVisibleText("1990  ");
        
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("firstname")).sendKeys("Madhuri");
        driver.findElement(By.id("lastname")).sendKeys("atchakala");
        driver.findElement(By.id("company")).sendKeys("JCP");
        driver.findElement(By.id("address1")).sendKeys("Sainagar , kovur road, Kandukur");
        driver.findElement(By.id("city")).sendKeys("Hyderabad");
        WebElement statepath=driver.findElement(By.id("id_state"));
        Select statedropdown=new Select(statepath);
        statedropdown.selectByVisibleText("Texas");
        driver.findElement(By.id("postcode")).sendKeys("523105");
        WebElement country=driver.findElement(By.id("id_country"));
        Select countryselection=new Select(country);
        countryselection.selectByVisibleText("United States");
        driver.findElement(By.id("other")).sendKeys("selenium practice");
        driver.findElement(By.id("phone")).sendKeys("9999999999");
        driver.findElement(By.id("phone_mobile")).sendKeys("7411207840");
        driver.findElement(By.id("alias")).sendKeys("Hyderabad");
       driver.findElement(By.id("submitAccount")).click();
        
        
        
	}

	public static int randomNum() 
	{
		Random r = new Random();
		int ran = r.nextInt(99999);
		return ran;
	}

}
