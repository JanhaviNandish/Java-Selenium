package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentHtml 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("F://Selhtml//parent.html");
		driver.findElement(By.linkText(" Parent Tab ")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}
