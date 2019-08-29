public class MergeSortTest
{
    public static void main( String[] args )
    {
        MergeSort sort = new MergeSort();
        
        
      sort.addFirst( 5 );
      sort.addLast( 17 );
      sort.addLast( 50 );
      sort.addLast( 3 );
      sort.addLast( 6 );
      sort.addLast( 10 );
      
//      System.out.println( sort.isEmpty() );
//      System.out.println( sort.isEmpty() );
      
      System.out.printf( "The number of objects in the queue is %d",
         sort.size() );
      
      System.out.println();
          

     sort.mergeSort( sort );
     
    
     
    }
    
}