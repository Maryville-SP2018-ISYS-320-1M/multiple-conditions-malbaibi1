import java.util.Scanner;


/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

public class P6_Quadrant {

 public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
  
     System.out.print("Please enter the x-axis value");
     int x = console.nextInt();
     System.out.print("Please enter the y-axis value");
     int y = console.nextInt();
     calc( x, y );

 }
    public static void calc(int x, int y ) {
   if (x>0 && y>0)
     System.out.println("Quadrant-1");
   else if (x<0 && y>0)
     System.out.println("Quadrant-2");
   else if (x<0 && y<0)
     System.out.println("Quadrant-3");
   else if (x>0 && y<0)
     System.out.println("Quadrant-4");
   else
     System.out.println("Origin");
   return;

}
}