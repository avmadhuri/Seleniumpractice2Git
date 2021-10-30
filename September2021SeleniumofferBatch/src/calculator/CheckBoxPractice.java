package calculator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.browserLaunchings.BaseTest;

public class CheckBoxPractice extends BaseTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
init();
launch("chromebrowser");
navigateUrl("checkboxpracticesite");

driver.findElement(By.id("chouseprice")).clear();
driver.findElement(By.id("chouseprice")).sendKeys("5000000");
driver.findElement(By.id("cdownpayment")).clear();
driver.findElement(By.id("cdownpayment")).sendKeys("20");
WebElement dropdown= driver.findElement(By.xpath("//select[@name=\"cdownpaymentunit\"]"));
Select option=new Select(dropdown);
option.selectByVisibleText("%");
driver.findElement(By.id("cloanterm")).clear();
driver.findElement(By.id("cloanterm")).sendKeys("20");
driver.findElement(By.id("cinterestrate")).clear();
driver.findElement(By.id("cinterestrate")).sendKeys("3.0%");

WebElement datepath=driver.findElement(By.id("cstartmonth"));
Select datedropdown= new Select(datepath);
datedropdown.selectByVisibleText("Nov");

driver.findElement(By.id("cstartyear")).clear();
driver.findElement(By.id("cstartyear")).sendKeys("2021");

boolean checkboxres = driver.findElement(By.xpath("//span[@class=\"cbmark\"]")).isSelected();

if(checkboxres==true)

	System.out.println("checkbox is already selected");
else
	System.out.println("Entered to else block");
driver.findElement(By.xpath("//span[@class=\"cbmark\"]")).click();

driver.close();
		
	}

}
