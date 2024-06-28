package datadrivenframework;

import org.testng.annotations.Test;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class LoginValidationResults {
	WebDriver driver;
	
	public String str;

	@Test
	public void PrintTestResultsinSheet() throws Exception {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Reading the data from the input file
		FileInputStream fi = new FileInputStream("D:\\Lib\\TestData\\LoginDataValidation.xls");
		Workbook w = Workbook.getWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		// Creating the result file under the result folder
		FileOutputStream fo = new FileOutputStream("D:\\Lib\\TestData\\LoginValidationResults.xls");
		WritableWorkbook wb = Workbook.createWorkbook(fo);
		WritableSheet ws = wb.createSheet("Results", 0);
		
		for (int i = 1; i < s.getRows(); i++) {
			// Take the username, password and click on signin by taking the testdata from
			// excel file
			driver.get("http://hyderabadreport.com/user");
			Thread.sleep(3000);
			driver.findElement(By.id("edit-name")).clear();
			// driver.findElement(By.id("edit-name")).sendKeys(Keys.CONTROL, "a");
			Thread.sleep(2000);
			driver.findElement(By.id("edit-name")).sendKeys(s.getCell(0, i).getContents());

			driver.findElement(By.id("edit-pass")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.id("edit-submit")).click();
			Thread.sleep(5000);

			// Validate logout, if available assign pass to str, else assign fail to str
			try {
				driver.findElement(By.linkText("Log out")).click();
				str = "PASS";
			}
			catch (Exception e) {
				str = "FAIL";
			}

			// Add the str value under the Result column
			Label result = new Label(2, i, str);
			ws.addCell(result);
			// Add the input data to the Result file
			for (int j = 0; j < s.getColumns(); j++) {
				System.out.println(s.getCell(j, i).getContents());
				Label l = new Label(j, i, s.getCell(j, i).getContents());
				ws.addCell(l);
			}
		}
		// Add the Heading
		Label un = new Label(0, 0, "Username");
		Label pw = new Label(1, 0, "Password");
		Label rs = new Label(2, 0, "Status");
		ws.addCell(un);
		ws.addCell(pw);
		ws.addCell(rs);
		// Write and close the Result file
		wb.write();
		wb.close();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
