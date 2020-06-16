package locatorsInSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\kalyani software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		// driver.get() method is used to open an URL
		//it will wait till the whole page gets loaded
		
		driver.get("https://www.google.com");
		
		String title=driver.getTitle();
		
		
		if (title.equals("Google")) {
			
			System.out.println("Testcase Pass");
		} else {
			System.out.println("Testcase Fail");

		}
		WebElement url=
		driver.findElement(By.name("q"));
		url.sendKeys("www.primusbank.qedgetech.com");
		Thread.sleep(2000);
		url.click();
		
		
		
	}

}
