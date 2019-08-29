// LAB 1.1
// Program creates Stack on an Array.

/* 
  IntStack is synonymous to a stack of plates. It follows the principle of 
  LIFO (Last-in, First-out)
   
   
  PROPERTIES: size, position of object, type of array
  BEHAVIOURS: Insert object into stack, remove objects, check the capacity of stack,
              checks the last object inserted into the stack and checks if the stack
              is empty.
*/

public class StackLinkedList extends MyLinkedList
{
   //private final int array[]; // integers of array
   //private int index = -1; // position of array. -1 indicates stack is empty
   //private final MyLinkedList linkedlist = new MyLinkedList(); 
   
   // Constructor sets the size of the array object
//   public StackLinkedList( int size )
//   {
//      array = new int[ size ];
//   } // end constructor IntStack  
   
//   public boolean isEmpty()
//   {
//      return super.isEmpty(); 
//   } // end method isEmpty   
   
   // size() returns the number of elements in the stack to the caller
//   public int size()
//   {
//      return linkedlist.size();
//   } // end method size       
   
   // top() returns the recently added object in the stack, without removing it
   // (or null if empty)
   public String top()
   {
      return (String) super.getFirst();
   } // end method top
   
   // push() adds objects to the top of the stack
   public void push( String s )
   {
      super.addFirst( s );
   } // end method push
   
   // pop() removes and returns the top object form the stack ( or null if empty)
   public String pop()
   {
     return (String) super.removeFirst();
   } // end method pop      
   
} // end class IntStack