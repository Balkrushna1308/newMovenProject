package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AlertPage;
import utility.Utility;

public class AlertPageTestCases {
	AlertPage alertPage;
	WebDriver driver;
	//public void 
	@BeforeClass
	public void lalunchURL()
	{
		this.driver=Utility.getDriver();
		driver.get("https://demoqa.com/alerts");
		alertPage=new AlertPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void alertHandle() throws InterruptedException
	{
		alertPage.setAlertButton();
		alertPage.getAlertButton().click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		alertPage.setTimerAlertButton();
		alertPage.getTimerAlertButton().click();
//		alert=driver.switchTo().alert();
//		alert.accept();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.alertIsPresent());
		alert=driver.switchTo().alert();
		alert.dismiss();
		alertPage.setPromtElement();
		Utility.scrollToView(alertPage.getPromtElement(), driver);
		Utility.clickUsingJS(alertPage.getPromtElement(), driver);
		alert=driver.switchTo().alert();
		alert.sendKeys("Alert Accepted");
		Thread.sleep(3000);
		alert.accept();
		alertPage.setConfirmButton();
		Utility.clickUsingJS(alertPage.getConfirmButton(), driver);
		alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		

	}
	

}
