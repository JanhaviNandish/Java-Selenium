package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchkey 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.name("q"));
		Actions a = new Actions(driver);
		a.moveToElement(search).pause(2000).click().perform();
		a.keyDown(Keys.SHIFT).sendKeys("abc").sendKeys(Keys.SPACE).sendKeys("for").pause(2000).keyUp(Keys.SHIFT).sendKeys(Keys.SPACE).sendKeys("technology training").perform();
		a.sendKeys(Keys.ENTER).pause(2000).perform();
		Thread.sleep(5000);
		driver.quit();
	}

}
