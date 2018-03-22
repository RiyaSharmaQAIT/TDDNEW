package testData;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
public class Readwrite {
	
	
public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

	
	File path = new File("D:\\finalsheet.xls");
		
		FileInputStream fis = new FileInputStream(path);
		
		HSSFWorkbook workbook = new  HSSFWorkbook(fis);
		
        Sheet firstSheet = workbook.getSheetAt(0);
		
/*		Workbook wb = null;
		
		 String fileExtensionName = fileName.substring(fileName.indexOf("."));
		 
		 if(fileExtensionName.equals(".xlsx")){
			 
			 
			wb = new XSSFWorkbook(fis);
			 }
		 
		 else if(fileExtensionName.equals(".xls")){
			 
			wb  = new HSSFWorkbook(fis);
		 }*/
		/*Sheet  excelSheet = firstSheet.getSheet("Sheet1");
				 
				 int rowCount = excelSheet.getLastRowNum()-excelSheet.getFirstRowNum();
				 
				 for (int i = 0; i < rowCount+1; i++) {

				        Row row =  excelSheet.getRow(i);

				          for (int j = 0; j < row.getLastCellNum(); j++) {

				         System.out.print(row.getCell(j).getStringCellValue()+"# ");

				        }

				        System.out.println();

				 }*/
        Iterator<Row> iterator = firstSheet.iterator();
        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            Iterator<Cell> cellIterator = nextRow.cellIterator();
             
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                 
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                }
                System.out.print(" - ");
            }
            System.out.println();
        }
         
        workbook.close();
        fis.close();
				    }
				 
				 public static void main(String...strings) throws IOException{
		 
		Readwrite rw = new Readwrite();
		
		String FilePath = "D:\\spreadsheet1.xls";
	rw.readExcel("D:\\spreadsheet1.xls", "finalsheet", "sheet1");
	
	
	}
	

}
