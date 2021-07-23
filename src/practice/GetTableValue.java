package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTableValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		int a;
		int sum = 0;
		
		List<WebElement> data =  driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		for(int i=0;i<data.size();i++)
		{
			System.out.println(data.get(i).getText());
			a = Integer.parseInt(data.get(i).getText());
			sum += a;
			
		}
		System.out.println(sum);

	}

}
