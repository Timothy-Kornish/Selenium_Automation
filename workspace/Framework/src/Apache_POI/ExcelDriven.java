package Apache_POI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {
	
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static FileInputStream file;
	

	public static void main(String[] args) throws IOException{
		
		file = new FileInputStream(new File("/Users/TimmehK/Documents/data.xlsx"));
		wb = new XSSFWorkbook(file);
		
		String value = getCellData(2, 2);
		System.out.println(value);
		setCellValue(2,2, "Hallo Der");
		value = getCellData(2, 2);
		System.out.println(value);
	}
	
	public static String getCellData(int colNumber, int rowNumber) throws IOException {
		
		sheet = wb.getSheet("Sheet1");
		//excel shows 1-index, but java uses 0-index
		row = sheet.getRow(rowNumber);
		cell =  row.getCell(colNumber);
		return cell.getStringCellValue();
		
	}
	
	public static void setCellValue(int colNumber, int rowNumber, String message) throws IOException {
		sheet = wb.getSheet("Sheet1");
		//excel shows 1-index, but java uses 0-index
		row = sheet.getRow(rowNumber);
		cell =  row.getCell(colNumber);
		cell.setCellValue(message);
		
	}

}
