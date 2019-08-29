public class BracketLinkedList
{
//   private char array[]; // integers of array
//   private int index = -1; // position of array. -1 indicates stack is empty
   private String openingDelimiter;
   private String closingDelimiter;
   private final MyLinkedList linkedlist = new MyLinkedList(); 
   
   // Constructor sets the size of the array object
   public BracketLinkedList( String opening, String closing )
   {
      //array = new char[ size ];
      openingDelimiter = opening;
      closingDelimiter = closing;
   } // end constructor IntStack  
   
   // isEmpty() returns a boolean indicating whether the stack is empty or not
   // -1 means empty
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
   public String top()
   {
      return (String) linkedlist.getFirst();
   } // end method top
   
   // push() adds objects to the top of the stack
   public void push( String b )
   {
      linkedlist.addFirst( b );
   } // end method push
   
   // pop() removes and returns the top object form the stack ( or null if empty)
   public String pop()
   {
      return (String) linkedlist.removeFirst();
               
   } // end method pop   

   // checks if delimiters match
     public boolean isMatched( String expression )
   {
      //char charArray[];
      //charArray = expression.toCharArray();
      
      for ( char exp : expression.toCharArray() )
      {
         if ( openingDelimiter.indexOf( exp ) != -1 )         
            push( String.valueOf(exp) );
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
      
      // returns true if symbols were never matched
      // returns false if completely matched
      return isEmpty(); 
      
   } // end method isMatched
} // end class BracketLinkedList