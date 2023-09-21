package selenium_intermediate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explecitly_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\silenium all\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//INPUT[@name='q']"))).sendKeys("seed");
		
		//driver.quit();
		
	}

}
