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

public class IframesAlertsNewTab2 {
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
	
	
	
	@Test(enabled=false)
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
		
		driver.switchTo().alert().sendKeys("sai");
		driver.switchTo().alert().accept();
		
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
	
	@Test
	public void newtab() throws InterruptedException {
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm3");
		
		WebElement div = driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"));
		driver.switchTo().frame(div);
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/button")).click();
		driver.switchTo().alert().dismiss();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
		ArrayList<String> nam= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(nam.get(1));
		driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[10]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"pagetop\"]/div[3]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/form/div[1]/input[1]")).sendKeys("girisai");
	
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/form/div[1]/input[2]")).sendKeys("Girisai@54321");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/form/div[1]/input[3]")).sendKeys("giri");
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/form/div[1]/input[4]")).sendKeys("Sai");
		
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[4]/div/button[1]/div[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("girisai027@gmail.com");
	driver.switchTo().window(nam.get(0));
	
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[5]/div/form/div[3]/button")).click();


		
		
	
		
		
		
		
		
		
	   
	
	// Opens a new window and switches to new window
	// driver.switchTo().newWindow(WindowType.WINDOW);
	
	}
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
