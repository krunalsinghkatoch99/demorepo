package com.selenium.masterpart2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HandleAlerts {

		WebDriver driver=null;
		
		@BeforeMethod
		public void openBrowser(){
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\krunal\\Workspace\\myFirstSelenium\\Drivers\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		}
		@AfterMethod
		public void closeBrowser()
		{
			driver.quit();
		}
		@Test
		public void handleJavaScriptalerts()
		{
			driver.get("https://www.rediff.com/");
			
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[1]")).click();	
			WebElement username= driver.findElement(By.id("login1"));
			username.sendKeys("krunalsinghkatoch@gmail.com	");
			
			WebElement signbtn= driver.findElement(By.name("proceed"));
			signbtn.click();
			
			Alert alt= driver.switchTo().alert();
			System.out.println(alt.getText());
			alt.accept();
			
			WebElement pass= driver.findElement(By.name("password"));
			pass.sendKeys("twinkle8427");
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
