package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesConceptwithActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement destination = driver.findElement(By.cssSelector("div#droppable"));
		
		a.dragAndDrop(source, destination).build().perform();
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		

	}

}
