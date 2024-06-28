package screenshots;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedWebElementScreenshot {
	WebDriver driver;

	@Test 
	public void TakeScreenShot() throws Exception{
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
						
		WebElement glogo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img"));

		File f = glogo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Screenshots\\GoogleLogo.png")); 
		
		
		/*	WebElement search = driver.findElement(By.name("q"));
		search
		.sendKeys("TestNG"); */
		
	//	driver.findElement(By.name("q")).sendKeys("TestNG");
	}
	


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}


}
