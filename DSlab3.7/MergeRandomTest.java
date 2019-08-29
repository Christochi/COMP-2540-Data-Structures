import java.util.Random;

public class MergeRandomTest
{
    public static void main( String[] args )
    {
      MergeSortRandom sort1 = new MergeSortRandom();
      MergeSortRandom sort2 = new MergeSortRandom();
      MergeSortRandom sort3 = new MergeSortRandom();
      MergeSortRandom sort4 = new MergeSortRandom();
      
      Random rand = new Random();
        
  
        
        for( int k = 0; k < 8; ++k )
        {
           sort1.addLast( 1 + rand.nextInt( 8 ) );
        } // end while
        
        for( int k = 0; k < 16; ++k )
        {
           sort2.addLast( 1 + rand.nextInt( 16 ) );
        } // end while
        
        for( int k = 0; k < 32; ++k )
        {
           sort3.addLast( 1 + rand.nextInt( 32 ) );
        } // end while
        
        for( int k = 0; k < 64; ++k )
        {
           sort4.addLast( 1 + rand.nextInt( 64 ) );
        } // end while
        
//      sort.enqueue( 5 );
//      sort.enqueue( 17 );
//      sort.enqueue( 50 );
//      sort.enqueue( 3 );
//      sort.enqueue( 6 );
//      sort.enqueue( 10 );
      
//      System.out.println( sort.isEmpty() );
//      System.out.println( sort.isEmpty() );
      
//      System.out.printf( "The number of objects in the queue is %d",
//         sort.size() );
      sort1.mergeSort( sort1 );
      sort2.mergeSort( sort2 );
      sort3.mergeSort( sort1 );
      sort4.mergeSort( sort1 );
      System.out.println();
          

//     sort.mergeSort( sort );
     
    
     
    }
    
}