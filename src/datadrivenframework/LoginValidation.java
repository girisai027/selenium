package datadrivenframework;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginValidation {
	WebDriver driver;
	

	@Test
	public void LoginRetesting() throws Exception{
		
		driver.get("http://hyderabadreport.com/user");			
		Thread.sleep(3000);
		
		FileInputStream fi=new FileInputStream("D:\\Lib\\TestData\\LoginDataValidation.xls");
		Workbook w=Workbook.getWorkbook(fi);
		Sheet s=w.getSheet("Sheet1");
		
		for(int i=1; i < s.getRows(); i++)
		{	
			driver.findElement(By.id("edit-name")).clear();
			Thread.sleep(2000);
			driver.findElement(By.id("edit-name")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.id("edit-pass")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.id("edit-submit")).click();
			Thread.sleep(5000);
			try{
				Thread.sleep(3000);
				driver.findElement(By.linkText("Log out")).click();
				System.out.println("PASS");
			}
			catch(Exception e)
			{
				System.out.println("FAIL");
			}
		}    
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
