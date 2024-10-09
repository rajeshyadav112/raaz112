package excelutils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
public class Excelutil {
	


	    private Workbook workbook;

	    public Excelutil(String filePath) throws IOException {
	        FileInputStream fis = new FileInputStream(filePath);
	        workbook = new XSSFWorkbook(fis);
	    }

	    public String getCellData(String sheetName, int rowNumber, int cellNumber) {
	        Sheet sheet = workbook.getSheet(sheetName);
	        Row row = sheet.getRow(rowNumber);
	        Cell cell = row.getCell(cellNumber);
	        return cell.getStringCellValue();
	    }

	    public int getRowCount(String sheetName) {
	        return workbook.getSheet(sheetName).getLastRowNum();
	    }

	    public void closeWorkbook() throws IOException {
	        workbook.close();
	    }
	}


