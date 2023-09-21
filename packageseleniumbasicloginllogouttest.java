package seleniumbasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instaloginlogout {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	    
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   
		   driver.manage().window().maximize();

		   driver.get("https://www.instagram.com/accounts/login/");
		   
		 

           driver.findElement(By.xpath("//input[@name='username']")).sendKeys("");

           driver.findElement(By.xpath("//input[@name='password']")).sendKeys("");

           driver.findElement(By.xpath("//div[@class='_ab8w  _ab94 _ab99 _ab9f _ab9m _ab9p  _abak _abb8 _abbq _abb- _abcm']")).click();
           
           Thread.sleep(10000);
           
           driver.findElement(By.xpath("//div[@class='//button[@class='_acan _acao _acas _aj1-']")).click();
           
           driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
           
           driver.findElement(By.xpath("//div[@class='x6s0dn4 x1b1mbwd xav7gou x9f619 x1w9h7q7 x78zum5 x1q0g3np x2lah0s x1pg5gke xwhw2v2 xl56j7k x1r0g7yl xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x1n2onr6 x2b8uid x11njtxf x1wzhzgj xaqea5y']")).click();
           
           driver.findElement(By.xpath("//svg[@class='_ab6-']")).click(); 
           
           driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();  
           
           System.out.println("test sucessful");
           
           driver.quit();
	}
}
