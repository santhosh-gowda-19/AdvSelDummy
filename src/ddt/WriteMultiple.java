package ddt;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteMultiple 
{
	public static void main(String[] args) throws Exception, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		FileInputStream fis = new FileInputStream("C:\\Users\\QSPR\\Desktop\\Weekend_Test_Automation\\TestData.xlsx");
		Workbook Book = WorkbookFactory.create(fis);
		Sheet Sh = Book.createSheet("Flipkart");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();//100
		for(int i=0;i<count;i++)
		{
			WebElement link = links.get(i);//1
			String url = link.getAttribute("href");//1
			Row Rw = Sh.createRow(i);
			Cell Cl = Rw.createCell(0);
			Cl.setCellValue(url);	
		}
		FileOutputStream fos = new FileOutputStream("C:\\Users\\QSPR\\Desktop\\Weekend_Test_Automation\\TestData.xlsx");
		Book.write(fos);
	}

}
