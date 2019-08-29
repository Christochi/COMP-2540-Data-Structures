//MyStackList.java
// implements StackLinkedList class

public class TestStackList 
{
    public static void main( String[] args )
    {
       StackLinkedList stack = new StackLinkedList(); 
       
      stack.push( "Chika" );
      stack.push( "Uche" );
      stack.push( "Oby" );
      
      
      System.out.println( "Empty: " + stack.isEmpty() );
      
      System.out.printf( "The number of objects in the list is %d\n",
         stack.size() );
      
      System.out.printf( stack.top() == null ? "List is empty" : "The top-most "
         + "object is %s", stack.top() );
      System.out.println();
      
      System.out.println( "Remove " + stack.pop() );
      System.out.printf( "The number of objects in the list is %d\n",
         stack.size() );
    }
}