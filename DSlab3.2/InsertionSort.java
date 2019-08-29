/**
 *  InsertionSort.java
 * 
 *  This program sorts integers in increasing order
 */
//import java.util.Arrays;
import java.util.ArrayList;

public class InsertionSort
{
   private ArrayList< Integer > sortArray;
  
   public InsertionSort( ArrayList< Integer > array )
   {
      this.sortArray = new ArrayList<>( array );
   } // end constructor
   
   public int getSize()
   {
      return sortArray.size();
   } // end size
   
   public boolean isEmpty()
   {
      return sortArray.isEmpty();
   } // end isEmpty
   
   public void inPlaceSort()
   { 
      for ( int k = 1; k < this.sortArray.size(); ++k ) 
      {
         int m, key = this.sortArray.get( k );
         
         for ( m = k - 1; m >= 0; m-- )
         {
            if ( this.sortArray.get( m ) <= key )
               break;
            
            this.sortArray.add(  m + 1 , this.sortArray.get( m ) );
            this.sortArray.remove(m+2); //Added this
         } 
         this.sortArray.add( ( m + 1 ), key );
         this.sortArray.remove(m+2); //Added this
      }
      
      System.out.print( this.sortArray );
      System.out.println();
   } // end inPLaceSort
} // end class InsertionSort