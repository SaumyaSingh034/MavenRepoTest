package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffE2E {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input#login1")).sendKeys("Hello");
		driver.findElement(By.cssSelector("input[id*='passwor']")).sendKeys("World");
		driver.findElement(By.cssSelector("input#remember")).click();
		driver.findElement(By.cssSelector("input[title*='Sign']")).click();
		driver.close();

	}

}
