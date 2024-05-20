package Utils;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import context.Constants;

public class ExcelReader {
	//get values from excel sheet by using normal method...method calling//
   // public static void main(String []args) throws IOException {
    	
    	//System.out.println(ExcelReader.getCellValue(1,2));
   // }
	public static String  getCellValue(int rowNumber, int cellNumber) throws IOException {
		FileInputStream fis = new FileInputStream(Constants.EXCELPATH);
		XSSFWorkbook xs= new XSSFWorkbook(fis);
		XSSFSheet sh=xs.getSheet("Sheet1");
		Row row=sh.getRow(rowNumber);
		Cell cell=row.getCell(cellNumber);
		return cell.toString();
	}
	
	

}
