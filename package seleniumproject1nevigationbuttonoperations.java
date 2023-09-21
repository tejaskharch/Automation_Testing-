package seleniumproject1.seleniumproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationbuttons {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
    
   WebDriver driver = new ChromeDriver();
   
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
   driver.manage().window().maximize();
   driver.get("https://www.google.com/");
   driver.navigate().to("https://www.yahoo.com/");
   driver.navigate().back();
   driver.navigate().forward();
   driver.navigate().refresh();
   
   System.out.println("Test Sucessful");
   
   driver.quit();
   
   
	}

}
