package seleniumTestCases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllContentinExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File excel=new File("D:\\ExcelDate.xlsx");
		
		try {
			FileInputStream inputstream=new FileInputStream(excel);
			
				XSSFWorkbook wb=new XSSFWorkbook(inputstream);
				
				XSSFSheet sheet1=wb.getSheet("Car");
				
			//	int rowcount=sheet1.getLastRowNum()-sheet1.getFirstRowNum();;
				
				int rowcount=sheet1.getLastRowNum();
				
				for(int j=0;j<rowcount;j++)
				{
					System.out.println(sheet1.getRow(j).getCell(3).getStringCellValue()+",");
				}
				System.out.println();
				
				/*
				 * for(int i=0;i<=rowcount;i++) { int
				 * cellcount=sheet1.getRow(i).getLastCellNum();
				 * 
				 * System.out.println("Row Number:"+i);
				 * 
				 * for(int j=0;j<cellcount;j++) {
				 * System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue()+","); }
				 * System.out.println();
				 * 
				 * }
				 */
				
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
