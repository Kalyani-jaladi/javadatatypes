package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandllingAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement clicklogin=driver.findElement(By.name("proceed"));
		clicklogin.click();
		Thread.sleep(2000);

		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		//driver.quit();
		System.out.println(alert);
		//validationPart
		String text=alert.getText();
		if (text.equals("Please enter a valid user name")) {
			System.out.println("Correct Alert");
		} else {
			System.out.println("Incorrect Alert");
			alert.accept();
		}
	}

}
