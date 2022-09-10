package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet4 {


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis = new FileInputStream("./driver/data/rr.xlsx");
Workbook wb = WorkbookFactory.create(fis);
int rowcount = wb.getSheet("xl").getLastRowNum();
short cellcount = wb.getSheet("xl").getRow(1).getLastCellNum();
for(int i=1; i<rowcount; i++)
{
	String un = null;
	for(int j=0; j<cellcount; j++)
	un = wb.getSheet("xl").getRow(i).getCell(j).getStringCellValue();
	System.out.println(un);
}

	}
	

}
