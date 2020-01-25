package Generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	String Filepath;
	public ExcelUtilities(String Filepath)
	
	{
		this.Filepath=Filepath;
	}
	public String readData(String sheet, int row, int cell) throws IOException {
		String value=null;
		try {
		File file=new File(Filepath);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		Cell cl = wb.getSheet(sheet).getRow(row).getCell(cell);
		
		switch (cl.getCellType())
		{
		case STRING:
		{
			value=cl.getStringCellValue();
			break;
		
		}
		case NUMERIC:
		{
			if(DateUtil.isCellDateFormatted(cl))
			{
				Date datedcell = cl.getDateCellValue();
				SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
				sdf.format(datedcell);
			}
			else {
				long longvalue = (long) cl.getNumericCellValue();
			value=	Long.toString(longvalue);
			
			}
			break;
		}
			case BOOLEAN:
			{
				boolean booleancell = cl.getBooleanCellValue();
				value=Boolean.toString(booleancell);
				
			}
			break;
			
			default:
				System.out.println("cell format is not matching");
				
				
		}		
		}
		catch(EncryptedDocumentException e)
		{
			e.printStackTrace();
		}
				
		catch(IOException e)
		{
			e.printStackTrace();
		}		
		
		return value;
		
	}

}
