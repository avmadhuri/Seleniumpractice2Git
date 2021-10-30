
package verifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verify1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		String actuallink=driver.findElement(By.linkText("Customer Service")).getText();
		String expectedLink="Customer Serv";
		
		if(actuallink.equalsIgnoreCase(expectedLink))
		{
		
			System.out.println("Both links are equal");
			
		}
		else
			System.out.println("Both lines are not equal");
		
		if(actuallink.contains(expectedLink))
		{
			System.out.println("Both links are equal");
		}
		
		else
			System.out.println("Both lines are not equal");
		
		//we can take the link name with Attribute as well.
		
		String actuallink1=driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
        String expectedLink1="Customer Serv";
		
		if(actuallink.equalsIgnoreCase(expectedLink1))
		{
		
			System.out.println("Both links are equal");
			
		}
		else
			System.out.println("Both lines are not equal");
		
		driver.close();
		System.out.println("Chrome Browser is closed");

	}

}
