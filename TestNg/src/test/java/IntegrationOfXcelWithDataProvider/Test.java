package IntegrationOfXcelWithDataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Test {

	public static void main(String[] args) throws Exception
	{
	    File file=new File("D:\\TestNg practise\\TestNg\\src\\test\\resources\\Xel.xlsx");
	    System.out.println(file.exists());
	    //reading raw data
	    FileInputStream input=new FileInputStream(file);
	    //convert raw data into xcelworkbookformat
	    XSSFWorkbook workbook=new XSSFWorkbook(input);
	    //getting the sheet
	    XSSFSheet sheet=workbook.getSheet("Sheet1");
	    //including header row
	    System.out.println(sheet.getPhysicalNumberOfRows());
	    //excluding the header row
	    System.out.println(sheet.getLastRowNum());
	    int noofrows=sheet.getPhysicalNumberOfRows();
	    //knowing no of columns
	    int noofcolumns=sheet.getRow(0).getLastCellNum();
	    System.out.println(noofrows);
	    System.out.println(noofcolumns);
	    for(int i=0;i<noofrows;i++)
	    {
	    	for(int j=0;j<noofcolumns;j++)
	    	{
	    		//it will convert any data type into String Format
	    		DataFormatter formater=new DataFormatter();
	    		System.out.println(formater.formatCellValue(sheet.getRow(i).getCell(j)));
	    	   //System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
	    	}
	    }
	    workbook.close();
	    input.close();
	    

	}

}
