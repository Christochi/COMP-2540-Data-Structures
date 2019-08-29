public class QueueLinkedList
{
   //private final int array[]; // integers of array
   //private int index = -1; // position of array. -1 indicates stack is empty
   private final MyLinkedList linkedlist = new MyLinkedList(); 
   
   // Constructor sets the size of the array object
//   public StackLinkedList( int size )
//   {
//      array = new int[ size ];
//   } // end constructor IntStack  
   
   public boolean isEmpty()
   {
      return linkedlist.isEmpty(); 
   } // end method isEmpty   
   
   // size() returns the number of elements in the stack to the caller
   public int size()
   {
      return linkedlist.size();
   } // end method size       
   
   // top() returns the recently added object in the stack, without removing it
   // (or null if empty)
   public String first()
   {
      return (String) linkedlist.getFirst();
   } // end method top
   
   // push() adds objects to the top of the stack
   public void enqueue( String s )
   {
      linkedlist.addLast( s );
   } // end method push
   
   // pop() removes and returns the top object form the stack ( or null if empty)
   public String dequeue()
   {
     return (String) linkedlist.removeFirst();
   } // end method pop      
   
} // end class IntStack