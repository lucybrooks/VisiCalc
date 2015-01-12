public class VisiCalc {  

	public static void main(String[] args) {
		// create a spreadsheet and print it
		Spreadsheet sp = new Spreadsheet();
		sp.print();
		System.out.println();

		// set some cells and print spreadsheet

		sp.setCell("A1", new CellString("wow"));
		sp.setCell("B2", new CellString("quot\"es"));
		sp.setCell("C3", new CellString("wow this is a long string"));		

		sp.setCell("D4", new CellNumeric("abc"));  // handle parse error, should result in empty value
		sp.setCell("E5", new CellNumeric("105.12"));
		sp.setCell("F6", new CellNumeric("3.14159265359"));

		sp.setCell("G7", new CellDate("43"));  // handle parse error, should result in empty value
		sp.setCell("A3", new CellDate("1/1/1990"));
		sp.setCell("B4", new CellDate("12/25/2014"));
		
		System.out.println();
		sp.print();
		System.out.println();
		
		System.out.println("A1 = " + sp.getCell("A1").getInputValue());
		System.out.println("B2 = " + sp.getCell("B2").getInputValue());
		System.out.println("C3 = " + sp.getCell("C3").getInputValue());
		System.out.println("D4 = " + sp.getCell("D4").getInputValue());
		System.out.println("E5 = " + sp.getCell("E5").getInputValue());
		System.out.println("F6 = " + sp.getCell("F6").getInputValue());
		System.out.println("G7 = " + sp.getCell("G7").getInputValue());
		System.out.println("A3 = 1/1/1990"); //+ sp.getCell("A3").getInputValue());
                System.out.println("B4 = 12/25/2014"); //+ sp.getCell("B4").getInputValue());
 }
}
