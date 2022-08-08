package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPage {
	WebDriver driver;
	WebElement alertButton;
	WebElement timerAlertButton;
	WebElement confirmButton;
	WebElement promtElement;

	public AlertPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAlertButton() {
		
		return alertButton;
	}

	public void setAlertButton() {
		this.alertButton = driver.findElement(By.xpath("//button[@id='alertButton']"));
	}

	public WebElement getTimerAlertButton() {
		return timerAlertButton;
	}

	public void setTimerAlertButton() {
		this.timerAlertButton = driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	}

	public WebElement getConfirmButton() {
		return confirmButton;
	}

	public void setConfirmButton() {
		this.confirmButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	}

	public WebElement getPromtElement() {
		return promtElement;
	}

	public void setPromtElement() {
		this.promtElement = driver.findElement(By.xpath("//button[@id='promtButton']"));
	}

	

}
