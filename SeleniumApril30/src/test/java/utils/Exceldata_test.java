package utils;

public class Exceldata_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		Exceldata excel = new Exceldata(projectPath+ "/Excel_files/data.xlsx", "Sheet1");
				excel.get_cellData(0, 0);
		//excel.get_cellData(1, 1);

	}

}
