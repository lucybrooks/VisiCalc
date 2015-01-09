public class Spreadsheet {
 
 // private fields
  private Cell[][] sp;
  private static int rows=11;
  private static int cols=8;
  private static int columnWidth=12;
  private static int asciiOffset=64;
  private String border;
  private String borderRow;
  
 // private methods
 private static int getCol(String location) 
 {
  return location.charAt(0)-asciiOffset;
 }
 
 private static int getRow(String location) 
 {
  return Integer.parseInt(location.substring(1));
 }
 
 private static String padOrTruncateDisplayString(Cell cell) {
     // truncate string to length - 1 and display >
     String s = cell.getDisplayString();
     if (s.length() > columnWidth) {
       s = s.substring(0, columnWidth - 1) + ">";
     }
     // if length is odd pad end to even length
     if (s.length() % 2 == 1) {
       s += " ";
     }
     // justify pad to center in cell
     while (s.length() < columnWidth) {
       s = " " + s + " ";
     }
     return s;
 }
 
 // constructor
 public Spreadsheet() 
 {
   sp=new Cell[rows][cols];
   sp[0][0]=new CellString("");
   String border="";
   for(int i=0; i<columnWidth; i++)
   {
     border+="-";
   }
   String borderRow=border+"+";
   for(int col=1; col<cols; col++)
   {
     sp[0][col]=new CellString((asciiOffset+col)+"");
     borderRow+=border+"+";
   }
   for(int row=1; row<rows; row++)
   {
     sp[row][0]=new CellString((asciiOffset+row)+"");
     for(int col=1; col<cols; col++)
     {
       sp[row][col]=new CellString("");
     }
   }
 }
 
 // mutators
 public void setCell(String location, Cell cell) 
 {
   
 }
 
 // accessors
 public Cell getCell(String location) 
 {
  return ;
 }
 
 public void print() 
 {
   //
 }
}
