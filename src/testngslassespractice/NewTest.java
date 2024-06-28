package testngslassespractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	WebDriver driver;
	
  @Test
  public void facebook() {
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("girisai027@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("testing@1234");
	 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	 
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  driver= new ChromeDriver();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
