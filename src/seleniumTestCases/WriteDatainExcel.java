package seleniumTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatainExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File excel = new File("D:\\ExcelDate.xlsx");
		
		FileInputStream inputstream;
		try {
			inputstream = new FileInputStream(excel);
		
		//	XSSFWorkbook wb1=new XSSFWorkbook(inputstream);
			
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		
		
		XSSFSheet sheet1=wb.getSheet("Details");
		
		XSSFRow row1 = sheet1.getRow(1);
		
		XSSFCell newcell=row1.createCell(5);
		
		newcell.setCellValue("Test Data");
		
		XSSFRow newrow= sheet1.createRow(7);
		
		newrow.createCell(0).setCellValue("Rahul");
		newrow.createCell(1).setCellValue("Last Name");
		
		FileOutputStream output=new FileOutputStream("D:\\ExcelDate.xlsx");
		
		wb.write(output);
	
		
		XSSFCell cell1 = row1.getCell(0);
		
		String value=cell1.getStringCellValue();
		
		System.out.println(value);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
