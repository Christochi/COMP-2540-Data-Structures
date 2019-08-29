// MyLinkedList.java
// Program implements addFirst, removeFirst, addLast, 
// removeLast, getFirst, getLast, size

public class MyLinkedList <String>
{
   private static class Node< String >
   {
      private String object; // elements of mylinkedlist
      private Node< String > next; // reference to the next node in the list
      
      public Node( String o, Node< String > n )
      {
         object = o;
         next = n;
      } // end constructor
      
      // return elements in the list
      public String getObject()
      {
         return this.object; 
      } // end getObject
      
      public Node< String > getNext()
      {
         return this.next; 
      } // end getNext
      
      public void setNext( Node< String > n )
      {
         next = n; 
      }
      
   } // end nested class Node
   
   // instance variables of mylinkedlist
   private Node< String > head = null; // head node of list ( or null if empty)
   private Node < String > tail = null; // tail node of list ( or null if empty)
   private int nodeCounter = 0; // num of nodes in the list
   
   // returns size of list
   public int size()
   {
      return this.nodeCounter;
   } // end size
   
   public boolean isEmpty()
   {
      return this.nodeCounter == 0; 
   }
   
   // returns the first element but doesn't remove it
   public String getFirst()
   {
      if( isEmpty() )
         return null;
      
      return head.getObject();
   }
   
   public String getLast()
   {
      if( isEmpty() )
         return null;
      
      return tail.getObject();
   }
   
   public void addFirst( String s )
   {
       // adds element s to the front of the list
      head = new Node<>( s, head );
      
      if ( nodeCounter == 0 )
         tail = head;
      
      ++nodeCounter;
   }
   
   public void addLast( String s )
   {
       // add object to the end of the list
      Node< String > newest = new Node<>( s, null ); // node will be the tail
      
      // special case: previuosly enpy list
      if ( isEmpty() )
         head = newest;
      else 
         tail.setNext(newest); // new node
      
      tail = newest; // new node becomes the tail
      ++nodeCounter;
   }
   
   // remove and retur the first element
   public String removeFirst()
   {
      if( isEmpty() )
         return null;
      
      String remove = head.getObject();
      head = head.getNext();
      --nodeCounter;
      
      if ( nodeCounter == 0 ) 
          tail = null;   
      return remove;
      
   }
} // end class
