package seleniumproject1.seleniumproject1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class printtitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   
		   driver.navigate().to("https://www.yahoo.com/");
		   String title = driver.getTitle();
		   System.out.print(title);
		   
		   
		   driver.quit();
		   
			

	}

}
