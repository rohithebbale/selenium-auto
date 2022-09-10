package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./driver/data/rr.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheet("xl").getLastRowNum();
		for(int i=0; i<rowcount; i++)
		{
			String un = wb.getSheet("xl").getRow(2).getCell(2).getStringCellValue();
			String pd = wb.getSheet("xl").getRow(1).getCell(1).getStringCellValue();
			System.out.println(un+pd);
		}
			
		
		
	}

}
