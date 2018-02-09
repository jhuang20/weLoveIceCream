public class MFDriver {
   public static void main(String[] args) {
    MatrixFinder test=new MatrixFinder();
    int row = 1000;
    int col = 1000;
    int[][] b=new int[row][col];//make a test array
    int c=0;
    //construct an array
    for(int i=0; i<b.length; i++) {
      for(int a=0; a<b.length; a++) {
        b[i][a]=c;
        c+=1;
      }
    }
    /*for( int[] row : b ) {
      System.out.println("\n");
      for( int i : row )
        System.out.print( i + " ");
	}*/

    System.out.println("\n");

     //run time comparisons
      long avgTime = 0;
    for (int i = 0; i < 100; i++){
      long aa=System.nanoTime();
      System.out.println(test.isThere(b, col - 1)); //best case scenario
      long bb=System.nanoTime();
      long time = bb - aa;
      avgTime += time;
      System.out.println(time + "nanoseconds" );
     }
     System.out.println("Average Time Best Case: " + avgTime / 20.00);

     avgTime = 0; //reset avg time
     for (int i = 0; i < 100; i++){
      long aa=System.nanoTime();
      System.out.println(test.isThere(b, row * col - col - 1)); //worst case scenario
      long bb=System.nanoTime();
      long time = bb - aa;
      avgTime += time;
      System.out.println(time + "nanoseconds" );
     }
     System.out.println("Average Time Worst Case: " + avgTime / 20.00);
     /**
    long aa=System.currentTimeMillis();
    System.out.println(test.isThere(b, 8996700));

    long bb=System.currentTimeMillis();
    System.out.println((bb-aa)+"milisecond" );
    System.out.println(test.isThere(b, 0));

    long cc=System.currentTimeMillis();
    System.out.println(cc-bb);
    System.out.println(test.isThere(b, -1));
    System.out.println(System.currentTimeMillis());
    System.out.println(test.isThere(b, 1287879879));
    System.out.println(System.currentTimeMillis());
    **/
  }
}
