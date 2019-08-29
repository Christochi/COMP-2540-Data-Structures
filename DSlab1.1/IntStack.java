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

public class IntStack
{
   private final int array[]; // integers of array
   private int index = -1; // position of array. -1 indicates stack is empty
   
   // Constructor sets the size of the array object
   public IntStack( int size )
   {
      array = new int[ size ];
   } // end constructor IntStack  
   
   // isEmpty() returns a boolean indicating whether the stack is empty or not
   // -1 means empty
   public boolean isEmpty()
   {
      return ( index == -1 ? true : false ); 
   } // end method isEmpty   
   
   // size() returns the number of elements in the stack to the caller
   public int size()
   {
      return ( ( index + 1 ) == 0 ? 0 : index + 1 );
   } // end method size       
   
   // top() returns the recently added object in the stack, without removing it
   // (or null if empty)
   public int top()
   {
      if ( isEmpty() )
         return 0;   
      else
         return array[ index ]; 
   } // end method top
   
   // push() adds objects to the top of the stack
   public void push( int num )
   {
      if ( size() == array.length )
         System.out.println( "Stack is full" );
      else 
         array[ ++index ] = num;
   } // end method push
   
   // pop() removes and returns the top object form the stack ( or null if empty)
   public int pop()
   {
      if ( isEmpty() )
         return 0;
      else
      {  
        int poppedValue = array[ index ];  
        index--;
        return poppedValue; 
      }          
   } // end method pop      
   
} // end class IntStack