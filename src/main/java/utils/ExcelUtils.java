package utils;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.IOException;

public class ExcelUtils {
	
	public static Object[][] readExcelData(String filePath, String sheetName){
		Object [][]data=null;
		
		try(FileInputStream fis=new FileInputStream(filePath); 
				Workbook workbook=new XSSFWorkbook(fis)){
			
			Sheet sheet=workbook.getSheet(sheetName);
			int rowCount=sheet.getPhysicalNumberOfRows();
			int colCount=sheet.getRow(0).getLastCellNum();
			
			data=new Object[rowCount - 1][colCount];
			
			for (int i = 1; i < rowCount; i++) {
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = cell.toString();
                }
            }
		} catch (IOException e) {
            e.printStackTrace();
        }
        return data;
		}	
	}
