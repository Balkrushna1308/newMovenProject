package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStore {
	WebDriver driver;
	WebElement searchBox;
	WebElement loginButton;

	public BookStore(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox() {
		this.searchBox = driver.findElement(By.xpath("//input[@id='searchBox']"));
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton() {
		this.loginButton = driver.findElement(By.xpath("//button[@id='login']"));
	}
	
	
	

}
