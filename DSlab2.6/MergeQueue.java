
import java.util.Arrays;

//  MergeQueue.java
// Program merges 2 sorted lists of integers, A nd B into S


public class MergeQueue
{
    private final int array[];
    private int last = -1; // empty array
    private int f = 0;
    
    
    // Constructor sets the size of the array object
   public MergeQueue( int size )
   {
      array = new int[ size ];
     
   } // end constructor IntStack  
  
   // if the list is empty, f is always greater than last 
   // but if the list is not empty, last is greater
   public boolean isEmpty()
   {
       return this.f >this.last ? true : false;      
   } // end isEmpty
   
   public int size()
   { 
      return ( last - f ) + 1;
   } // end method size 
   
   public int first()
   {
       if ( isEmpty() )
         return 0;   
      else
         return array[ f ]; 
   }
   
   // last increments when enqueing
    public void enqueue( int num )
   {
      if ( this.last == array.length - 1 )
         System.out.println( "Queue is full" );
      else 
         array[ ++last ] = num;
   } // end method push
   
    //f increments when dequeing
   public int dequeue()
   {
      if ( isEmpty() )
         return 0;
      else
      {  
        int dequeuedValue = array[ f ];  
        ++f;
        return dequeuedValue; 
      }          
   } // end method pop       
   
   // mergeQueue t = queue2
   public MergeQueue sortQueue( MergeQueue t)
   {
       MergeQueue result = new MergeQueue( t.size() + this.size() );
       //int array2[] = new int[this.arrueue( t.size() + this.size()ay.length + t.array.length];
        //compares the size of queue1 and queue2 and stores the smaller 
       
       while( !this.isEmpty() && !t.isEmpty() )
       {
           if (this.first() < t.first() )
           {    
              result.enqueue( this.first());
              this.dequeue();
           } // end if   
           else
           {    
              result.enqueue( t.first() );
              t.dequeue();
           }
       } // end for
       
       while ( !this.isEmpty())
       {
            result.enqueue( this.first());
            this.dequeue();
       }
       
        while ( !t.isEmpty())
       {
            result.enqueue( t.first());
            t.dequeue();
       }
       
        return result;
   }
   
   public void printArray()
   {
      System.out.println(Arrays.toString(array) );
   }
}