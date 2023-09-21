package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class linkedintest {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\silenium all\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   driver.get("https://www.linkedin.com/login/");
		   driver.findElement(By.xpath("//input[@name='session_key']")).sendKeys("tejaskharche10@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.name("session_password")).sendKeys("tejaskharche10@gmail.com");
		   Thread.sleep(2000);
		   driver.findElement(By.className("btn__primary--large from__button--floating")).click();	
		   }

}
