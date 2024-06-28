package tabtitleurlapptext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabtitleURLText {
	WebDriver driver;

	@Test(enabled = false)
	public void verifyTabTitle() {
		driver.get("https://www.google.com");

		String exptabtitle = "Google";
		System.out.println("Expected tab title is :" + exptabtitle);

		String acttabtitle = driver.getTitle();
		System.out.println("Actual tab title is :" + acttabtitle);

		Assert.assertEquals(acttabtitle, exptabtitle);
	}

	@Test(enabled = false)
	public void verifyApplicationURL() {
		driver.get("https://www.google.com");

		String expurl = "https://www.google.com/";

		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(acturl, expurl);
	}

	@Test
	public void verifyApplicationText() {
		driver.get("https://www.google.com");

		String expgtext = "Gmail";

		String actgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).getText();

		Assert.assertEquals(actgtext, expgtext);

		String expimgtext = "Images";

		String actimgtext = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).getText();

		Assert.assertEquals(actimgtext, expimgtext);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
