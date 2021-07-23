package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class AmazonActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Action class
		Actions a = new Actions(driver);
		
		WebElement move = driver.findElement(By.xpath("//span[@class='nav-line-2 nav-long-width']"));
		
		//Enter Capital letter in search box
		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("lehenga for women").build().perform();
				
		
		//Press on Enter
		a.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).sendKeys(Keys.ENTER).build().perform();
		//Hover Mouse
		//a.moveToElement(move).build().perform();
		
		
		

	}

}
