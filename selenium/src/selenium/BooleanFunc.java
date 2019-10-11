package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BooleanFunc 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		
		WebElement round = driver.findElement(By.id("RoundTrip"));
		WebElement returnon = driver.findElement(By.id("ReturnDate"));
		WebElement search = driver.findElement(By.id("SearchBtn"));
		
		if (round.isSelected() == false)
		{
			round.click();
		}
		if(returnon.isDisplayed())
		{
			returnon.sendKeys(" Thu, 29 Aug, 2019");
		}
		if(search.isEnabled())
		{
			System.out.println("button is enabled");
			search.click();
		}
		else
		{
			System.out.println("button is disabled");
		}
		Thread.sleep(5000);
		driver.quit();

	}

}
