package seleniumclass;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Actionsclass {
WebDriver driver;

	
  @Test
  public void f() {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.seleniumlearn.com");
	  driver.findElement(By.xpath("//*[@id=\"menu-457-1\"]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"sel-blocks\"]/div[2]/div[2]/span[3]/a")).click();
	 Actions art= new Actions(driver);
	 art.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).doubleClick().build().perform();
	 driver.findElement(By.xpath("//*[@id=\"node-104\"]/div/div[1]/div/div/button")).click();
	 
	 
  };  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  @BeforeClass
  public void beforeClass() {
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
