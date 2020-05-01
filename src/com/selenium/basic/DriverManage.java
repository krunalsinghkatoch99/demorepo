package com.selenium.basic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class DriverManage {
WebDriver driver;
	
	@BeforeClass
	public void setUpClass()
	{
		 WebDriverManager.chromedriver().setup();
		 WebDriverManager.firefoxdriver().setup();
		 WebDriverManager.edgedriver().setup();
	}
	
	@Test
	public void verifyPage()
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
			 
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();				
			  driver.get(URL);
			  try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  break;
		  case 2:
			  driver = new FirefoxDriver();
			  driver.manage().window().maximize();				
			  driver.get(URL);
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  break;
		  case 3:
			  driver = new EdgeDriver();
			  driver.manage().window().maximize();				
			  driver.get(URL);
			  try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			  break;
		  
		default:
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();				
			 driver.get(URL);
			 try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 break;
		  }
		  sc.close();
		  driver.quit();
	}
}
