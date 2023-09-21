package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		   
		   driver.manage().window().maximize();
		   driver.get("https://www.google.com/");
		   
		   driver.findElement(By.name("q")).sendKeys("selenium");
		   driver.findElement(By.name("btnK")).click();
		   
		   System.out.println("done");
		   
		   driver.quit();
	}

}
