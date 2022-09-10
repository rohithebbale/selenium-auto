package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis = new FileInputStream("./driver/data/result.xlsx");
Workbook wb = WorkbookFactory.create(fis);
wb.getSheet("rrr").getRow(2).getCell(1).setCellValue("rani");
FileOutputStream fos = new FileOutputStream("./driver/data/result.xlsx");
wb.write(fos);
wb.close();


	}

}
