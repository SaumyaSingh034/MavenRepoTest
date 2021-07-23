package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		// Select origin as Varanasi
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("VAR");
		// Select destination as Delhi

		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input#ctl00_mainContent_ddl_destinationStation1_CTXT")).sendKeys("DEL");

		// Departur Date
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div[2]/table/tbody/tr[4]/td[3]")).click();

		// Adults
		driver.findElement(By.id("divpaxinfo")).click();
		Select adult = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		adult.selectByValue("2");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
