package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsGadgets 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://echoecho.com/javascript4.htm");
		Thread.sleep(3000);
		
		driver.findElement(By.name("B1")).click();
		Alert a = driver.switchTo().alert();
		//make driver switch to popup
		
		System.out.println(a.getText());
		//to get messsage part of popup
		Thread.sleep(3000);
		
		a.accept();
		//clicks on ok button
		Thread.sleep(3000);
		
		//a.dismiss();
		//clicks on cancel button
		driver.quit();

	}

}
