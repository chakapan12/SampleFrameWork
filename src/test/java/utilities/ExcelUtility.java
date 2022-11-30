package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static XSSFWorkbook book;
	private static Sheet sheet;

	private static void openExcel(String filePath) {

		try {
			FileInputStream files = new FileInputStream(filePath);
			book = new XSSFWorkbook(files);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// load the worksheet
	private static void loadSheet(String sheetName) {
		sheet = book.getSheet(sheetName);
	}

	// row count
	private static int rowCount() {
		return sheet.getPhysicalNumberOfRows();
	}

	// col count
	private static int colCount() {
		return sheet.getRow(0).getLastCellNum();
	}

	private static String cellData(int rowIndex, int colIndex) {
		if (sheet.getRow(rowIndex).getCell(colIndex) == null) {
			return "";
		} else {
			return sheet.getRow(rowIndex).getCell(colIndex).toString();
		}
	}

	public static Object[][] excelIntoArray(String filePath, String sheetName) {
		openExcel(filePath);
		loadSheet(sheetName);
		int rows = rowCount();
		int cols = colCount();

		Object[][] data = new Object[rows - 1][cols];

		for (int i = 1; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				data[i - 1][j] = cellData(i, j);
			}
		}
		return data;

	}

}
