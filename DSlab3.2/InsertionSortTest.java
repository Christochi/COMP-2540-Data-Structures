/**
 *  InsertionTest.java
 * 
 *  Program implements InsertionSort.java
 */
import java.util.ArrayList;
import java.util.Scanner;


public class InsertionSortTest
{
   // main begins program execution
   public static void main( String[] args )
   {
      // create objects
      //InsertionSort sort = new InsertionSort();
      Scanner scanner = new Scanner( System.in );
      
      ArrayList< Integer > array = new ArrayList< Integer >();
        
      System.out.print( "Enter integers (enter non int to exit loop): ");
      
      while ( scanner.hasNextInt() )
      {
         array.add( scanner.nextInt() );
      } // end while
      
      InsertionSort sort = new InsertionSort( array );
      sort.inPlaceSort();
   } // end main
   
}