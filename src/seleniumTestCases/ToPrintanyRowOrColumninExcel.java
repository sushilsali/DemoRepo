package seleniumTestCases;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ToPrintanyRowOrColumninExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File excel = new File("D:\\ExcelDate.xlsx");
		
		FileInputStream inputstream;
		try {
			inputstream = new FileInputStream(excel);
		
		//	XSSFWorkbook wb1=new XSSFWorkbook(inputstream);
			
		XSSFWorkbook wb = new XSSFWorkbook(inputstream);
		
		
		XSSFSheet sheet1=wb.getSheet("Details");
		
		int rowcount=sheet1.getLastRowNum()-sheet1.getFirstRowNum();
		
		for(int i=0;i<=rowcount;i++)
		{
			int cellcount=2;
			
			//System.out.println("Row number:"+i);
			
			for(int j=cellcount;j<cellcount+1;j++)
			{
				System.out.println(sheet1.getRow(i).getCell(j).getStringCellValue()+",");
			}
			//System.out.println();
		}
		
		//XSSFRow row1 = sheet1.getRow(1);
		
		//XSSFCell cell1 = row1.getCell(0);
		
		//String value=cell1.getStringCellValue();
		
		//System.out.println(value);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
