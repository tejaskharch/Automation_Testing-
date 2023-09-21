package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazontesting {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   driver.get("https://amazon.in/");
		   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Admin");
		   Thread.sleep(2000);
		   driver.findElement(By.id("nav-search-submit-button")).click();
		   Thread.sleep(2000);
		   
		   System.out.println("test sucessful");
		   
		   driver.quit();
	}
}
