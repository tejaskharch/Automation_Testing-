package selenium_intermediate;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String args [] ) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\photon\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		
		System.out.println("title is "+driver.getTitle() );
	
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple iphone 14 pro max");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//img[@class='s-image']")).click();
		
		driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
		
		System.out.println("title is "+driver.getTitle() );
		
		ArrayList<String> newtab = new ArrayList<String>(driver.getWindowHandles());
		 
		driver.switchTo().window(newtab.get(0));
		
		
		
	 }
}
