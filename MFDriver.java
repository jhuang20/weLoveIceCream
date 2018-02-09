public class MFDriver {
   public static void main(String[] args) {
    MatrixFinder test=new MatrixFinder();
    int d=0;
    /*int row = 1000;
    int col = 1000;
    int[][] b=new int[row][col];//make a test array

    //construct an array
    for(int i=0; i<b.length; i++) {
      for(int a=0; a<b.length; a++) {
        b[i][a]=d;
        d+=1;
      }
    }
    /*for( int[] row : b ) {
      System.out.println("\n");
      for( int i : row )
        System.out.print( i + " ");
	}*/

    System.out.println("\n");


     //run time comparisons
     for (int c=1000; c<8000; c+=50) {
       int row=c;
       int col=c;
       int[][] b=new int[c][c];
       for(int i=0; i<b.length; i++) {
         for(int a=0; a<b.length; a++) {
           b[i][a]=d;
           d+=1;
         }
       }

      long avgTime = 0;
    for (int i = 0; i < 100; i++){
      long aa=System.nanoTime();
      test.isThere(b, col - 1); //best case scenario
      long bb=System.nanoTime();
      long time = bb - aa;
      avgTime += time;
      //System.out.println(time + "nanoseconds" );
     }
     System.out.println("Average Time Best Case: " + avgTime/100.0 );

     avgTime = 0; //reset avg time
     System.out.println("\n");
     for (int i = 0; i < 100; i++){
      long aa=System.nanoTime();
      test.isThere(b, row * col +1); //worst case scenario
      long bb=System.nanoTime();
      long time = bb - aa;
      avgTime += time;
      //System.out.println(time + "nanoseconds" );
     }
     System.out.println("Average Time Worst Case: " + avgTime/100.0 );
   }
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
