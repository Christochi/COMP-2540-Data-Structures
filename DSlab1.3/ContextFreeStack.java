// LAB 1.3
// Program creates Stack on an Array.

/* 
  CharStack is synonymous to a stack of plates. It follows the principle of 
  LIFO (Last-in, First-out)
   
   
  PROPERTIES: size, position of object, type of array
  BEHAVIOURS: Insert object into stack, remove objects, check the capacity of stack,
              checks the last object inserted into the stack and checks if the stack
              is empty.
*/

public class ContextFreeStack
{
   private char array[]; // integers of array
   private int index = -1; // position of array. -1 indicates stack is empty
   private int flag = -1;
   private String zeroBits;
   private String oneBits;
  
   // Constructor sets the size of the array object
   public ContextFreeStack( int size, String zero, String one )
   {
      array = new char[ size ];
      zeroBits = zero;
      oneBits = one;
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
   public char top()
   {
      if ( isEmpty() )
         return 0;   
      else
         return array[ index ]; 
   } // end method top
   
   // push() adds objects to the top of the stack
   public void push( char b )
   {
      if ( size() == array.length )
         System.out.println( "Stack is full" );
      else 
         array[ ++index ] = b;
   } // end method push
   
   // pop() removes and returns the top object form the stack ( or null if empty)
   public char pop()
   {
      if ( isEmpty() )
         return 0;
      else
      {  
        char poppedValue = array[ index ];  
        index--;
        return poppedValue; 
      }          
   } // end method pop

   //
   public boolean isMatchedBits( String expression )
   {
   
      for ( char exp : expression.toCharArray() )
      {         
         
         if ( zeroBits.indexOf( exp ) != -1 )
         {    
             if(flag==1)
             {
                 return false;
             }
            push( exp );
         }   
         else if ( oneBits.indexOf( exp ) != -1 )
         {
            flag = 1;
            if ( isEmpty() )
                 return false; //  nothing to match with it 
            
            if ( zeroBits.indexOf( exp ) != oneBits.indexOf( pop() ) )
            {     
              return false; // wrong type  
            }     
         } // end else-if     
      } // end for
      
      // returns true if symbols were never matched
      // returns false if completely matched
      return isEmpty();
   } // end methos isMatchedBits
}