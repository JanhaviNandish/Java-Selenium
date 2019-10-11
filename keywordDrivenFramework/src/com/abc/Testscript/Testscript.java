package com.abc.Testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testscript 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("F:\\Selenium Programs\\keywordDrivenFramework\\src\\com\\abc\\properties\\keyword.properties");
		//pass location of property file to fis to establish connection between script and property file
		Properties p = new Properties();
		p.load(fis);
		//load the data throw fis
		//to get the property file, pass key of the data as parameter
		
		String myacct = p.getProperty("myacct");
		String email = p.getProperty("emailloc");
		String pass = p.getProperty("passloc");
		String login = p.getProperty("login");
		String logout = p.getProperty("logout");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		driver.findElement(By.linkText(myacct)).click();
		//Thread.sleep(5000);
		
		driver.findElement(By.id(email)).sendKeys("nitinmanjunath1991@gmail.com");
		driver.findElement(By.id(pass)).sendKeys("Welcome123");
		driver.findElement(By.id(login)).click();
		//Thread.sleep(5000);
		driver.findElement(By.linkText(logout)).click();
		driver.quit();
	}
}
