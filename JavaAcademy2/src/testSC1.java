import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testSC1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\academy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String myApplicationUrl = "https://dt-test1.jcpenney.com/?dpAkamaiOverride=1";
		String app_title_expected = "JCPenney: Window & Home Decor, Bedding, Clothing & Accessories";
		String app_title_actual = "";
		driver.get(myApplicationUrl);
		// get the actual value of the title
		app_title_actual = driver.getTitle();
		System.out.println("app_title_actual = " + app_title_actual);
		// compare the titles and print result as "Passed" or "Failed"

		if (app_title_actual.contentEquals(app_title_expected)) {
			System.out.println("title matched  - Pass");
		} else {
			System.out.println("title not matched  - Fail");
		}

		WebElement abc = driver.findElement(By.xpath("//input[@type='search']"));
		System.out.println(abc.isDisplayed());
		
		if(abc.isDisplayed()==true) {
			System.out.println("Do some action");
			driver.findElement(By.xpath("//input[@type='search']")).sendKeys("shirt");
			driver.findElement(By.xpath("//*[@id=\"typeaheadInputContainer\"]/div/button")).click();
		}
		System.out.println("search completed");
		Thread.sleep(10000);
		System.out.println("getting Sorting option...");

		driver.findElement(By.xpath("//*[@id=\"gallery-product-list\"]/div[1]/div/div/div/button/div")).click();
		Thread.sleep(5000);
		List<WebElement> drplist = driver.findElements(By.xpath("//*[@id='gallery-product-list']/div[1]/div/div/div/span/div/ul/li"));

		for (WebElement product : drplist) {
			int i = 1;
			System.out.println(">" + product.getText() + "<") ;
			i++;
		}

		//System.exit(0);
		
		System.out.println("<<<<<<<<<<<<<<<<<Sorting order change4 Low to High>>>>>>>>>>>>");
		//Price Low - High<
		driver.findElement(By.xpath("//*[@id='gallery-product-list']/div[1]/div/div/div/span/div/ul/li[5]/span")).click();
		Thread.sleep(10000);
		
		String drptext = driver.findElement(By.xpath("//*[@id='gallery-product-list']/div[1]/div/div/div/span/div/ul/li[1]/span")).getText();
		System.out.println("Selected Option is  : " + drptext);

		String itemdesc = driver.findElement(By.xpath("//*[@id=\"gallery-product-list\"]/div[2]/div/ul/li[1]/div/div/div/div/div[3]/div")).getText();
		
		List<WebElement> itemDisplaylist = driver.findElements(By.xpath("//*[@id=\"gallery-product-list\"]/div[2]/div/ul/li"));
		List<WebElement> pricetag_fromSrchResults = driver.findElements(By.xpath("//span [@data-automation-id='at-price-value'][1]"));
		System.out.println("--------------------------------------------------------------");
		
		for (WebElement dispItem : pricetag_fromSrchResults) {
			int j = 1;
			System.out.println("------------------");
			System.out.println(dispItem.getText());
			System.out.println("------------------");
		}
//		Thread.sleep(3000);
//		driver.close();
		
	}
	
}
