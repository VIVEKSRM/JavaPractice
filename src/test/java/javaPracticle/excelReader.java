package javaPracticle;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {

	//Identify Testcases coloum by scanning the entire 1st row
	//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
	//after you grab purchase testcase row = pull all the data of that row and feed into test

	public ArrayList<String> getData(String testcaseName) throws IOException
	{
		//fileInputStream arguments
		ArrayList<String> a=new ArrayList<String>();

		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\Project_Planing.xlsx");
		System.out.println("File Path: -"+System.getProperty("user.dir")+"\\src\\test\\resources\\Project_Planing.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("exampleReference"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				//Identify Testcases coloum by scanning the entire 1st row
				Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
				Row firstrow= rows.next();
				Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
				int k=0;
				int coloumn = 0;
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("HeaderCol1"))
					{
						coloumn=k;
					}
					k++;
				}
				System.out.println(coloumn);
				////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
				while(rows.hasNext())
				{
					Row r=rows.next();
					if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcaseName))
					{
						////after you grab purchase testcase row = pull all the data of that row and feed into test
						Iterator<Cell> cv=r.cellIterator();
						while(cv.hasNext())
						{
							Cell c=	cv.next();
							if(c.getCellType()==CellType.STRING)
							{
								a.add(c.getStringCellValue());
							}
							else{
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
						}
					}
				}
			}
		}
		return a;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		excelReader er=new excelReader();
		ArrayList li=er.getData("row4");
		//System.out.println(li.get(0));
		//System.out.println(li.get(1));
		for (Object i:li) {
			System.out.println(i.toString());
		}

	}

}
