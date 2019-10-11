package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement link = driver.findElement(By.linkText("Forgotten account?"));
		System.out.println("Tagname is:" +link.getTagName());
		System.out.println("Text is:" +link.getText());
		System.out.println("Attribute value of href is:" +link.getAttribute("href"));
		driver.quit();

	}

}
