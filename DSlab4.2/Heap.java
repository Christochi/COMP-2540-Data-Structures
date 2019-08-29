
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

// Heap.java
// Heap ADT is implemented on an array

public class Heap
{
   private int[] heap;
   private int[] p = new int[ 10 ];
   private int index;
   
   
   public Heap( int[] array )
   {
       this.heap = array;
       this.index = -1;
   } // end constructor
   
   // return the umber of elements in the array
   public int size()
   {
      return this.heap.length;
   } // end size
   
   public boolean isEmpty()
   {
      return size() == 0; 
   } 
   
   // returns first element in the heap
   public int min()
   {
      if ( isEmpty() )
         return 0;
      else 
         return this.heap[ 0 ];
   }
   
   public void swap( int i, int j )
   {
      int temp = this.heap[ i ];
      this.heap[ i ] = this.heap[ j ];
      this.heap[ j ] = temp;
   } // end swap
   
   public int removeMin()
   {
      if ( isEmpty() )
         return 0;
      
      int min = this.heap[ 0 ];
      swap( 0, size() - 1 );
      this.heap = ArrayUtils.remove( this.heap, size() - 1 ); // decrement size of array
      downHeap( 0 );
      return min;
   }
   
   public void downHeap( int parent )
   {
      int hasLeftChild =  2 * parent + 1;
      int hasRightChild = 2 * parent + 2;
      int smallChildIndex;
      
      while ( hasLeftChild < size() )
      {
         smallChildIndex = hasLeftChild;
         
         if ( hasRightChild < size() )
         {
             if ( this.heap[ hasLeftChild ] > this.heap[ hasRightChild ] )
                 smallChildIndex = hasRightChild;
         } // end if
         
         if ( this.heap[ hasLeftChild ] >= this.heap[ parent ] )
            break;
         
         swap( parent, smallChildIndex );
         parent = smallChildIndex;
      } // end while    
   }
   
   public int[] insert( int v )
   {
          
       this.p[ ++index ] = v;
       upHeap( size() - 1 );  
       return p;
   } // end insert
   
   public void upHeap( int last )
   {
      while ( last > 0 )
      {
         int parent = ( last - 1 ) / 2;
         
         if ( this.p[ last ] >= this.p[ parent ] )
             break;
         
         swap( last, parent);
         last = parent;
      } // end while
   }
   
   public void heapSort()
   {
       //long startMIllis = System.currentTimeMillis();
       while ( !isEmpty() )
       {
          int v = removeMin(); 
          insert( v );
       }
//       
//       while( !isEmpty() )
//       {
//          int e = removeMin();
//          insert( e );
//       }
       
       printHeap( p );
//       long endMillis = System.currentTimeMillis();
//       long elapsed = endMillis - startMIllis;
//       System.out.println( elapsed );
//       System.out.println();
   }
   
   public void printHeap( int[] a )
   {
      System.out.print( Arrays.toString( a ) );
      System.out.println();
      System.out.println( a.length );   
   }
} // end class Heap