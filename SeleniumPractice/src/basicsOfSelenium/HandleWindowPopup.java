package basicsOfSelenium;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleWindowPopup {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\Program Files\\\\kalyani software\\\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		/*driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		Set<String>handler=driver.getWindowHandles();
		Iterator<String>it=handler.iterator();

		String parentwindow=it.next();
		System.out.println("parentwindow id:"+parentwindow);
		String childwindow=it.next();
		System.out.println("childwindowid:"+childwindow);
		driver.switchTo().window(childwindow);
		System.out.println("childwindow popuptitle:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwindow);
		System.out.println("parentwindow title:"+driver.getTitle());*/
		
		/*
		 set is used to perform basic mathematical operations on a set
		 ex:--two arrays set1=[1,2,3,4,5,6,0]
		 				 set2=[1,3,0,2,7,5]
		 
		
		 Set<String> hash_Set 
         = new HashSet<String>();
		 
		 hash_Set.add("kalyani");
		 hash_Set .add("hussain");
		 hash_Set .add("lavanya");
		 hash_Set .add("mereesha");
		 System.out.println( hash_Set );*/
		
		 Set<Integer> a = new HashSet<Integer>();  
	        a.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));  
	        Set<Integer> b = new HashSet<Integer>();  
	        b.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));  
	        System.out.println(a);
	        System.out.println(b);
	     // To find union  
	        Set<Integer> union = new HashSet<Integer>(a);  
	        union.addAll(b);  
	        System.out.print("Union of the two Set");  
	        System.out.println(union);  
	  
	        // To find intersection  
	        Set<Integer> intersection = new HashSet<Integer>(a);  
	        intersection.retainAll(b);  
	        System.out.print("Intersection of the two Set");  
	        System.out.println(intersection);  
	  
	        // To find the symmetric difference  
	        Set<Integer> difference = new HashSet<Integer>(a);  
	        difference.removeAll(b);  
	        System.out.print("Difference of the two Set");  
	        System.out.println(difference);  
	    
	
	        /*
	         * Iterators are used in Collection framework in Java to retrieve elements one by one. There are three iterators.
	         It is a universal iterator as we can apply it to any Collection object. By using Iterator, we can perform both read and remove operations. 
	         It is improved version of Enumeration with additional functionality of remove-ability of a element.

			Iterator must be used whenever we want to enumerate elements in all Collection framework implemented interfaces like Set, List, Queue, Deque and also in all implemented classes of Map interface. 
			Iterator is the only cursor available for entire collection framework.

			Iterator object can be created by calling iterator() method present in Collection interface.
	         */
		
	        // Create a vector and print its contents 
	        Vector v = new Vector(); 
	        for (int i = 0; i < 10; i++) 
	            v.addElement(i); 
	        System.out.println(v); 
	  
	        // At beginning e(cursor) will point to 
	        // index just before the first element in v 
	        Enumeration e = v.elements(); 
	  
	        // Checking the next element availability 
	        while (e.hasMoreElements()) 
	        { 
	            // moving cursor to next element 
	            int i = (Integer)e.nextElement(); 
	  
	            System.out.print(i + " ");  
		

	}
	}

}
