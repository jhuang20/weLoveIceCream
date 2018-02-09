//Team Ice Cream (Shafali Gupta, James Huang,Kevin Feng )
//APCS2 pd 1
//HW03 -- I Am Still Searching
//2018-02-01

public class MatrixFinder {
/*OUR ALGO:
The essence of our algo is a recursive function, search, that goes through the 2D array from the top right to the bottom left. It's faster than just going from top left
to the end of the list because it allows us to take some shortcuts. If the vlaue you are looking for in greater than the number in the top right, you would move down
one row. If you get to the bottom right and the value is greater than the number at the bottom right, then return (-1,-1). If the number is smaller in any row, it
would go across to the left my one each time.
*/
//instance var
int[][] a;
int size;
String retStr = "";
//method
  public String isThere(int[][] c, int value){
    a=c;
    size=c.length-1;
    return search(0,size, value);
  }
//recursive function that snakes through the list(TOP RIGHT to BOTTOM )
  public String search(int row, int col, int value) {
    retStr = retStr;
    if (((row >= a.length) || (col <0))){
      retStr= "(-1, -1)";
    }
    //base case 2: we found the number, hooray!
    else if (a[row][col]==value) {
      retStr= "(" + row + "," + col + ")";
    return retStr;   }
    else if (a[row][col]<value) {
      search(row+1, size, value);//moves to next row, last number in array
    }
    else if(a[row][col]>value){//if its still possibble that the row has the number(still larger)
      search(row, col-1, value);//moves left in the list
	   }
    else {
      search(row+1, size, value);
    }


    return retStr;
  }

//prints out data in CSV form
    public static void printToCSV(MatrixFinder test, int[][] testedMatrix, int target){
        //System.out.println("target, size (nanos), size");
        long pre = System.nanoTime();
        test.isThere(testedMatrix, target);
		long current = System.nanoTime();
        System.out.println(target + ", " + testedMatrix.length + ", " + (current-pre));
    }
//main class
}
