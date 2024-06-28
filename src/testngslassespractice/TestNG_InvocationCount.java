package testngslassespractice;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;

public class TestNG_InvocationCount {
	WebDriver driver;
	
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Ignore
	@Test
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Ignore
	@Test(invocationCount=3)
	public void google() {
		driver.get("https://www.google.com");
	}
	
	
	@BeforeTest(groups="social")
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();	}

}
