import java.util.ArrayList;
import java.util.Random;


public class RandomInsertionTest
{
   // main begins program execution
   public static void main( String[] args )
   {
      // create objects
      //InsertionSort sort = new InsertionSort();
      Random rand = new Random( );
      
      ArrayList< Integer > array1 = new ArrayList< Integer >();
      ArrayList< Integer > array2 = new ArrayList< Integer >();
      ArrayList< Integer > array3 = new ArrayList< Integer >();
      ArrayList< Integer > array4 = new ArrayList< Integer >();
        
      //System.out.print( "Enter integers (enter non int to exit loop): ");
      
      for( int k = 1; k <= 8; ++k )
      {
         array1.add( 1 + rand.nextInt( 8 ) );
      } // end while
      
      for( int k = 1; k <= 16; ++k )
      {
         array2.add( 1 + rand.nextInt( 16 ) );
      } // end while
      
      for( int k = 1; k <= 32; ++k )
      {
         array3.add( 1 + rand.nextInt( 32 ) );
      } // end while
      
      for( int k = 1; k <= 64; ++k )
      {
         array4.add( 1 + rand.nextInt( 64 ) );
      } // end while
     
      
      RandomInsertion sort1 = new RandomInsertion( array1 );
      sort1.inPlaceSort();
      RandomInsertion sort2 = new RandomInsertion( array2 );
      sort2.inPlaceSort();
      RandomInsertion sort3 = new RandomInsertion( array3 );
      sort3.inPlaceSort();
      RandomInsertion sort4 = new RandomInsertion( array4 );
      sort4.inPlaceSort();
   } // end main
   
}