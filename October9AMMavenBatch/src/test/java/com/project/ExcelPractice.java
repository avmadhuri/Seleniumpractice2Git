package com.project;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelPractice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream file1=new FileInputStream("C:\\Users\\matchaka\\Desktop\\JCP_Automation\\testdata1.xlsx");

		XSSFWorkbook wb= new XSSFWorkbook(file1);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row =sheet.getRow(2);
		XSSFCell cell =row.getCell(1);
		
		String cellvalue= cell.getStringCellValue();
		System.out.println(cellvalue);
		wb.close();
		file1.close();
		
		//String str=cell
		
		
	}

}
