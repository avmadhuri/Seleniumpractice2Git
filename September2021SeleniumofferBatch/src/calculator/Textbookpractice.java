package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.browserLaunchings.BaseTest;

public class Textbookpractice extends BaseTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		init();
launch("chromebrowser");
		
		navigateUrl("calculator");
		
		driver.findElement(By.id("cpar1")).sendKeys("10");
		Thread.sleep(5000);
		driver.findElement(By.id("cpar2")).sendKeys("1000");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
		String result=driver.findElement(By.id("cpar3")).getAttribute("value");
		
		
		System.out.println("The result calculated is" +result);
		
	}

}
