package testData;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Readandwrite {

	public static void main(String[] args) {
	

		 try {
			 
			  File src=new File("D:\\finalsheet.xls");


			   FileInputStream fis=new FileInputStream(src);
			 
			   
			   HSSFWorkbook wb=new HSSFWorkbook(fis);
			   
			  
			      HSSFSheet sh1= wb.getSheetAt(0);

			 System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());

			 System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());

			 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());

			 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());

			 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());

			 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
			 
			  } catch (Exception e) {

			   System.out.println(e.getMessage());

			  }
			  
			 }
			 
			}

