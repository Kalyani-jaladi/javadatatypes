package basicsOfSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementandFindelements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\kalyani software\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*Findelement
		this method is used to access a single webelement on a page,it returns the first matching element.
		and it throws a NoSuchelEmentexception when it fails to find the element.
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("jkalyani16@gmail.com");*/
		
		/*Findelements method returns the list of matching elements
		findelemets method returns empty list 
		ex:-1.get the total number of links in page
			2.get the text of each link in a page*/
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.linkText("Site Map")).click();
		List<WebElement> listofelements=driver.findElements(By.tagName("a"));		
		for (int i = 0; i < listofelements.size(); i++) {
			String linktext=listofelements.get(i).getText();
			System.out.println(linktext);
		}
		
		
		
	
	}

}
