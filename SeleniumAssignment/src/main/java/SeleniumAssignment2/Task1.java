package SeleniumAssignment2;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import Selenium.SeleniumAssignment.BaseClass;

public class Task1 extends BaseClass{
	WebDriver driver=null;
String email = "Test86@olay.com";
String email1="Test63@olay.com";
String pw = "Test@123";
String confirmPw = "Test@123";
String firstname = "Selenium";
String lastname ="Auto";
String date = "4";
String month ="4";
String year = "1996";
String address = "5";
String postal = "10115";
String city = "Berlin";
	@Test
	public void test()throws IOException, InterruptedException
	{
		Task1 obj = new Task1();
	    Properties ob=obj.ReadObjectRepo();
	    if(obj.ReadCountry().getProperty("country").equalsIgnoreCase("UK"))
	    {

	   driver.get("https://www.olay.co.uk/en-gb");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
       driver.findElement(By.xpath("//*[@id='skinAdvisor-banner']/span[1]/img")).click();
       obj.RegisteredOlay("UK",email, pw, confirmPw, firstname, lastname, date, month, year,driver);
       obj.signOut(driver);
       
	    }
	    else if(obj.ReadCountry().getProperty("country").equalsIgnoreCase("Germany"))
	    {
       driver.get("https://www.olaz.de/de-de");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']")).click();
       obj.registerOlayGermany(firstname, lastname, email1, pw, confirmPw, date, month, year, address, postal, city, driver);    
       obj.signOut(driver);
	    }
	    else
	    {
	        System.out.println("Enter valid country, allowed countries are UK, Germany, Spain");

	    }
         	//close Chrome
       
       driver.close();       
       
      
	}



	}

