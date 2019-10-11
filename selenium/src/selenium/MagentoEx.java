package selenium;

//add selenium standalone jars and add driver software

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MagentoEx {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		//create chrome driver object
		driver.manage().window().maximize();
		//maximize the window size
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//implicit wait to load the componect which we are testing
		driver.get("https://www.magento.com");
		
		driver.findElement(By.linkText("My Account")).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("nitinmanjunath1991@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		driver.findElement(By.id("send2")).click();
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Log Out")));
		//driver.findElement(By.linkText("Log Out")).click();
		driver.quit();
	}

}