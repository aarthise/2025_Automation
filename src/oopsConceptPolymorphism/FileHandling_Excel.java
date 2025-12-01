package oopsConceptPolymorphism;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileHandling_Excel {

	
	public static void readexceldata() throws IOException {
		FileInputStream fis  = new FileInputStream("C:\\Users\\karth\\eclipse-workspace\\2025_QA Training\\TestData\\abc.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 =wb.getSheet("Sheet2");
		
		int nr = sh1.getPhysicalNumberOfRows();
		
		for(int i=0;i<nr;i++) {
			XSSFRow row = sh1.getRow(i);
			
			int nc = row.getPhysicalNumberOfCells();
			
			for(int j=0;j<nc;j++) {
				XSSFCell col = row.getCell(j);
				System.out.println(col.getStringCellValue()+"  ");

			}

		}
		
		/*XSSFRow row1 = sh1.getRow(0);

		XSSFCell col1 = row1.getCell(0);
		System.out.println(col1.getStringCellValue()+"  ");
		
		XSSFCell col2 = row1.getCell(1);
		System.out.println(col2.getStringCellValue()+"  ");
		
		System.out.println();
		
		XSSFRow row2 = sh1.getRow(1);
		XSSFCell col21 = row1.getCell(0);
		System.out.println(col21.getStringCellValue()+"  ");
		
		XSSFCell col22 = row1.getCell(1);
		System.out.println(col22.getStringCellValue()+"  ");
		
		XSSFCell col23 = row1.getCell(2);
		System.out.println(col23.getStringCellValue()+"  ");
		
		System.out.println();*/
		
	}
	
	public static void main(String[] args) throws IOException {
		readexceldata();
	}
	
}
