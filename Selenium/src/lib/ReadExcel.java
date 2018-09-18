package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File ("C:\\Users\\Redirection\\pravev2\\Desktop\\TD\\Selenium\\Read.xlsx");
		FileInputStream fls = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook (fls);
		int rowcount = wb.getSheetAt(0).getLastRowNum();
		System.out.println("Total row count is "+rowcount);
		for (int i = 0; i <=rowcount; i++) {
			
			String data= wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
			System.out.println("The value is "+data);
		}
		
		/*String data= wb.getSheetAt(0).getRow(0).getCell(0).getStringCellValue();
		System.out.println("The value is "+data);
		
		String data1= wb.getSheetAt(0).getRow(0).getCell(1).getStringCellValue();
		System.out.println("The value is "+data1);*/
	}
}
