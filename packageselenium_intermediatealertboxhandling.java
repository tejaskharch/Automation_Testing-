package selenium_intermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertboxhandling {
	public static void main(String args []) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
	    
	    
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	    Alert alt = driver.switchTo().alert();
	    Thread.sleep(1000);
	    alt.accept();
	     
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	    Alert alt1 = driver.switchTo().alert();
	    Thread.sleep(1000);
	    alt1.dismiss();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	    Alert alt2 = driver.switchTo().alert();
	    alt2.sendKeys("........");
	    Thread.sleep(2000);
	    alt2.accept();
	    
	    
	}

}
