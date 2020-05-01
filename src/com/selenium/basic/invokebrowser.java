package com.selenium.basic;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class invokebrowser 
{
	@Test
	public void verifyFaceBookHomePage()
	{
		int browser;
		Scanner sc=new Scanner(System.in);
		   
		  System.out.println("Choose Webbrowser name:");
		  System.out.println("1. Chrome\n2. Firefox\n3. Microsoft Edge");
		  browser=sc.nextInt();
		  
		  String URL="https://facebook.com";
		  WebDriver driver;
		  switch(browser)
		  {
		  case 1:
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\krunal\\Workspace\\myFirstSelenium\\Drivers\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();				
			  driver.get(URL);
			  break;
		  case 2:
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\krunal\\Workspace\\myFirstSelenium\\Drivers\\geckodriver.exe");
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();				
			  driver.get(URL);
			  break;
		  case 3:
			  System.setProperty("webdriver.edge.driver", "C:\\Users\\krunal\\Workspace\\myFirstSelenium\\Drivers\\msedgedriver.exe");
			  driver = new EdgeDriver();
			  driver.manage().window().maximize();				
			  driver.get(URL);
			  break;
		 default:
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\krunal\\Workspace\\myFirstSelenium\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			 driver.manage().window().maximize();				
			 driver.get(URL);
			 break;
		  }
		  sc.close();
		  driver.quit();
	}
}