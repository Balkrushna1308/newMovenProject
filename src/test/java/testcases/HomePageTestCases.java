package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.HomePages;
import utility.Utility;

public class HomePageTestCases {
	HomePages homePages;
	WebDriver driver;

	@BeforeClass
	public void launchURL() {
		driver = Utility.getDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		homePages = new HomePages(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		// driver.manage().window().maximize();
	}

	@Test
	public void verifyFormFilledSelection()
	{
		homePages.setUserNameTextBox();
		homePages.getUserNameTextBox().sendKeys("Avani");
		homePages.setGenderRadioButton();
		Utility.clickUsingJS(homePages.getGenderRadioButton(), driver);
		homePages.setDateOfBirthPicker();
		Utility.scrollToView(homePages.getDateOfBirthPicker(), driver);
		Utility.clickUsingJS(homePages.getDateOfBirthPicker(),driver);
		homePages.setSelectYear();
		Utility.selectValueFromDropDown(homePages.getSelectYear(), "1990");
		Utility.selectDateFromDatePicker(driver, "19");
		homePages.setHobbiesCheckBox();
		Utility.clickUsingJS(homePages.getHobbiesCheckBox(), driver);
		homePages.setFileUpload();
		homePages.getFileUpload().sendKeys("C:\\Users\\krushna\\Pictures\\ATTA.jpg");
	}

}
