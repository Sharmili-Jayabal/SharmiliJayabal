import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Click on each item and print their names
	   driver.get("https://www.makemytrip.com/");
       Thread.sleep(2000);
       
       driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[1]/ul/li[1]")).click();
       //Select From 
       driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[1]/label")).click();
       driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-0']/div/div[1]/p[1]")).click();
       //Select To
       driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[2]")).click();
       driver.findElement(By.xpath("//*[@id='react-autowhatever-1-section-0-item-2']/div/div[1]/p[1]")).click();
       
       driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/label/p[1]"));
       driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[3]/div[5]")).click();
       //Search button
       driver.findElement(By.xpath("//*[@id='root']/div/div[2]/div/div/div[2]/p/a")).click();
       
       System.out.println("Passed");

       //close Chrome     
       driver.close();
       
	}

}
