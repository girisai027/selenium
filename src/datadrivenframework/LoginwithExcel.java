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

public class LoginwithExcel {
	WebDriver driver;
	
	@Test
	public void ReadData() throws IOException, JXLException, Exception {
		
		driver.get("http://hyderabadreport.com/user");

		FileInputStream fi = new FileInputStream("D:\\Lib\\TestData\\LoginData.xls"); // Here your xls path.
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet(0);

		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys(s.getCell(0, 1).getContents());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys(s.getCell(1,1).getContents());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
	} 

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
