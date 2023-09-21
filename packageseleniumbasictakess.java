package seleniumbasic;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

import javax.imageio.IIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class capture_screenshort {
	
	public static void main(String[] args)  throws IOException {
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://instagram.com/accounts/login/");
		  

           driver.findElement(By.xpath("//input[@name='username']")).sendKeys("klmml");

           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hgvjh");

           driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
           
        
           
           File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         Files.copy(f, new File ("G:\\photon\\ss\\ss1.jpg"));
           
          System.out.println("ss taken");
          
          driver.quit();
	}



}
