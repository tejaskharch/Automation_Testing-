package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\silenium all\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
           
           Thread.sleep(2000);
           driver.findElement(By.xpath("//i[@class='oxd-sidepanel-body']")).click();
	}


	
		
	}

