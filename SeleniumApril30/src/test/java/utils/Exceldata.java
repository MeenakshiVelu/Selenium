package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	XSSFWorkbook workbook;   
	XSSFSheet sheet;   

	Exceldata(String path, String sheetname){
		try {
			workbook = new XSSFWorkbook(path);
			sheet = workbook.getSheet(sheetname);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int get_rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}
	
	public int get_colCount() {
		return sheet.getRow(0).getPhysicalNumberOfCells();
	}
	
	

	public String get_cellData(int row, int col) {

		int rowCount = sheet.getPhysicalNumberOfRows(); //get row count
		//to get celldata
	
			String cellData_s = sheet.getRow(row).getCell(col).getStringCellValue();
			System.out.println(cellData_s);
		
			//double cellData_i = sheet.getRow(row).getCell(col).getNumericCellValue();
			//System.out.println(cellData_i);

		return cellData_s;

	}
}
