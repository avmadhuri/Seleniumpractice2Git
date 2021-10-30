package com.browserLaunchings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.lang.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Enter;

public class GooglePracticeCode extends BaseTest{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
init();
		
		launch("chromebrowser");
		
		navigateUrl("google");
		
		Robot r =new Robot();
		
		driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]")).sendKeys("selenium tutorial techlistic");
		Thread.sleep(1000);
	
		r.keyPress(KeyEvent.VK_ENTER);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		if(driver.getTitle().equalsIgnoreCase("Google"))
		{
			System.out.println("Title is matching with google");
		}
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.google.co.in/"))
{
	System.out.println("Google India link is loaded");
}
		else
			System.out.println("wrong url is loaded");
		

	}

}
