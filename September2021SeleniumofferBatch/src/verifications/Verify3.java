package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dt-test3.jcpenney.com/?dpAkamaiOverride=1");
		
WebElement loc = driver.findElement(By.id("searchInputId"));
		
		loc.sendKeys("4077326-0042");
		
		WebElement search=driver.findElement(By.id("searchIconBlock"));
		
		search.click();
		

	}

}
