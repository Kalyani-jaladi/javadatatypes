package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitlyWait {

	public static void main(String[] args) {
		
		//It is a dynamic wait if we give 40 sec but page load time is 3 sec remaing time Ignored		//implicitly wait is for elemnts which are available on the page
		//these both are globally methods
		//specific and all the elements
		//maximum time is 30 sec ..if it will open in 2 sec remaining time will be Ignored
		//page is fully loaded then do an action
		//
		System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Program Files\\\\\\\\kalyani software\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("u_0_b"))));
		 
		
		
		
	}

}
