package seleniumTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandleExcelSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File excel=new File("D:\\ExcelDate.xlsx");
		
		try {
			FileInputStream inputstream=new FileInputStream(excel);
			
				XSSFWorkbook wb=new XSSFWorkbook(inputstream);
				
				XSSFSheet sheet1=wb.getSheet("Details");
				
				XSSFRow row1=sheet1.getRow(0);
				
				XSSFCell cell1=row1.getCell(1);
				
				String str=cell1.getStringCellValue();
				
				System.out.println(str);
				
				XSSFCell cell2=row1.createCell(3);
				
				cell2.setCellValue("Column 4 Header");
				
				XSSFRow row5=sheet1.createRow(5);
				
				row5.createCell(0).setCellValue("First");
				row5.createCell(1).setCellValue("Second");
			
				FileOutputStream Ouput = new FileOutputStream("D:\\ExcelDate.xlsx");
				
				wb.write(Ouput);
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
