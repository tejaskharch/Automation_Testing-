package seleniumproject1.seleniumproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchgoogle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
    
   WebDriver driver = new ChromeDriver();
   System.out.println("chrome browser launched");
   driver.get("https://www.google.com/");
   
   driver.quit();
   
	}
}
