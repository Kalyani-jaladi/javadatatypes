package basicsOfSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandllingAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Program Files\\\\kalyani software\\\\kalyani\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		/*driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
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
			
			
		}*/
		
		driver.get("http://primusbank.qedgetech.com/");
//		
//		WebElement submit=driver.findElement(By.name("proceed"));
//		submit.click();
//		
//		Alert alert=driver.switchTo().alert();
//		alert.accept();
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath("//*[@width='132']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BtnNewBR")).click();
	
		driver.findElement(By.id("txtbName")).sendKeys("nellore");
		driver.findElement(By.id("txtAdd1")).sendKeys("kakutur");
		driver.findElement(By.id("txtZip")).sendKeys("52432");
		Thread.sleep(2000);
		
		Select list=new Select(driver.findElement(By.name("lst_counrtyU")));
		list.selectByVisibleText("INDIA");
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.name("lst_stateI")));
		state.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.name("lst_cityI")));
		city.selectByVisibleText("Nellore");
		
		driver.findElement(By.name("btn_insert")).click();
		Thread.sleep(2000);
		Alert alert =driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		
	}
	
	
	
	

}
