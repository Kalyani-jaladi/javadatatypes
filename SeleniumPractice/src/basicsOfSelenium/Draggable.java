package basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Draggable {

	public static void main(String[] args) {
		
		//According to www...now a days frames are not allowed
		//Most of the ui developers not supported frames
		//frames you can find now a days in old applications
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\kalyani software\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions action=new Actions(driver);
		
		action .clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("/html/body/div[2]")))
		.build().perform();
		
		
		
		
		
		
	}

}
