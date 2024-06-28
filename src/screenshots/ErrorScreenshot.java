package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorScreenshot {
WebDriver driver;
	
	public void FailedScreenshot() throws Exception {	
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Screenshots\\ErrorScreenshot.png"));
	}
	
	@Test
	public void googlesearch() throws Exception {
		driver.get("https://www.google.com/");	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		try 
		{
			driver.get("https://google.com");
			
			
			driver.findElement(By.name("q")).sendKeys("Sai");
			
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			
			driver.findElement(By.xpath("//*[@id=\"hdtb-tls\"]")).click();
			
			
			driver.findElement(By.xpath("//*[@id=\"tn_1_Sai\"]/span[3]/a/div/span")).click();
			
			
		}
		
		catch (Exception e) 
		{
			FailedScreenshot();
			System.out.println("==========Error due to========="+e);
		}
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


}
