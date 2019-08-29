/**
 *  QuickSortTest.java
 * 
 *  Implements QuickSort.java
 */
import java.util.Arrays;
import java.util.Scanner;

public class QuickSortTest< E >
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner( System.in );
        
        int[] array = {1, 2, 4, 5, 3, 7, 8, 10, 11, 9, 6};
        
        QuickSort mySort = new QuickSort( array );
       System.out.print(Arrays.toString(mySort.sort( 0, array.length - 1)) );
       System.out.println();
    }
}