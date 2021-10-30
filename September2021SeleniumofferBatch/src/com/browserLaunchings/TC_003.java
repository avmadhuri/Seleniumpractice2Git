package com.browserLaunchings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		launch("chromebrowser");
		
		navigateUrl("jcpenneytest4");
		
		driver.manage().window().maximize();
		
		String headertitle=driver.getTitle();
		System.out.println("Header Title is"+headertitle);
		
		//driver.findElement(By.xpath("//button[contains(text(),'Sign In')]"));
		
		WebElement e= driver.findElement(By.xpath("//div[@class=\"_2IWk1 flex flex-row mt-1\"]"));
		
		Actions actions=new Actions(driver);
		
		Thread.sleep(500);
	
		actions.moveToElement(e).perform();
		
		System.out.println("MouseOver Action is completed");
		
		 driver.findElement(By.xpath("//div[text()='Track My Orders']")).click();			
		
			
		System.out.println("Track my order link is clicked");
		
		
		
		driver.findElement(By.id("orderNumber")).sendKeys("2021189510000546");
		
		driver.findElement(By.id("phone")).sendKeys("9999999999");
		
		
		driver.findElement(By.xpath("//*[@id=\"contentContainer\"]/div/div/div/form/div[4]/button")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Entered to start a return");
	
	try{
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
		Thread.sleep(2000);
		} 
	catch (Exception ex){
		System.out.println(">>>>> Elelement is missing>>>>>" + ex.getMessage());
	
		}
	

		
	driver.findElement(By.xpath("/html/body/div[1]/main/article/div/div[2]/div/div[3]/div[3]/div/div[6]/div/button")).click();

		driver.navigate().forward();
		
		
	
		
		
		driver.findElement(By.xpath("//*[@id=\"Layer_1\"]/path[1]")).click();
		
//		WebElement itemselect=
//		
//		actions.moveToElement(itemselect).click().build().perform();
//		
		
		
//		
//		driver.findElement(By.xpath("//div[text()='Track My Orders']"));
		
		//driver.findElement(“WebElement_submenu”).click();
		
		
//		//div[text()='Track My Orders']
//		
//		Select select=new Select()));  
//		
//		driver.findElement(By.xpath("//div[contains(text(),'Track My Orders')]")).click();
//		
//		WebElement target = driver.findElement(By.className("kJejJ _3MQMB _3uwf6 _3n2ZT")));
		
		
	
		
//		driver.findElement(By.id("searchInputId")).sendKeys("5039022");
//		
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/main[1]/header[1]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
//		
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//		
//		//Select dd=new Select(driver.findElement(By.xpath("//option[text()='2']")));
//		
//		//dd.selectByValue("2");
//		//dd.getOptions();
//		driver.findElement(By.xpath("//*[@id=\"GlobalOptions-AddToCart\"]/button")).click();
//		
//		driver.findElement(By.xpath("//*[@id=\"atPanelContent\"]/div[1]/div/section/section/section[1]/div[2]/div/button[1]")).click();
//		
//		driver.findElement(By.id("checkoutButton")).click();
//		
//		driver.findElement(By.id("email")).sendKeys("avmadhuri2020@gmail.com");
//		
//		driver.findElement(By.id("cartSignInPassword")).sendKeys("Impulse_2020");
//		driver.findElement(By.xpath("//button[@class=\"_2IHEY _3VivT m0Pqn A_y_u _1WfC3\"]")).click();
//		driver.findElement(By.xpath("//body/div[@id='content']/section[1]/section[1]/article[1]/section[2]/section[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/button[1]")).click();
//		
		
		
		
		//WebElement qunatityselcted = driver.findElement(By.xpath("//option[text()='2']")).findElement(By.xpath("//p[text()="Add to Cart"][//@class="btnText"]"));
		
		//System.out.println(qunatityselcted);
		
		//qunatityselcted.click();
		
		//driver.findElement(By.xpath("//option[contains(@2,'Add to Cart']")).click();
		
		//driver.close();
		
		//Select dd=new Select(driver.findElement(By.xpath("//option[contains(@2,'Add to Cart']")));

//		int index=2;
//		        dd.selectByIndex(index);
		
		//WebElement dropdown = driver.findElement(By.xpath("//option[text()='2']"));
	//System.out.println(dropdown);

	
		
		//searchbtn.click();
		
		
		//driver.close();
		

	}

}
