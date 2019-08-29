//MyStackList.java
// implements StackLinkedList class

public class TestQueueList
{
    public static void main( String[] args )
    {
      QueueLinkedList queue = new QueueLinkedList(); 
       
      queue.enqueue( "Ahmed" );
      queue.enqueue( "Duzie" );
      queue.enqueue( "Sope" );
      
      
      System.out.println( "Empty: " + queue.isEmpty() );
      
      System.out.printf( "The number of objects in the list is %d\n",
         queue.size() );
      
      System.out.printf( queue.first() == null ? "List is empty" : "The top-most "
         + "object is %s", queue.first() );
      System.out.println();
      
      System.out.println( "Remove " + queue.dequeue() );
      System.out.printf( "The number of objects in the list is %d\n",
         queue.size() );
    }
}