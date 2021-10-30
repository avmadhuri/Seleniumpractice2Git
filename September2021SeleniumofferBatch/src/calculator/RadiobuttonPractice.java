package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.browserLaunchings.BaseTest;

public class RadiobuttonPractice extends BaseTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		init();
		launch("chromebrowser");
		navigateUrl("mortagecalculator");
		driver.findElement(By.xpath("//input[@name=\"cloanamount\"]")).clear();
          driver.findElement(By.xpath("//input[@name=\"cloanamount\"]")).sendKeys("5000000");
          driver.findElement(By.xpath("//input[@name='cloanterm']")).clear();
          driver.findElement(By.xpath("//input[@name='cloanterm']")).sendKeys("30");
          driver.findElement(By.xpath("//input[@name=\"cinterestrate\"]")).clear();
          driver.findElement(By.xpath("//input[@name=\"cinterestrate\"]")).sendKeys("6");
          driver.findElement(By.id("cremainingyear")).clear();
          driver.findElement(By.id("cremainingyear")).sendKeys("20");
          driver.findElement(By.id("cremainingmonth")).clear();;
          driver.findElement(By.id("cremainingmonth")).sendKeys("0");
          driver.findElement(By.id("cpayoff1")).click();
          boolean radioselected=driver.findElement(By.id("cpayoff1")).isEnabled();
          System.out.println("Radio button is enabled"+radioselected);
          boolean radioselect=driver.findElement(By.id("cpayoff1")).isSelected();
          System.out.println("Radio button is selected"+radioselect);
          driver.findElement(By.xpath("//input[@value=\"Calculate\"]")).click();
          
          String payoffamount=driver.findElement(By.xpath("//h2[contains(text(),'Payoff Amount')]")).getText();
          
          System.out.println("Amount to be paid" +payoffamount);
          
          driver.close();
         
          
          
          
	}

}
