package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.get("http://spicejet.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/ul/li[8]/a"))).build().perform();
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.xpath("//a[@id='smoothmenu1']/ul/li[15]/ul/li[3]/a"));
		click.click();
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println("the total number of iframes is:"+size);
		System.out.println(driver.getTitle());
		//driver.findElement(By.linkText("Travel Agent Login")).click();*/
		
		driver.get("https://www.amazon.com");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Your Account")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
