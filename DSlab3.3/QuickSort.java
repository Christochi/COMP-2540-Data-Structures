/**
 *  QuickSort.java
 * 
 *  Program implements the in-place Quicksort algorithm on an array
 *  used to sort integers in increasing order
 */

public  class QuickSort//< E >
{
   private int[] array; 
   
   public QuickSort( int[] array)
   {
      this.array = array; 
   }
   
   public int[] sort(int from, int to )
   {
      quickSort( from, to );
      return this.array;
   }
   
   public void swap( int from, int to )
   {
      int temp = array[ from ];
      this.array[ from ] = this.array[ to ];
      this.array[ to ] = temp;
   }
   
   public void quickSort( int from, int to )
   {
      if ( from >= to )
         return;
      
      int pivot = this.array[ to ];
      
      int counter = from; // beginning of the array
      
      for ( int k = from; k < to; ++k )
      {
            //if ( ( ( Comparable< E > ) this.array[k] ).compareTo( pivot ) <= 0 ) 
           if( this.array[ k ] < pivot || this.array[ k ] == pivot )
          {
             swap( k, counter );
             counter++;
          }
      }
      swap( counter, to );
      quickSort( from, counter - 1 );
      quickSort( counter + 1, to );
      
   }
} // end class QuickSort