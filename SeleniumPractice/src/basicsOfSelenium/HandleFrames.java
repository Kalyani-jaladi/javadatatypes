package basicsOfSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.xml.internal.bind.v2.runtime.output.NamespaceContextImpl.Element;

public class HandleFrames {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\\\\\\\\\Program Files\\\\\\\\\\\\\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//window inside a window
		//how to find frame present in the application 
		// right click on the element check this fRAME PRESENT OR NOT
		//OR U CAN ALSO FIND THE SOURCE CODE FRAME PRESENT OR NOT
		//FOR THAT SHOULD WRITE (IFRAME)
		//driver.get("http://amazon.com");
		//var iframes = document.ge
		/*WebElement username=driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.id("txtPassword"));
		password.sendKeys("Qedge123!@#");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.id("btnLogin"));
		login.click();
		driver.switchTo().frame("PIM");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();*/
		
		/*List<WebElement> elements = driver.findElements(By.tagName("iframe"));
		int numberOfTags = elements.size();
		System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
		
		driver.switchTo().frame(0);
		System.out.println("the frame 0 is:"+driver.getPageSource());*/
		
//		driver.get("https://www.softwaretestinghelp.com/");
//		List<WebElement> elements = driver.findElements(By.tagName("iframe"));
//		int numberOfTags = elements.size();
//		System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
		 
		// Switch to the frame using the frame id
//		System.out.println("Switching to the frame");
//		driver.switchTo().frame("aswift_0");
//		 
//		// Print the frame source code
//		System.out.println("Frame Source" +driver.getPageSource());
//		 
//		// Switch back to main web page
//		driver.switchTo().defaultContent();
//		
		driver.get("http://www.amazon.com");
		
		
		/*List <WebElement> elements=driver.findElements(By.tagName("iframe"));
		 int noOfframes= elements.size();
		 System.out.println("no of Iframes on the web page are:"+ noOfframes);
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
		 driver.switchTo().frame(0).getTitle();
		 Thread.sleep(2000);
		 //driver.findElement(By.linkText(")).click();
		
		int size=driver.findElements(By.tagName("iframe")).size();
		 System.out.println(size);
		 for (int i = 0; i <=size; i++) {
			driver.switchTo().frame(i);
				int total=driver.findElements(By.xpath("//*[@id='DAsis']")).size();
				System.out.println(total);
				}
				*/
				
			
		
		
		 
		//driver.quit();
		

	}

}
