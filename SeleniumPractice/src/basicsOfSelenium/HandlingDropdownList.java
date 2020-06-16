package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.primusbank.qedgetech.com");
		Select select=new Select(driver.findElement(By.id("drlist")));
		select.selectByVisibleText("Hyderabad");
		Thread .sleep(2000);
		WebElement username=driver.findElement(By.id("txtuId"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("txtPword"));
		password.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.id("login"));
		login.click();
	}

}
