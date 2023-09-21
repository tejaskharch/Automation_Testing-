package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dawnknighttest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
		
	
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   driver.get("https://www.dawnknight.in/");
		   Thread.sleep(2000);
		   driver.navigate().back();
		   Thread.sleep(2000);
		   driver.navigate().forward();
		   
		   System.out.println("test Sucessful");
		   
		   driver.quit();
		   
	}

}
