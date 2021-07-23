package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQA {
	//without Page Object Model Framework

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Navigate to the Demo Site
		driver.get("https://demoqa.com/books");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Login into the store
		driver.findElement(By.cssSelector("#login")).click();
		
		driver.findElement(By.cssSelector("#userName")).sendKeys("gunjankaushik");
		driver.findElement(By.cssSelector("#password")).sendKeys("Password@123");
		
		//Click on Login button
		driver.findElement(By.cssSelector("#login")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='main-header']")).getText());
		System.out.println("The page title is : " +driver.findElement(By.xpath("//*[@id=\"app\"]//div[@class=\"main-header\"]")).getText());

		//Click on Logout button
		

	}

}
