package IntegrationOfXcelWithDataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Test1 
{
	@DataProvider(name="getdata",parallel = true)
	public  String[][] getdata() throws Exception
	{
		File file=new File("D:\\TestNg practise\\TestNg\\src\\test\\resources\\Xel.xlsx");
		//System.out.println(file.exists());
		//reading the raw data
		FileInputStream input=new FileInputStream(file);
		//converting raw data into workbook
		XSSFWorkbook workbook=new XSSFWorkbook(input);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		int noofrows=sheet.getPhysicalNumberOfRows();
		int noofcolumns=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[noofrows-1][noofcolumns];
		for(int i=0;i<noofrows-1;i++)
		{
			for(int j=0;j<noofcolumns;j++)
			{
				DataFormatter formater=new DataFormatter();
				data[i][j]=formater.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		return data; 	
//		for(String[] dataarray:data)
//		{
//			System.out.println(Arrays.toString(dataarray));
//		}
		
	}

}
