package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingtoSiblingTraverse {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='navbar-collapse collapse clearfix']/ul/li[2]")).click();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000);
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='navbar-collapse collapse clearfix']/ul/li[2]/following-sibling::li[4]")).click();
		System.out.println(driver.getCurrentUrl());
		
		
		//driver.findElement(By.xpath("//li[@class='current']/a"))
		

	}

}
