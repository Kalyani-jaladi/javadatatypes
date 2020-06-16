package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowsers {

	public static void main(String[] args) {
		
		//GeckoDriver
		/*System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\kalyani software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		String title=driver.getTitle();
		if (title.equals("Google")) {
			System.out.println("Testcase Pass");
		} else {
			System.out.println("Testcase Fail");

		}
		driver.quit();*/
		
		//ChromeDriver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("http://www.google.com")) {
			System.out.println("Test Case");
		}else {
			System.out.println("Testcase Fail");
		}
		driver.quit();
		
		
		//launch Safaribrowser
		//for safari no need SetProperty....
		
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new SafariDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");*/

	}

}
