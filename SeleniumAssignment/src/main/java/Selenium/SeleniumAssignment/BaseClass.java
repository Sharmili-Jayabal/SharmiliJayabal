package Selenium.SeleniumAssignment;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public void RegisteredOlay(String country,String email, String pw, String confirmPw,String firstname,String lastname,String day,String month,String year,WebDriver driver)
	{
		switch (country)
		{
		
		case "UK":
		{
		   driver.findElement(By.xpath("(//*[@class='event_profile_register'])[1]")).click();
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys(email);
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys(pw);
	       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys(confirmPw);
	       Select Day=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")));
	       Day.selectByIndex(Integer.parseInt(day));
	        Select Month=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")));
	        Month.selectByVisibleText(month);
	        Select Year=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")));
	        Year.selectByValue((year));
	       driver.findElement(By.id("phdesktopbody_0_submit")).click();
	        System.out.println("Registration completed successfully");	       
		}
		break;
		case "Spain":
				{
					 driver.findElement(By.xpath("//*[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']/div/a[2]")).click();

				       Random randomGenerator = new Random();
				       int randomInt = randomGenerator.nextInt(1000);
				       
				       driver.findElement(By.xpath("//*[@id='BrandComWebsite']/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
				       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_imgfemale']")).click();
				       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[firstname]']")).sendKeys(firstname);
				       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[lastname]']")).sendKeys(lastname);

				     
				       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("username"+ randomInt +"@gmail.com");
				       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys(pw);
				       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys(confirmPw);				       				  
				      
				       Select Day=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")));
				       Day.selectByIndex(Integer.parseInt(day));
				        Select Month=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")));
				        Month.selectByVisibleText(month);
				        Select Year=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")));
				        Year.selectByValue((year));
				       driver.findElement(By.id("phdesktopbody_0_submit")).click();
				        System.out.println("Registration completed successfully");	
				}
				break;
		case "Germany":
			 driver.findElement(By.xpath("//*[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']/div/a[2]")).click();
		       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys(email);
		       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys(pw);
		       driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys(confirmPw);
		       Select Day=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")));
		       Day.selectByIndex(Integer.parseInt(day));
		        Select Month=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")));
		        Month.selectByVisibleText(month);
		        Select Year=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")));
		        Year.selectByValue((year));
		       driver.findElement(By.id("phdesktopbody_0_submit")).click();
		        System.out.println("Registration completed successfully");	
	}
}
public void signOut(WebDriver driver)
{
	driver.findElement(By.xpath("//*[@title='Sign Out'] | //*[@id='phdesktopheader_0_phdesktopheadertop_2_LogOffLink']")).click();
	driver.findElement(By.xpath("//*[@title='Logout'] | //*[@id='phdesktopheader_0_phdesktopheadertop_2_anchrContinue']")).click();
}

public Properties ReadCountry() throws IOException
{
    Properties obj = new Properties();
    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\country.properties");
    obj.load(objfile);
    return obj;
}
public Properties ReadObjectRepo() throws IOException
{
	 Properties obj = new Properties();
	 FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\objRepo.properties");
	 obj.load(objfile);
	 return obj;
}
public void registerOlayGermany(String fn,String sn,String email,String pass,String confirmpass,String day,String month,String year,String address,String postle,String city,WebDriver driver) throws IOException
{
	 Random randomGenerator = new Random();
     int randomInt = randomGenerator.nextInt(1000);
     
    driver.findElement(By.xpath("(//*[@class='event_profile_register'])[1]")).click();
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_imgfemale']")).click();
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[firstname]']")).sendKeys(fn);
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[lastname]']")).sendKeys(sn);
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("username"+ randomInt +"@gmail.com");
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys(pass);
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys(confirmpass);
    Select Day=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")));
    Day.selectByIndex(Integer.parseInt(day));
     Select Month=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")));
     Month.selectByVisibleText(month);
     Select Year=new Select(driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")));
     Year.selectByValue((year));	       
     driver.findElement(By.xpath("//*[@id='phdesktopbody_0_labelgrs_account[addresses][0][line1]']")).sendKeys(address);
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[addresses][0][postalarea]']")).sendKeys(postle);
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_labelgrs_account[addresses][0][city]']")).sendKeys(city);
    driver.findElement(By.xpath("//*[@id='phdesktopbody_0_submit']")).click();
    System.out.println("Registration completed successfully");
}

public Properties ReadBrowserProp() throws IOException
{
	 Properties obj = new Properties();
	 FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\browser.properties");
	 obj.load(objfile);
	 return obj;
}

public WebDriver driver() throws IOException
{
	WebDriver driver=null;
	if(ReadBrowserProp().getProperty("browser").equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriv"
				+ "er.chrome.driver","C:\\Program Files\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else if(ReadBrowserProp().getProperty("browser").equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sharmilee\\Downloads\\geckodriver-v0.26.0-win64\\GeckoDriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette",true); 
		  driver = new FirefoxDriver();

	}
	return driver;
}

}