// Heap Test implements heap
import java.util.Scanner;
import java.util.Random;

public class HeapTest
{
    public static void main( String[] args )
    {
       Scanner scanner = new Scanner( System.in );
       Random rand = new Random();
       int[] array = { 1, 3, 5, 7, 9, 10, 8, 6, 4, 2 };
       
       //int[] array2 = new int[ 8];
       
       Heap heap = new Heap( array ); 
       
       System.out.println( heap.size() );
       System.out.println( heap.isEmpty() );
       System.out.println( heap.min() );
        //System.out.println( heap.removeMin() );
        System.out.println( heap.size() );
       heap.heapSort();
       
      
//      for( int i =0, k = 8; k < 1048576 ; i++, k *= 2 )
//      {
//           array2[i] = 1 + rand.nextInt( k );
//           System.out.printf( "size = %d", k);
//           heap.heapSort();
//      } // end while
      
      
     
      
      //heap.printHeap();
          
    } // end main
}