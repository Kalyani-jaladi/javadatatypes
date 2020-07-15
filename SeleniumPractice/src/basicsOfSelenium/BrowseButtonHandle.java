package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseButtonHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\kalyani\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		/*
		 selenium doesnt support any window popups
		 for this there are two ways to upload window file through
		 1. directly browse the window file using sendkeys we can upload
		 2.another one is using autoit
		 
		 */
		/*driver.get("http://html.com/input-type-file/");
		WebElement UploadFile=
		driver.findElement(By.name("fileupload"));
		UploadFile.sendKeys("C:\\Users\\kalyani\\Documents");
		
//		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
//		submit.click();*/
		
		
		driver.get("https://my.naukri.com/account/register/basicdetails");
		Thread.sleep(2000);
		driver.findElement(By.name("userType")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("uploadCV")).sendKeys("C://Users//kalyani//Desktop");
		
		
	}

}
