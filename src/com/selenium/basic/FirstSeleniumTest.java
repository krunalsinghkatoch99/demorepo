package com.selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstSeleniumTest {

	@Test
	public void verifyhomepage()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\krunal\\Workspace\\myFirstSelenium\\Drivers\\geckodriver.exe");
		String URL ="https://www.facebook.com" ;
		WebDriver driver=new FirefoxDriver();
		driver.get(URL);
		
		String pageTitle= driver.getTitle();
		System.out.println("pagetitle: "+ pageTitle);
		Assert.assertEquals(pageTitle, "Facebook – log in or sign up");
		driver.close();
	}
}
