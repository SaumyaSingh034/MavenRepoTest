package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Thread.sleep(4000);
		String[] items = { "Mushroom", "Apple", "Musk Melon" };
		addElementToCart(driver, items);

		// Write code here for checkout

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		// Click on Proceed to checkout
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		// Thread.sleep(3000);
		// Coupon Code
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		// Click on Apply
		driver.findElement(By.cssSelector("button.promoBtn")).click();

		// Explicit Wait
		/*
		 * WebDriverWait w = new WebDriverWait(driver, 5);
		 * w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(
		 * "span.promoInfo")));
		 */

		// Print Code Applied
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		// Click on Place Order
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

		// Select Country
		Select country = new Select(driver.findElement(By.xpath("//select[@style='width: 200px;']")));
		country.selectByVisibleText("India");

		// Click on the checkbox
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).isSelected());

		// Click on Proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();

	}

	private static void addElementToCart(WebDriver driver, String[] items) {

		String formattedproduct;
		List<WebElement> products = driver.findElements(By.xpath("//*[@class='product-name']"));

		// Convert array into array list
		// here we are converting array to array list because, array takes less memory
		// so due to which we save memory and using memory only atr un time

		List itemsList = Arrays.asList(items);
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			String[] product = products.get(i).getText().split("-");
			formattedproduct = product[0].trim();
			if (itemsList.contains(formattedproduct)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']")).get(i).click();

				if (j == 0)
					break;

			}
		}

	}
}
