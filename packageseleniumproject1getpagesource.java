package seleniumproject1.seleniumproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.navigate().to("https://www.google.com/");
		   String ps = driver.getPageSource();
		   System.out.print(ps);
		   driver.close();
	}

}
