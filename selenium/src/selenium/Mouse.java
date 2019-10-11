package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement shopby = driver.findElement(By.xpath("//span[text()='Shop by']"));
		WebElement echoalexa = driver.findElement(By.xpath("//span[text()='Echo & Alexa']"));
		WebElement echospot = driver.findElement(By.xpath("//span[text()='Echo Spot']"));
		
		Actions a=new Actions(driver);
		//we have to create object of Action class & pass browsers reference
		//as the parameter to the action class
		
		a.moveToElement(shopby).pause(2000).moveToElement(echoalexa).pause(2000).moveToElement(echospot).pause(2000).click().perform();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
