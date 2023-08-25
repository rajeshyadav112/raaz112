package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromexcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	File fls=new File("./ducat/src/test/java/dataDrivenTesting/ReadDataFromexcel.java");
		FileInputStream fis=new FileInputStream(fls);
		
      XSSFWorkbook  workbook =new XSSFWorkbook(fis);
		  
      Sheet sh = workbook.getSheetAt(0);
     Row rw = sh.getRow(0);
    Cell cell = rw.getCell(0);
    
    System.out.println(cell.getNumericCellValue());
	}
}
 