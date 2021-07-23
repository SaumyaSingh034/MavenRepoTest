package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandeling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		//Implicit Wait for better view
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Click on the URL present in Homepage
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		//Give id of all the window/tab opened
		Set<String> window = driver.getWindowHandles();
		
		Iterator<String> it = window.iterator();
		
		//Parent
		String parent = it.next();
		String child = it.next();
		
		
		driver.switchTo().window(child);
		String username = driver.findElement(By.xpath("//a[@href=\"mailto:mentor@rahulshettyacademy.com\"]")).getText();
		System.out.println(driver.findElement(By.xpath("//a[@href=\"mailto:mentor@rahulshettyacademy.com\"]")).getText());
		
		driver.switchTo().window(parent);
		
		driver.findElement(By.cssSelector("input#username")).sendKeys(username);
		
		
		
	}

}
