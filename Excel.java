package Test;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	

		public static void main(String[] args) throws Exception {
			
			//Get the path
			String path = System.getProperty("user.dir") +"\\src\\test\\resources\\age.xlsx";
			//System.out.println(path);
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			if(wb!=null)
			{
				System.out.println("Connection Success");
				
			}
				
			else
			{
			System.out.println("Connection Failed");
			}
			wb.close();
		}
}
