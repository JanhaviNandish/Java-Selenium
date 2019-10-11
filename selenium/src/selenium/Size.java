package selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		System.out.println("orginal width is:" +size.width);
		System.out.println("orginal height is:" +size.height);
		Dimension newsize = new Dimension((size.width/2),(size.height/2));
		System.out.println("new width is:" +newsize.width);
		System.out.println("new height is:" +newsize.height);
		driver.manage().window().setSize(newsize);	
		Thread.sleep(5000);
		driver.quit();
	}
}
