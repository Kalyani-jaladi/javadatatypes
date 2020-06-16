package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {

	public static void main(String[] args) {
		
		//It is a dynamic wait if we give 40 sec but page load time is 3 sec remaing time Ignored		//implicitly wait is for elemnts which are available on the page
		//these both are globally methods
		//specific and all the elements
		//maximum time is 30 sec ..if it will open in 2 sec remaining time will be Ignored
		//page is fully loaded then do an action
		//
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		
		
		
	}

}
