package com.browserLaunchings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class SingleLineBopus extends BaseTest {

	public static void main(String[] args) throws Exception
	
	{
		// TODO Auto-generated method stub
		
             init();
		
		launch("chromebrowser");
		
		navigateUrl("jcpenneytest3");
		
		driver.manage().window().maximize();
		
		String headertitle=driver.getTitle();
		System.out.println("Header Title is"+headertitle);
		
		driver.findElement(By.id("searchInputId")).sendKeys("5039022");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/header[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Select dd=new Select(driver.findElement(By.xpath("//option[text()='2']")));
//		
//		//dd.selectByValue("2");
//		//dd.getOptions();
	driver.findElement(By.xpath("//*[@id=\"GlobalOptions-AddToCart\"]/button")).click();
		
		driver.findElement(By.xpath("//*[@id=\"atPanelContent\"]/div[1]/div/section/section/section[1]/div[2]/div/button[1]")).click();
	driver.findElement(By.id("checkoutButton")).click();
		
		driver.findElement(By.id("email")).sendKeys("avmadhuri2020@gmail.com");
		
		driver.findElement(By.id("cartSignInPassword")).sendKeys("Impulse_2020");
		driver.findElement(By.xpath("//button[@class=\"_2IHEY _3VivT m0Pqn A_y_u _1WfC3\"]")).click();
		driver.findElement(By.xpath("//body/div[@id='content']/section[1]/section[1]/article[1]/section[2]/section[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/button[1]")).click();
	
//		//WebElement qunatityselcted = driver.findElement(By.xpath("//option[text()='2']")).findElement(By.xpath("//p[text()="Add to Cart"][//@class="btnText"]"));
//		
//		//System.out.println(qunatityselcted);
//		
//		//qunatityselcted.click();
//		
//		//driver.findElement(By.xpath("//option[contains(@2,'Add to Cart']")).click();
//		
		//driver.close();
//		
//		//Select dd=new Select(driver.findElement(By.xpath("//option[contains(@2,'Add to Cart']")));
//
//		int index=2;
//		        dd.selectByIndex(index);
		
		//WebElement dropdown = driver.findElement(By.xpath("//option[text()='2']"));
	//System.out.println(dropdown);

	
		
		//searchbtn.click();
		
		
		//driver.close();

}
}
