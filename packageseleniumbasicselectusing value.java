package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_item_from_dropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\silenium all\\chromedriver.exe");
	    
		   WebDriver driver = new ChromeDriver();
		   
		   
		   
		   driver.manage().window().maximize();

		   driver.get("https://calculator.net/interest-calculator.html");
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		   Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='ccompound']")));
		   
		   Thread.sleep(1000);
		   
		   dropdown.selectByValue("monthly");
		 
}
}