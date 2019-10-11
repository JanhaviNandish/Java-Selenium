package com.abc.testscript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo 
{
	public static WebDriver driver;
	public static XSSFSheet sheet;
	public static String getCellValue(int r, int c)
	{
		XSSFRow row = sheet.getRow(r);
		XSSFCell cell = row.getCell(c);
		String data = cell.getStringCellValue();
		return data;
	}
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("F:\\Selenium Programs\\hybridFramework\\src\\com\\abc\\utilities\\hybrid.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		sheet = book.getSheetAt(0);
		int row = sheet.getPhysicalNumberOfRows();
		System.out.println(row);
		for(int i=1;i<row;i++)
		{
			String action = getCellValue(i,2);
			switch(action)
			{
			case "open":
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				break;
				
			case "navigate":
				driver.get(getCellValue(i,4));
				break;
				
			case "click":
				driver.findElement(By.xpath(getCellValue(i,3))).click();
				break;
				
			case "type":
				driver.findElement(By.xpath(getCellValue(i,3))).sendKeys(getCellValue(i,4));
				break;
				
			case "close":
				Thread.sleep(3000);
				driver.quit();
				break;
				
			default: System.out.println("invalid option");
				break;
			}
		}
		
		
	}

}
