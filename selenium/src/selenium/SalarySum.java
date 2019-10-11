package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalarySum 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("F://Selhtml//salary.html");
		List<WebElement> row = driver.findElements(By.xpath("//tbody/tr"));
		int rowsize = row.size();
		System.out.println("Rows present in the table is:" +rowsize);
		
		int sum=0;
		for(int i=2;i<=rowsize;i++)
		{
			WebElement text = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[4]"));
			String sal = text.getText();
			System.out.println(sal);
			String sal1 = sal.replace("$","").replace(",","");
			int x = Integer.parseInt(sal1);
			sum+=x;
		}
		System.out.println(sum);
		driver.quit();
	}
}
