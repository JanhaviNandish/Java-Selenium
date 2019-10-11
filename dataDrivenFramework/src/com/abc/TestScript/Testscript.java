package com.abc.TestScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Testscript 
{

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis = new FileInputStream("F://Selenium Programs//dataDrivenFramework//src//com//abc//Properties//data.properties");
		//pass location of property file to fis to establish connection between script and property file
		Properties p = new Properties();
		p.load(fis);
		//load the data throw fis
		//to get the property file, pass key of the data as parameter
		
		String urldata = p.getProperty("url");
		String emaildata = p.getProperty("email");
		String passdata = p.getProperty("password");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(urldata);
		
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.id("email")).sendKeys(emaildata);
		driver.findElement(By.id("pass")).sendKeys(passdata);
		driver.findElement(By.id("send2")).click();
		driver.findElement(By.linkText("Log Out")).click();
		driver.quit();		
	}
}
