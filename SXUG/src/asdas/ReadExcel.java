package asdas;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.commons.io.FileUtils;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
	
		File src = new File("C:\\Users\\Shree\\Desktop\\ZerodhaWorksheet.xlsx");
		
		FileInputStream fis = new FileInputStream(src); // accept the file and converted to byte  
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);  //  total excel is loaed that is in xssfworkbook //if file is .xlx that time use hssfworkbook
		
	
		
	      XSSFSheet sheet1 =wb.getSheetAt(0);  // it will select the sheet 
		
	     String data0=sheet1.getRow(0).getCell(2).getStringCellValue(); //
	     
	    
	     
	     String data4=sheet1.getRow(0).getCell(0).getStringCellValue();
	     
	     int data7=(int) sheet1.getRow(1).getCell(1).getNumericCellValue();
	     
	     
	      
	      System.out.println("Data From Excel Is" +data0+data4);
	      
	       int rowcount  = sheet1.getLastRowNum();
	      
	       System.out.println("the count of row is" +rowcount);
	      
	       
	       
	       System.out.println("Data From Excel Is" +data7);
		      
	       int rowcountint  = sheet1.getLastRowNum();
	      
	       System.out.println("the count of row is" +rowcountint);
	       
	       
	       for(int j=1 ; j<rowcountint+1; j++)
	       {
	    	   
	    	 int data8 = (int) sheet1.getRow(j).getCell(1).getNumericCellValue();
	    	 
	    	 System.out.println(data8);
	    	  
	    
	    	   
	       }
	      
	       
	       
	       
	       for(int i=0 ; i<rowcount+1; i++)
	       {
	    	   
	    	  String data1 = sheet1.getRow(i).getCell(2).getStringCellValue();
	    	  
	    	  
	    	  String data6 = sheet1.getRow(i).getCell(0).getStringCellValue();
	    	  
	    	  
	    	// int data8 = (int) sheet1.getRow(i).getCell(1).getNumericCellValue();
	    	  
	       //   String data2= sheet1.getRow(i).getCell(1).getStringCellValue();   	  
	    	  
	    	  System.out.println(data1+  "         "  +    "         "  +data6 + "     "  + "     " );
	    	   
	       }
	       
	       
	       
	       
	       
	       
	       
	      wb.close();
	      
	      

	    
	     
	      
	      
	}

}
