public class Stack
{
   public static void main( String[] args )
   {
      // calls constructor and passes an array size of 100 to the constructor
      IntStack aStack = new IntStack( 100 ); 
      
      aStack.push( 5 );
      aStack.push( 17 );
      aStack.push( 50 );
      aStack.push( 100 );
      aStack.push( 1000 );
      
      System.out.println( aStack.isEmpty() );
      
      System.out.println();
      
      System.out.printf( "The number of objects in the stack is %d",
         aStack.size() );
      
      System.out.println();
      System.out.println();
      
      System.out.printf( aStack.top() == 0 ? "Stack is empty" : "The top-most "
         + "object is %d", aStack.top());
      
      System.out.println();
       
      System.out.printf( aStack.pop() == 0 ? "Stack is empty" : 
         "Object removed is %d", aStack.pop() ) ;
      
      System.out.println();
      
      System.out.printf( aStack.pop() == 0 ? "Stack is empty" : 
         "Object removed is %d", aStack.pop() ) ;
      
   } // end method main     
} // end class Stack