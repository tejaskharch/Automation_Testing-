package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitlywait {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();

		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   
		   

           driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");

           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

           driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
           
           System.out.println("test sucessful");
           
           driver.quit();
	}
}
