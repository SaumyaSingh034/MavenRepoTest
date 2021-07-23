package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		// ImPlicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Size within web Element
		System.out.println(driver.findElements(By.tagName("a")).size());

		/*
		 * //Size within frame
		 * driver.switchTo().frame(driver.findElement(By.cssSelector(
		 * "iframe#courses-iframe")));
		 * 
		 * System.out.println(driver.findElements(By.tagName("a")).size());
		 */

		// print link size of footer
		WebElement footerdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// Print link of left corner in footer
		WebElement columndriver = footerdriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		for (int i = 0; i < columndriver.findElements(By.tagName("a")).size(); i++) {
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL, Keys.ENTER);

		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();
		String parent = it.next();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		// driver.quit();

	}

}
