package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class CloseNadQuite {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\kalyani software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.gamail.com");
		driver.close();//close the current browser or a page which is currently having the focus.
		driver.quit();//it is used to destroy the webdriver instance
		//it will close all browsers associated with driver.
		
		
		
//		
//		driver.get("http://www.google.com");
//		WebElement checkgmail=driver.findElement(By.linkText("Sign in"));
		
//		Actions action=new Actions(driver); 
//		action.moveToElement(driver.findElement(By.linkText("Sign in")));
//		action.build().perform();
//		driver.close();
//		
		
		
		
	}

}
