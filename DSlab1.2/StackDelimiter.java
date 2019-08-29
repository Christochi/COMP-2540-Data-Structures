import java.util.Scanner;

public class StackDelimiter
{
   public static void main( String[] args )
   {
      CharStack cStack = new CharStack( 100, "([{", ")]}"); 
      
      Scanner scanner = new Scanner (System.in );
      String expression = scanner.nextLine(); // prompt for string input
      
      //cStack.isMatched( expression );
      
      System.out.println( cStack.isMatched( expression ) == true ? "Delimiters matched" : "no match or wrong type" );
      
      System.out.println( cStack.isMatched( cStack.isEmpty() == true  ? "Symbols were matched" : "Symbols were never matched completely" ) 
          == true ? "Symbols were matched" : "Symbols were never matched completely");
    
      
         
   }
}