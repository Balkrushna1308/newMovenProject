package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePages {
	WebDriver driver;
	WebElement userNameTextBox,genderRadioButton,dateOfBirthPicker,checkBox, selectYear,hobbiesCheckBox;
	WebElement fileUpload;
	public HomePages(WebDriver driver)
	{
		this.driver=driver;
	}
	public WebElement getUserNameTextBox() {
		return userNameTextBox;
	}
	public void setUserNameTextBox() {
		
		this.userNameTextBox = driver.findElement(By.xpath("//input[@id='firstName']"));
	}
	public WebElement getGenderRadioButton() {
		return genderRadioButton;
	}
	public void setGenderRadioButton() {
		this.genderRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
	}
	public WebElement getDateOfBirthPicker() {
		return dateOfBirthPicker;
	}
	public void setDateOfBirthPicker() {
		this.dateOfBirthPicker = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public void setCheckBox() {
		this.checkBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
	}
	public WebElement getSelectYear() {
		return selectYear;
	}
	public void setSelectYear() {
		this.selectYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	}
	public WebElement getHobbiesCheckBox() {
		return hobbiesCheckBox;
	}
	public void setHobbiesCheckBox() {
		this.hobbiesCheckBox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']"));
	}
	public WebElement getFileUpload() {
		return fileUpload;
	}
	public void setFileUpload() {
		this.fileUpload = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
	}

}
