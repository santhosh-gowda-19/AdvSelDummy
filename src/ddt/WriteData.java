package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C://Users//QSPR//Desktop//Weekend_Test_Automation//TestData.xlsx");
		Workbook Book = WorkbookFactory.create(fis);
		Sheet Sh = Book.getSheet("Sheet1");
		Row rw = Sh.getRow(0);
		Cell cl = rw.createCell(0);
		rw.createCell(1).setCellValue("entering 2nd cell data");
		cl.setCellValue("132356878768");
		FileOutputStream fos = new FileOutputStream("C://Users//QSPR//Desktop//Weekend_Test_Automation//TestData.xlsx");
		Book.write(fos);
	}

}
