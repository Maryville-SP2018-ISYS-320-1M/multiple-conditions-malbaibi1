import java.util.Scanner;

/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

public class P4_ColorNamer {

 public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
  
     System.out.print("What is your favorite color r, g, or b? ");
     String name = console.next();
  
     if( name.equalsIgnoreCase("r")) 
     System.out.println("The name is Red");
     
     else if( name.equalsIgnoreCase("g")) 
     System.out.println("The name is Green");
     
     else if( name.equalsIgnoreCase("b")) 
     System.out.println("The name is Blue");
     
     else 
     System.out.println("I don't know what a " + name + " is.");

 }

}