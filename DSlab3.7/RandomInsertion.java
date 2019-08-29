import java.util.ArrayList;

public class RandomInsertion
{
   private ArrayList< Integer > sortArray;
  
   public RandomInsertion( ArrayList< Integer > array )
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
      long startTime = System.nanoTime(); 
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
      long endTime = System.nanoTime();
      long elapsedTime = endTime - startTime;
      System.out.print(elapsedTime );
      System.out.println();
   } // end inPLaceSort
} // end class InsertionSort