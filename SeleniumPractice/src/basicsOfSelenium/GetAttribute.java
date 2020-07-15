package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\\\\\\\Program Files\\\\\\\\kalyani software\\\\\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//The getAttribute() method is declared in the WebElement interface, and it returns the value of the web element’s attribute as a string. 
		//For attributes having boolean values, the getAttribute() method will return either true or null.
		
		driver.get("http://gmail.com");
		WebElement username=driver.findElement(By.id("identifierId"));
				username.sendKeys("jkalyani16@gmail.com");
		String typevalue=username.getAttribute("type");
		System.out.println("type of attribute:"+typevalue);
		
		
		
		
		
		
		
		

	}

}
