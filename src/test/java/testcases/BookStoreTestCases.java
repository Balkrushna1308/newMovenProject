package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.BookStore;
import utility.Utility;

public class BookStoreTestCases {
	WebDriver driver;
	BookStore bookStore;
	@BeforeClass
	public void launchURL()
	{
		driver=Utility.getDriver();
		driver.get("https://demoqa.com/books");
		bookStore=new BookStore(driver);
	}
	@Test
	public void testBookStore()
	{
		bookStore.setSearchBox();
		bookStore.getSearchBox().sendKeys("Java Programming");
		bookStore.setLoginButton();
		bookStore.getLoginButton().click();
		
	}

}
