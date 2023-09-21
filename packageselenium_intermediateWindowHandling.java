package selenium_intermediate;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchwindow {
	
	public static void main(String args [] ) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String bjk = driver.getWindowHandle();
		
		
	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple iphone 14 pro max");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
//		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		
	    String h = driver.getWindowHandle();
	    
	    System.out.println(bjk);
	    System.out.println(h);
	    
	    driver.switchTo().window(bjk);
	    
	    Thread.sleep(1000);
	   
	    driver.switchTo().window(h);
	    
//	    System.out.print(bjk);
//	    System.out.print(h);
//	    driver.switchTo().window(bjk);
//	    driver.switchTo().window(h);
//	    driver.quit();
	    }

}
