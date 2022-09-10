package POP_up;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class multipledatainEXCL {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("./driver/result.xlsx");
Workbook w = WorkbookFactory.create(f);
		int count = w.getSheet("rrr").getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			String a = w.getSheet("rrr").getRow(2).getCell(2).getStringCellValue();
			String b = w.getSheet("rrr").getRow(3).getCell(3).getStringCellValue();
			System.out.println(a+" "+b);
		}
		
		//Q: WAS to read multiple data from the excel ?
	}

}
