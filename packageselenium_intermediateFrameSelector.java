package selenium_intermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {
public static void main(String args []) throws InterruptedException {
		
		
	    System.setProperty("webdriver.chrome.driver","E:\\silenium all\\chromedriver.exe");
	    
	    
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/frames");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[text()='Nested Frames']")).click();
	    Thread.sleep(2000);
	    

	    
	    
	    driver.switchTo().frame("frame-bottom");
	    String a1= driver.findElement(By.cssSelector("body")).getText();
	    System.out.println("is" +a1);
	    driver.switchTo().defaultContent();
	    driver.close();
	    
	  
	    
	    
}
}
