package testngslassespractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvide {
 
	WebDriver driver;
	String str;
	
	@DataProvider(name="datainput")
    public String[][] login()
    {
         return new String[][]
        	{
             {"giri","hello"},
             {"sai","demo"},
             {"lavanya","hello"},
             {"usha","demo"},
             {"indraja","9980251000"}
             };
}

	@Test(dataProvider = "datainput")
	public void login(String user, String pswd) throws Exception {

		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys(user);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys(pswd);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		try 
		{
			driver.findElement(By.linkText("Log out")).click();
			str = "Pass";
			System.out.println(str);
		} 
		catch (Exception e) 
		{
			str = "Fail";
			System.out.println(str);
		}
	}

	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
}
