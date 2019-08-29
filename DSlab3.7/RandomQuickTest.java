/**
 *  QuickSortTest.java
 * 
 *  Implements QuickSort.java
 */
import java.util.Arrays;
import java.util.Random;

public class RandomQuickTest< E >
{
    public static void main( String[] args )
    {
        Random rand = new Random();
        
        //int[] array = {1, 2, 4, 5, 3, 7, 8, 10, 11, 9, 6};
        int[] array1 = new int[8];
        int[] array2 = new int[16];
        int[] array3 = new int[32];
        int[] array4 = new int[64];
        
        for( int k = 0; k < 8; ++k )
        {
           array1[k] =  1 + rand.nextInt( 8 );
        } // end while
        
        for( int k = 0; k < 16; ++k )
      {
         array2[ k ] =  1 + rand.nextInt( 16 );
      } // end while
        
      for( int k = 0; k < 32; ++k )
      {
         array3[k]= 1 + rand.nextInt( 32 );
      } // end while 
      
      for( int k = 0; k < 64; ++k )
      {
         array4[k] =  1 + rand.nextInt( 64 ) ;
      } // end while
        
        RandomQuick mySort1 = new RandomQuick( array1 );
        mySort1.sort( 0, array1.length - 1);
        RandomQuick mySort2 = new RandomQuick( array2 );
        mySort2.sort( 0, array2.length - 1);
        RandomQuick mySort3 = new RandomQuick( array3 );
        mySort3.sort( 0, array3.length - 1);
        RandomQuick mySort4 = new RandomQuick( array4 );
        mySort4.sort( 0, array4.length - 1);
       //System.out.print(Arrays.toString(mySort.sort( 0, array1.length - 1)) );
       
       System.out.println();
    }
}