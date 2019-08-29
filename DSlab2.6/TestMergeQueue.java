// TestMergeQueue.java
// IMplement MergeQueue class

public class TestMergeQueue
{
    public static void main( String[] args )
    {
        MergeQueue queue1 = new MergeQueue( 10 );
        MergeQueue queue2 = new MergeQueue( 10 );
        
      queue1.enqueue( 5 );
      queue1.enqueue( 17 );
      queue1.enqueue( 50 );
      
      queue2.enqueue( 3 );
      queue2.enqueue( 6 );
      queue2.enqueue( 10 );
      
      System.out.println( queue1.isEmpty() );
      System.out.println( queue2.isEmpty() );
      
      System.out.printf( "The number of objects in the stack is %d",
         queue1.size() );
      
      System.out.println();
      
      System.out.printf( "The number of objects in the stack is %d",
         queue2.size() );
      
      System.out.println();
      
     MergeQueue sorted = queue1.sortQueue( queue2 );
     
     sorted.printArray();
      
      System.out.printf( queue1.first() == 0 ? "Stack is empty" : "The top-most "
         + "object is %d", queue1.first());
      
      System.out.println();
      
      System.out.printf( queue2.first() == 0 ? "Stack is empty" : "The top-most "
         + "object is %d", queue2.first());
      
      System.out.println();
      
      System.out.printf( queue1.dequeue() == 0 ? "Stack is empty" : 
         "Object removed is %d", queue1.dequeue() ) ;
      
      System.out.println();
      
      System.out.printf( queue1.first() == 0 ? "Stack is empty" : "The top-most "
         + "object is %d", queue1.first());
      
    }
}