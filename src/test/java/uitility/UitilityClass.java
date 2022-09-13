package uitility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UitilityClass {
	public static String getTD(int rowindex,int colindex)throws Throwable {
		FileInputStream fis=new FileInputStream("E:\\Book2.xlsx");
		Sheet sk = WorkbookFactory.create(fis).getSheet("Sheet1");
		String data = sk.getRow(rowindex).getCell(colindex).getStringCellValue();
		return data;
	}
	
	}


