package isdisplayedisenabledisselected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyApplicatitiontextfieldsradio {
	WebDriver driver;

	@Test(enabled= false)
	public void verifyTabTitle() {
		driver.get("https://www.redmine.org");

		boolean pro = driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).isDisplayed();

		if (pro == true) {
			System.out.println("Projects menu item is available in top menu bar");
			driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
		}

		else {
			System.out.println("Projects menu item is Not available in top menu bar");

		}

	}

	@Test(enabled= false)
	public void verifytextfields() {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();

		boolean login = driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();

		if (login == true) {
			System.out.println("Login field is available to enter the username");
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("girisai");
		}

		else {
			System.out.println("Login field is Not available to enter the username");

		}

	}

	@Test(enabled= false)
	public void verifyradiobuttoncheckboxes() {
		driver.get("https://www.redmine.org/");
		driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("sai");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("abc");
		driver.findElement(By.xpath("//*[@id=\"autologin\"]")).click();
		
		boolean check = driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
		
		if(check==true)
		{
			System.out.println("Stay Logged in check box is selected");
		}
		
		else
		{
		System.out.println("Stay Logged in check box is NOT selected");
		}
	}
	@Test
	public void verifyradiobuttoncheckboxe() {
		driver.get("https://www.facebook.com/");
		
		
		
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
