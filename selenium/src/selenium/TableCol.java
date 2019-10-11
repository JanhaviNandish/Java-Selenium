package selenium;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCol 
{

	public static void main(String[] args) 
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("F://Selhtml//tables.html");
		List<WebElement> row =driver.findElements(By.xpath("//tbody/tr"));
		
		int rowsize=row.size();
		System.out.println("Rows present in the table:" +rowsize);
		List<WebElement> col = driver.findElements(By.xpath("//tbody/tr[1]/td"));
		
		int colsize = col.size();
		System.out.println("Column present in table:" +colsize);
		
		System.out.println("course present in the tables are:");
		for(int i=1;i<=rowsize;i++)
		{
			WebElement text = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]"));
			System.out.println(text.getText());
		}
		driver.quit();
	}
}
