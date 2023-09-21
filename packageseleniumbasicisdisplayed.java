package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayedisenable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();

		   driver.get("https://www.google.com/");
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          if  (driver.findElement(By.xpath("//input[@class='gLFyf']")).isDisplayed())
          {
        	  System.out.print("WebElement is displayed   ");
          }
          else
          {
        	  System.out.print("not display");
          }
          if  (driver.findElement(By.xpath("//input[@class='gLFyf']")).isEnabled())
          {
        	  System.out.print("WebElement is enable");
          }
          else
          {
        	  System.out.print("not enabled");
          }
       
	}

}
