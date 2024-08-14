package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMultiple
{
	public static void main(String[] args) throws Exception, IOException 
	{
//		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		
		FileInputStream fis = new FileInputStream("C:\\Users\\QSPR\\Desktop\\Weekend_Test_Automation\\TestData.xlsx");
		Workbook Book = WorkbookFactory.create(fis);
		Sheet Sh = Book.getSheet("FLipkart");
		int Lr = Sh.getLastRowNum();
		for(int i =0;i<Lr;i++)
		{
			System.out.println(Sh.getRow(i).getCell(0).getStringCellValue());
//			Cell Cl = Rw.getCell(0);
//			String value = Cl.getStringCellValue();
//			System.out.println(value);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
