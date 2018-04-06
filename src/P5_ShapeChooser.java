import java.util.Scanner;

/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

public class P5_ShapeChooser {

 public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
  
     System.out.print("Please enter the shape tri or box?");
     String name = console.next();
     
     if( name.equalsIgnoreCase("tri")) 
     drawTri();
     
     else if( name.equalsIgnoreCase("box")) 
     drawBox();
     
     else 
     System.out.println("Error: I don't know what shape " + name + " it is.");


 }
 
 private static void drawBox() {
  for( int row = 1; row <=5; row++ ) {
   for( int col = 1; col <=9; col++) {
    System.out.print("*");
   }
   System.out.println();
  }
 }
 
 private static void drawTri() {
  for( int row = 1; row <=5; row++ ) {
   for( int col = 1; col <= 5 - row; col++) {
    System.out.print(" ");
   }
   
   for( int col = 1; col <= 2 * row - 1; col++) {
    System.out.print("*");
   }
   
   System.out.println();
  }
 }

}