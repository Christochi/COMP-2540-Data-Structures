// TestLinkedList.java
// Test MyLinkedList class

public class TestLinkedList
{
   public static void main( String[] args )
   {
      MyLinkedList linkedlist = new MyLinkedList();
      
      linkedlist.addFirst( "Chika" );
      linkedlist.addFirst( "Uche" );
      linkedlist.addFirst( "Oby" );
      linkedlist.addFirst( "Ogechi" );
      linkedlist.addFirst( "Oboy" );
      linkedlist.addFirst( "Daddy" );
      
      System.out.println( "Empty: " + linkedlist.isEmpty() );
      System.out.printf( "The number of objects in the list is %d\n",
         linkedlist.size() );
      System.out.printf( linkedlist.getFirst() == null ? "List is empty" : "The top-most "
         + "object is %s", linkedlist.getFirst() );
      System.out.println();
      
      System.out.printf( linkedlist.getLast() == null ? "List is empty" : "The last-most "
         + "object is %s", linkedlist.getLast() );
      System.out.println();
      
      linkedlist.addLast( "Mommy" );
      System.out.printf( linkedlist.getLast() == null ? "List is empty" : "The last-most "
         + "object is %s", linkedlist.getLast() );
      System.out.println();
      System.out.printf( "The number of objects in the list is %d\n",
         linkedlist.size() );
      
      System.out.println( "Remove " + linkedlist.removeFirst() );
      System.out.printf( "The number of objects in the list is %d\n",
         linkedlist.size() );
   } // end main
}
