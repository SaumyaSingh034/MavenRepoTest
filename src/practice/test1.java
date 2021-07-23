package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/?gl=IN");
		String url = driver.getCurrentUrl();
		System.out.println(driver.getTitle());
		if(url.contains("https://www.youtube.com/?gl=IN"))
		{
			System.out.println("True");
		}
		else
			System.out.println("False");
		
		//System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());

	}

}
