import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiveJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\academy\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String myApplicationUrl = "https://csc-cloud-test3.jcpenney.com/launchpad?dpAkamaiOverride=1";
		driver.get(myApplicationUrl);
		

	}

}
