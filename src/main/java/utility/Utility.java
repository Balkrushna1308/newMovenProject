package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Utility {

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		return driver;
	}

	public static void selectValueFromDropDown(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public static void selectDateFromDatePicker(WebDriver driver, String date) {
		driver.findElement(By.xpath("//div[text()='" + date + "']")).click();
	}
	public static void clickUsingJS(WebElement element, WebDriver driver)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}
	public static void scrollToView(WebElement element, WebDriver driver)
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
