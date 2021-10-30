import java.io.File;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
//import org.apache.commons.io.FileUtils;

//import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
				// Chrome driver setup and creating object
				System.setProperty("webdriver.chrome.driver", "C:\\academy\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//				// explicit wait - to element is accessible
//				//@SuppressWarnings("deprecation")
//				WebDriverWait wait = new WebDriverWait(driver,20);
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath expression")));
//				// then perform the next actiondriver.findElement(By.xpath("xpath expression")).click();

				Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
				

				String myApplicationUrl = "https://www.jcpenney.com/";
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
				

				File test_screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				//File.copyFile(test_screenshot , new File(""));
				

				
				
				
				driver.close();
			}

	}


