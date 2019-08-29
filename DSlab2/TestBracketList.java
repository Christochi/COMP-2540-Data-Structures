import java.util.Scanner;

public class TestBracketList
{
   public static void main( String[] args )
   {
      BracketLinkedList bStack = new BracketLinkedList( "([{", ")]}"); 
      
      Scanner scanner = new Scanner (System.in );
      String expression = scanner.nextLine(); // prompt for string input
      
      System.out.println( bStack.isMatched( expression ) == true ? "Delimiters matched" : "no match or wrong type" );
      
      System.out.println( bStack.isMatched( bStack.isEmpty() == true  ? "Symbols were matched" : "Symbols were never matched completely" ) 
          == true ? "Symbols were matched" : "Symbols were never matched completely");
    
      
         
   }
}