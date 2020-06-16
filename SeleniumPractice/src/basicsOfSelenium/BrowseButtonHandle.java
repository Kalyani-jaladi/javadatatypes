package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseButtonHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://html.com/input-type-file/");
		WebElement UploadFile=
		driver.findElement(By.name("fileupload"));
		UploadFile.sendKeys("C:\\Users\\kalyani\\Documents");
		
//		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
//		submit.click();
		
	}

}
