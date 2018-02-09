public class MFDriver {
   public static void main(String[] args) {
    MatrixFinder test=new MatrixFinder();
    int[][] b=new int[100][100];//make a test array
    int c=0;
    //construct an array
    for(int i=0; i<b.length; i++) {
      for(int a=0; a<b.length; a++) {
        b[i][a]=c;
        c+=10;
      }
    }
    /*for( int[] row : b ) {
      System.out.println("\n");
      for( int i : row )
        System.out.print( i + " ");
	}*/

    System.out.println("\n");
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

  }
}
