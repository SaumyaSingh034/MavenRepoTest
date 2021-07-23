package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//Implict Wait for better Performance
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Store items in array
		String[] vegiee = {"Tomato", "Musk Melon", "Nuts Mixture", "Carrot","Water Melon", "Almonds"};
		
		//Convert Array into List
		  List al = Arrays.asList(vegiee);  
		 // System.out.println(al);
		
		//Name of veggiee
		List<WebElement> veg = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<veg.size();i++)
		{
			String[] name = veg.get(i).getText().split("-");
			String formattedname = name[0].trim();
			//System.out.println(formattedname);
			int j=0;
			if(al.contains(formattedname))
			{
				j++;
				//Click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==3)
				{
					break;
				}
			}
		}
		
		
		//Add Item in Cart
		
		
		// Click on Cart Button
		
		
		

	}

}
