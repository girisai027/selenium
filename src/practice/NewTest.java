package practice;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void rightclick() throws InterruptedException {
	 
			driver.get("https://www.seleniumlearn.com");
			Thread.sleep(3000);
			
			Actions art = new Actions(driver);
			art.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-388-1\"]/a"))).build().perform();
			
			
			
			
			
			
			
			
			  }
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  
	
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
