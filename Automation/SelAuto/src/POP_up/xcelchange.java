package POP_up;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xcelchange {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("./driver/result.xlsx");
		Workbook w = WorkbookFactory.create(f);
		w.getSheet("rrr").getRow(2).getCell(2).setCellValue("omm");
		FileOutputStream fos = new FileOutputStream("./driver/result.xlsx");
		w.write(fos);
		w.close();
	}

}
////Q: WAS to write the data back into the Excel ?