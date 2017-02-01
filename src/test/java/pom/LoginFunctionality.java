package pom;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginFunctionality {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    //WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
        		//WebDriver driver=new FirefoxDriver();
		driver.get("https://www.pfchangs.com/register");
		
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("o-security-username")).clear();
		driver.findElement(By.id("o-security-username")).sendKeys("muthU36@saggezza.com");
		driver.findElement(By.id("o-security-password")).clear();
		driver.findElement(By.id("o-security-password")).sendKeys("mutc12345");
		driver.findElement(By.xpath("//button[@test-id='login-submit']")).click();
		
		System.out.println(driver.getTitle());
		/*
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("accountEmail")));
		driver.findElement(By.name("accountEmail")).clear();
		driver.findElement(By.name("accountEmail")).sendKeys("muthu36@saggezza.com");
		driver.findElement(By.name("password")).sendKeys("mutc12345");
		driver.findElement(By.name("firstName")).sendKeys("Muthuraman");
		driver.findElement(By.name("lastName")).sendKeys("Sundharam");
		driver.findElement(By.name("phoneNumber")).sendKeys("9444280084");
		driver.findElement(By.name("zipCode")).sendKeys("60003");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		*/
		
		System.out.println("sucessful login");
		Thread.sleep(5000);
		/*driver.findElement(By.xpath("//a[contains(text(),'Make a reservation')]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.name("reservationDate")).clear();
		driver.findElement(By.name("reservationDate")).sendKeys("12/15/2016");
		driver.findElement(By.name("reservationDate")).clear();
		driver.findElement(By.name("reservationDate")).sendKeys("12/15/2016");
		
		
		driver.findElement(By.name("reservationTime")).clear();
		driver.findElement(By.name("reservationDate")).sendKeys("12/15/2016");*/
		
		
		/*Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin.size());
		for (String eachWin:allWin){
			driver.switchTo().window(eachWin);
		}*/
				
		/*new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[10]/div/div/div/div/form/div/div[2]/button")));
	    System.out.println("waiting for 10sec");
	    new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[10]/div/div/div/div/form/div/div[2]/button")));
	    System.out.println("again waiting for 10sec");*/
	    
	}

}
