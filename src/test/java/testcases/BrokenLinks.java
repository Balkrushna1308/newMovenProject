package testcases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utility.Utility;

public class BrokenLinks {
	@Test
	public void findBrokenLink() throws MalformedURLException, IOException
	{
		HttpURLConnection huc;
		WebDriver driver=Utility.getDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while(it.hasNext()){

		String url = it.next().getAttribute("href");
		huc=(HttpURLConnection) (new URL(url).openConnection());
		//huc.setRequestMethod("HEAD");
		huc.connect();
		int resCode=huc.getResponseCode();
		if(resCode==200)
			System.out.println(url+ " is Valid");
		else
			System.out.println(url+" is Broken");
	}
	}
		@Test
	public void findBrokenLink1() throws MalformedURLException, IOException
	{
		HttpURLConnection huc;
		WebDriver driver=Utility.getDriver();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while(it.hasNext()){

		String url = it.next().getAttribute("href");
		huc=(HttpURLConnection) (new URL(url).openConnection());
		//huc.setRequestMethod("HEAD");
		huc.connect();
		int resCode=huc.getResponseCode();
		if(resCode==200)
			System.out.println(url+ " is Valid");
		else
			System.out.println(url+" is Broken");
	}

}
}
