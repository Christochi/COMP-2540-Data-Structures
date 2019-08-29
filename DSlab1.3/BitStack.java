import java.util.Scanner;

public class BitStack
{
   public static void main( String[] args )
   {
      // create object of class ContextFreeStack 
      ContextFreeStack language = new ContextFreeStack( 100, "0", "1" );
      
      Scanner scanner = new Scanner (System.in );
      String expression = scanner.nextLine(); // prompt for string input
      
      //language.isMatchedBits( expression );
      
      System.out.println( language.isMatchedBits( expression ) == true ? "Strings belong to the language" : 
         "String doesn't belong to the lannguage" );
      
      System.out.println( language.isMatchedBits( expression) == true ? "Strings were matched" : "Strings were never matched completely" ) ;
          //== true ? "Strings were matched" : "Strings were never matched completely");
   } // end method main
} // end BitStack