package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./driver/data/result.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("rrr").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data);
		
		
		
	}

}
