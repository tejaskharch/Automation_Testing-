package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();

		   driver.get("https://www.calculator.net/");
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

          if  (driver.findElement(By.xpath("//input[@id='scirdsettingd']")).isSelected())
          {
        	  System.out.print("WebElement is selected   ");
          }
          else
          {
        	  System.out.print("not selected ");
          }
          if  (driver.findElement(By.xpath("//input[@id='scirdsettingr']")).isSelected())
          {
        	  System.out.print("WebElement is selected ");
          }
          else
          {
        	  System.out.print("not selected ");
          }
       
	}
}
