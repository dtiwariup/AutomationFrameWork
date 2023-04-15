package com.bdd.excelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String readExcel(int row, int col, String sheet) throws IOException {
		FileInputStream file=new FileInputStream("src\\main\\resource\\TestData\\testdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheets = workbook.getSheet(sheet);
		String value = sheets.getRow(row).getCell(col).toString();
		workbook.close();
		file.close();
		return value;
		
		
	}
}
