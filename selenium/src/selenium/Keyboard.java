package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From*']"));
		Actions a = new Actions(driver);
		
		a.moveToElement(from).pause(2000).click().sendKeys("beng").perform();
		for(int i=0;i<3;i++)
		{
			a.sendKeys(Keys.ARROW_DOWN).pause(2000).perform();
		}
		a.sendKeys(Keys.ENTER).pause(2000).perform();
		Thread.sleep(5000);
		driver.quit();
	}
}
