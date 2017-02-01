package pom;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;
public class Testproject {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();	
	driver.manage().window().maximize();
        
		driver.get("https://www.pfchangs.com/register");
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("accountEmail")));
		driver.findElement(By.name("accountEmail")).clear();
		driver.findElement(By.name("accountEmail")).sendKeys("muthu50@saggezza.com");
		driver.findElement(By.name("password")).sendKeys("mutc12345");
		driver.findElement(By.name("firstName")).sendKeys("Muthuraman");
		driver.findElement(By.name("lastName")).sendKeys("Sundharam");
		driver.findElement(By.name("phoneNumber")).sendKeys("9444280084");
		driver.findElement(By.name("zipCode")).sendKeys("60003");
		WebDriverWait wait = new WebDriverWait (driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='loading-overlay']")));
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		
		//System.out.println("afer wait");
	//	Wait.Until(ExpectedConditions.ElementExists(By.XPath(your Xpath)));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='ng-scope']")).getText());
		Thread.sleep(20000);
		//System.out.println(driver.findElement(By.xpath("//button[@type='submit' and @o-compile='page.createButtonLabel']")).getText());
		System.out.println("account created");
		Thread.sleep(5000);
		
		/*Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin.size());
		for (String eachWin:allWin){
			driver.switchTo().window(eachWin);
		}*/
		Select mm = new Select(driver.findElement(By.name("monthSelected")));
		mm.selectByVisibleText("April");
		Select dd = new Select(driver.findElement(By.name("daySelected")));
		dd.selectByVisibleText("9");
		Thread.sleep(20000);
		
		
		
	   driver.findElement(By.xpath("(//*[@type='submit'])[2]")).click();
	   Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div[@class='email ng-binding']")).getText());
		driver.findElement(By.xpath("//*[@class='logout']")).click();
		System.out.println("logout clicked");		
		driver.findElement(By.xpath("//*[@test-id='security-header-unrecognized-link']")).click();
		System.out.println("Not muthuraman clicked");
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		//*[@test-id='security-header-unrecognized-link']
		//driver.findElement(By.linkText("Make a reservation")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Make a reservation')]")).click();
		
	}

}
