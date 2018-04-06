import java.util.Scanner;

/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

/*  What was the error?
  
  use the method equalsIgnoreCase rather then using ==.
 
  
 */

public class P1_FavoriteColor {

 public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
  
  System.out.print("What is your favorite color? ");
  String name = console.next();
  
  if( name.equalsIgnoreCase("blue")) {
   System.out.println("Mine too!");
  }

 }

}