package SeleniumAssignment2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import Selenium.SeleniumAssignment.BaseClass;
import Selenium.SeleniumAssignment.Task4;

public class Task2 extends BaseClass{
	FileInputStream fis=null;
	public FileOutputStream fileOut=null;
	private XSSFWorkbook workbook=null;
	private XSSFSheet sheet=null;
	private XSSFRow row=null;
	private XSSFCell cell=null;
	 static String path= null;

	 //Constructor
	 public void SharmiliExcelReader() throws IOException{
	path =System.getProperty("user.dir")+("\\src\\TestData\\Testdata.xlsx");
	fis = new FileInputStream(path);
	workbook =new XSSFWorkbook(fis);
	sheet=workbook.getSheetAt(0);
	 }
	 
	 public int getSheetRows(String sheetName) {
		 int index=workbook.getSheetIndex(sheetName);
		 sheet=workbook.getSheetAt(index);
		return (sheet.getLastRowNum()+1);
	 }
	 
	 public int getSheetColumns(String sheetName) {
		 int index=workbook.getSheetIndex(sheetName);
		 sheet=workbook.getSheetAt(index);
		 row=sheet.getRow(0);
		return (row.getLastCellNum());
	 }
	 
	 public String getCellData(String sheetName,int colNum, int rowNum) {
		int index = workbook.getSheetIndex(sheetName);
		sheet=workbook.getSheetAt(index);
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		 return (cell.getStringCellValue());
		 }
	
	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		Task2 reader = new Task2();
		Task2 ob=new Task2();
	    WebDriver driver=ob.driver();
		String data = reader.getCellData("Test1", 0, 1);
		String data1=reader.getCellData("Test1", 1, 1);
		System.out.println(reader.getSheetRows("Test1"));
		  
	       path =System.getProperty("user.dir")+("\\src\\TestData\\Testdata.xlsx");
	       

	       driver.get("https://www.olay.es/es-es");
	       
	       driver.findElement(By.xpath("//*[@id='phdesktopheader_0_phdesktopheadertop_2_pnlCRMHeaderLink']/div/a[2]")).click();
	        
	        driver.findElement(By.xpath("//*[@id='BrandComWebsite']/body/div[1]/div[2]/div[4]/div[2]/div/button")).click();
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_imgfemale']")).click();
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[firstname]']")).sendKeys("Web");
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[lastname]']")).sendKeys("Automation");

	      
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[emails][0][address]']")).sendKeys("test@gmail.com");
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][password]']")).sendKeys("Test@123");
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[password][confirm]']")).sendKeys("Test@123");
	        
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']")).click();
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][day]']/option[5]")).click();
	        
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']")).click();
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][month]']/option[4]")).click();
	        
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']")).click();
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_consumer[birthdate][year]']/option[4]")).click();

	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_grs_account[phones][0][fulltelephonenumber]']")).sendKeys("+3456789012");
	        driver.findElement(By.xpath("//*[@id='phdesktopbody_0_submit']")).click();
	        System.out.println("Passed");
	       

		}


}
