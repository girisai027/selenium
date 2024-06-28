package testngslassespractice;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class CrossBrowserTesting {
public WebDriver driver;
	
	
    @Parameters({ "browser" })   
    @BeforeTest
    public void openBrowser(String browser) {

        try {

        	if (browser.equalsIgnoreCase("GoogleChrome")) {
        		
              //  System.setProperty("webdriver.chrome.driver","E:\\Libs\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
        	}
           else if (browser.equalsIgnoreCase("Firefox")) {
              //  System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().window().maximize();              	
              }             
                    
            else if (browser.equalsIgnoreCase("Edge")) {
              //  System.setProperty("webdriver.edge.driver", "F:\\lib\\msedgedriver.exe");
    		driver = new EdgeDriver();
    		driver.manage().window().maximize();
            }
        	/* 
               else if (browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver","D:\\lib\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }

            else if (browser.equalsIgnoreCase("opera")) {
                System.setProperty("webdriver.opera.driver","D:\\lib\\operadriver.exe");  //--->IE for Windows path
                driver=new OperaDriver();
             }

        else (browser.equalsIgnoreCase("safari")) {
            System.setProperty("webdriver.safari.driver", "D:\\lib\\safariDriver.exe"); //To stop uninstall each time
             driver = new SafariDriver();
             }*/

        } 
        catch (WebDriverException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void googlesearch() throws Exception {
     
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("GiriSai"+Keys.ENTER);
     //   Thread.sleep(5000);
       
    }
    
    @Test
    public void googleTirupati() throws Exception {
     
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Tirupati"+Keys.ENTER);
    //    Thread.sleep(5000); 
      
    }
    
    @Test
    public void googleSelenium() throws Exception {
     
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("Selenium"+Keys.ENTER);
       // Thread.sleep(5000);
       
    }
    
    @Test
    public void googleTestng() throws Exception {
     
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("TestNG"+Keys.ENTER);
       // Thread.sleep(5000);
       
    }
}


