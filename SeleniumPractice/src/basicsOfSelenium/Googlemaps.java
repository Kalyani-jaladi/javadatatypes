package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;

public class Googlemaps {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		
		
		driver.get("https://www.google.com/maps/@14.3619947,79.9304626,15z");
		Builder<String, Object>maplatlon=new ImmutableMap.Builder<String, Object>();
		maplatlon.put("latitude",40.712776);
		maplatlon.put("longitude",-74.005974);
		maplatlon.put("accuracy",100);
		
		

	}

}
