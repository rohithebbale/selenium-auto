package POP_up;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exclproperty {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("./driver/result.xlsx");
		Workbook w = WorkbookFactory.create(f);
		String data = w.getSheet("rrr").getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);
		
		//Q: WAS to read the data from the excel ?
		
	}

}
