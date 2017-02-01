/**
 * 
 */
/**
 * @author Muthuraman
 *
 */
package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginFunction {
	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    //WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        		//WebDriver driver=new FirefoxDriver()
	  driver.get("https://www.pfchangs.com");
     WebDriverWait wait = new WebDriverWait (driver, 20);
     wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("o-security-username")).clear();
		driver.findElement(By.id("o-security-username")).sendKeys("muthu56@sg.com");
		driver.findElement(By.id("o-security-password")).clear();
		driver.findElement(By.id("o-security-password")).sendKeys("mutc1234");
		driver.findElement(By.xpath("//button[@test-id='login-submit']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		
		driver.findElement(By.xpath("//a[@class='flyout-target']/span")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		driver.findElement(By.xpath("//a[@class='menu-cta ng-scope']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		
		driver.findElement(By.xpath("(//a[@class='menu-item-title-link ng-binding'])[5]")).click();
		driver.findElement(By.xpath("//input[@test-id='menu-item-form-quantity-input']")).clear();
		driver.findElement(By.xpath("//input[@test-id='menu-item-form-quantity-input']")).sendKeys("2");
		driver.findElement(By.xpath("//button[@test-id='menu-item-form-add-to-order-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@test-id='menu-add-alert-not-extras-checkout-link']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@test-id='menu-extras-quantity1-input']")).clear();
		driver.findElement(By.xpath("//input[@test-id='menu-extras-quantity1-input']")).sendKeys("2");
		driver.findElement(By.xpath("//button[@test-id='menu-extras-add-button']")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@test-id='menu-extras-quantity1-input'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@test-id='menu-extras-quantity1-input'])[3]")).sendKeys("2");
		driver.findElement(By.xpath("(//button[@test-id='menu-extras-add-button'])[3]")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@test-id='menu-extras-quantity1-input'])[6]")).clear();
		driver.findElement(By.xpath("(//input[@test-id='menu-extras-quantity1-input'])[6]")).sendKeys("2");
		driver.findElement(By.xpath("(//button[@test-id='menu-extras-add-button'])[6]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@ng-if='addMore']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='menu-cta ng-scope'])[2]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		//Thread.sleep(2000);
			
		driver.findElement(By.xpath("(//a[@class='menu-item-title-link ng-binding'])[4]")).click();
		
		driver.findElement(By.xpath("//input[@test-id='menu-item-form-quantity-input']")).clear();
		driver.findElement(By.xpath("//input[@test-id='menu-item-form-quantity-input']")).sendKeys("3");
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();
		
		driver.findElement(By.xpath("//button[@test-id='menu-item-form-add-to-order-button']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@test-id='menu-add-alert-not-extras-checkout-link']")).click();
		System.out.println("its done");
		driver.findElement(By.xpath("//a[@test-id='menu-extras-checkout1-link']")).click(); 
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		//driver.findElement(By.xpath("//a[@test-id='menu-cancel-order-link']")).click();
		
		 
		
	     
	}
	
}