package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com");
		Thread.sleep(2000);
		Select brlist=new Select(driver.findElement(By.id("drlist")));
		brlist.selectByVisibleText("Hyderabad");
		
		WebElement username=driver.findElement(By.id("txtuId"));
		username.sendKeys("Admin");
		
		WebElement password=driver.findElement(By.id("txtPword"));
		password.sendKeys("Admin");
		
		WebElement login=driver.findElement(By.id("login"));
		login.click();
		
		
		
		
		

	}

}
