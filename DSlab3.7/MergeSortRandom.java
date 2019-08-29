
import java.util.Arrays;

//  MergeQueue.java
// Program merges 2 sorted lists of integers, A nd B into S


public class MergeSortRandom
{

   
    private static class Node< Integer >
   {
      private Integer object; // elements of mylinkedlist
      private Node< Integer > next; // reference to the next node in the list
      
      public Node( Integer o, Node< Integer > n )
      {
         object = o;
         next = n;
      } // end constructor
      
      // return elements in the list
      public Integer getObject()
      {
         return this.object; 
      } // end getObject
      
      public Node< Integer > getNext()
      {
         return this.next; 
      } // end getNext
      
      public void setNext( Node< Integer > n )
      {
         next = n; 
      }
      
   } // end nested class Node
   
   // instance variables of mylinkedlist
   private Node< Integer > head = null; // head node of list ( or null if empty)
   private Node < Integer > tail = null; // tail node of list ( or null if empty)
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
   public Integer getFirst()
   {
      if( isEmpty() )
         return null;
      
      return head.getObject();
   }
   
   public Integer getLast()
   {
      if( isEmpty() )
         return null;
      
      return tail.getObject();
   }
   
   public void addFirst( Integer s )
   {
       // adds element s to the front of the list
      head = new Node<>( s, head );
      
      if ( nodeCounter == 0 )
         tail = head;
      
      ++nodeCounter;
   }
   
   public void addLast( Integer s )
   {
       // add object to the end of the list
      Node< Integer > newest = new Node<>( s, null ); // node will be the tail
      
      // special case: previuosly enpy list
      if ( isEmpty() )
         head = newest;
      else 
         tail.setNext(newest); // new node
      
      tail = newest; // new node becomes the tail
      ++nodeCounter;
   }
   
   // remove and retur the first element
   public Integer removeFirst()
   {
      if( isEmpty() )
         return null;
      
      Integer remove = head.getObject();
      head = head.getNext();
      --nodeCounter;
      
      if ( nodeCounter == 0 ) 
          tail = null;   
      return remove;
      
   }
   public void sortQueue( MergeSortRandom queue1, MergeSortRandom queue2, MergeSortRandom s )
   {
       //MergeSort result = new MergeSort( t.size() + this.size() );
       //int array2[] = new int[this.arrueue( t.size() + this.size()ay.length + t.array.length];
        //compares the size of queue1 and queue2 and stores the smaller 
       
       while( !queue1.isEmpty() && !queue2.isEmpty() )
       {
           if (queue1.getFirst() < queue2.getFirst() )
           {    
              s.addLast( queue1.getFirst());
              queue1.removeFirst();
           } // end if   
           else
           {    
              s.addLast( queue2.getFirst() );
              queue2.removeFirst();
           }
       } // end for
       
       while ( !queue1.isEmpty() )
       {
            s.addLast( queue1.getFirst());
            queue1.removeFirst();
       }
       
        while ( !queue2.isEmpty())
       {
            s.addLast( queue2.getFirst());
            queue2.removeFirst();
       }
       
       //System.out.println(Arrays.toString(array));
       //printMergeSort();
       
   } // end MergeQueue
   
   public void mergeSort( MergeSortRandom s )
   {
      long startTime = System.nanoTime();  
      int n = s.size();
      
      if ( n < 2 )  // queue is trivially sorted
         return;
      
      MergeSortRandom queue1 = new MergeSortRandom();
      MergeSortRandom queue2 = new MergeSortRandom();
      
      while ( queue1.size() < ( n / 2 ) )
      {
         queue1.addLast( s.getFirst() );
         s.removeFirst();
      }  
      
      while( !s.isEmpty() )
      {
         queue2.addLast( s.getFirst() );
         s.removeFirst();
      }
      //recursion
      mergeSort( queue1 );
      mergeSort( queue2 );
      
      // merge results
      sortQueue( queue1, queue2, s );
      long endTime = System.nanoTime();
      long elapsedTime = endTime - startTime;
      System.out.print(elapsedTime );
      System.out.println();
   }
   
   public void printMergeSort()
   {
       Node currentNode = this.head;
       
       while ( currentNode != null )
       {
          System.out.println( currentNode.getObject() );
          currentNode = currentNode.getNext();
       }
   }
} // end MergeSort   