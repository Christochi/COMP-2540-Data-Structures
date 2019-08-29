// LAB 1.2
// Program checks whether or not the brackets are correct (balanced) or incorrect (unbalanced).

/* 
  CharStack is synonymous to a stack of plates. It follows the principle of 
  LIFO (Last-in, First-out)
   
   
  PROPERTIES: size, position of object, type of array
  BEHAVIOURS: Insert object into stack, remove objects, check the capacity of stack,
              checks the last object inserted into the stack and checks if the stack
              is empty.
*/

public class CharStack
{
   private char array[]; // integers of array
   private int index = -1; // position of array. -1 indicates stack is empty
   private String openingDelimiter;
   private String closingDelimiter;
   
   // Constructor sets the size of the array object
   public CharStack( int size, String opening, String closing )
   {
      array = new char[ size ];
      openingDelimiter = opening;
      closingDelimiter = closing;
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

   // checks if delimiters match
   public boolean isMatched( String expression )
   {
      //char charArray[];
      //charArray = expression.toCharArray();
      
      for ( char exp : expression.toCharArray() )
      {
         if ( openingDelimiter.indexOf( exp ) != -1 )         
            push( exp );
         else if ( closingDelimiter.indexOf( exp ) != -1)
         {
           //if ( closingDelimiter.indexOf( exp ) == openingDelimiter.indexOf( pop() ) )
               //return true; // matched
             
            if ( isEmpty() )
                 return false; //  nothing to match with it 
            if ( closingDelimiter.indexOf( exp ) != openingDelimiter.indexOf( pop() ) )
              return false; // wrong type         
         } // end for      
      }
      
      // returns false if symbols were never matched
      // returns true if completely matched
      return isEmpty(); 
      
   } // end method isMatched
   
} // end class IntStack