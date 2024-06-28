package framesalertsnewtabfuncationalities;

import org.testng.annotations.Test;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IframesAlertsNewTab {
	WebDriver driver;
	//Alert alt = driver.switchTo().alert();

	@Test(enabled=false)
	public void frames() throws InterruptedException {
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm3");
		Thread.sleep(4000);
		WebElement obj = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(obj);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/button")).click();
		
	//	driver.switchTo().frame(2);
		
	}
	
	
	
	@Test
	public void alerts() throws InterruptedException {
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm3");
		Thread.sleep(4000);
		WebElement obj = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(obj);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(3000);
	//	alt.accept();
	//	driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		//driver.switchTo().alert().sendKeys("sai");
	//	driver.switchTo().alert().accept();
		
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("sai");
		alt.accept();
		
	}
	
	@Test(enabled=false)
	public void newtabbrowser() throws InterruptedException {
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm3");
		Thread.sleep(4000);
		WebElement obj = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(obj);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
		Thread.sleep(3000);
		
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
		Thread.sleep(3000);

		driver.switchTo().window(tabs.get(0));

	}
	
	
	@Test(enabled=false)
	public void newtabtest() throws InterruptedException {
		driver.get("https://www.google.com");
		Thread.sleep(4000);
	   
	// Opens a new tab and switches to new tab
	driver.switchTo().newWindow(WindowType.TAB);
	Thread.sleep(4000);

	driver.navigate().to("https://www.facebook.com");
	
	// Opens a new window and switches to new window
	// driver.switchTo().newWindow(WindowType.WINDOW);
	
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
