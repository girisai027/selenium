package dropdownselection;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class Dropdownvalues {
	WebDriver driver;

	@Test
	public void selectcountry() throws InterruptedException {
		Thread.sleep(3000);
		driver.get("http://baalabharathi.com/upload-story/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517501");
		Thread.sleep(3000);
		
		Select con = new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
	//	con.selectByVisibleText("Sri Lanka");
	//	con.selectByValue("ZA");
		con.selectByIndex(7);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
