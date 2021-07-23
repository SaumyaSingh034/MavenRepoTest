package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathParentChildTraverse {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		//Use parent Child Traverse Xpath to search an input in search box.
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys("Rohit Saraf");
		driver.findElement(By.xpath("//div[@class='SDkEP']/div[2]/input")).sendKeys(Keys.ENTER);
		
		//Click on Images
		driver.findElement(By.xpath("//div[@class='MUFPAc']/div[2]/a")).click();

	}

}
