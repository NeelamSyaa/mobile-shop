package utiliticlass;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel  {
	static Workbook book;
	static	 Sheet sheet ;
	  public static void data() throws Exception {
		  
 String data = "C:\\Users\\Admin\\Downloads\\Filtered_Recharge_Compliance_Records (4).csv";
 
 FileInputStream  file = new FileInputStream(data);
 
           book = WorkbookFactory.create(file);
      Sheet sheet = book.getSheet("Sheet1");
	  }
      public String getData(int i, int j) {

          return sheet.getRow(i).getCell(j).getStringCellValue();
      }

      public void close() throws Exception {

          book.close();
      }
}
