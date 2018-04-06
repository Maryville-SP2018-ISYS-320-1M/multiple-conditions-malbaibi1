import java.util.Scanner;


/*
 ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018
*/

/*
Problem :
Use Age for Physical Description.
*/

public class MyConditionalProblem {

 public static void main(String[] args) {
     Scanner console = new Scanner(System.in);
  
     System.out.print("Please enter your age in years.");
     int a = console.nextInt();
     calc(a);

 }
    public static void calc(int x) {
   if (x<3 )
     System.out.println("You are a baby");
   else if (x>2 && x<12)
     System.out.println("You are a child");
   else if (x>11 && x<18)
     System.out.println("You are a young");
   else if (x>17 && x<30)
     System.out.println("You are an adult");
   else if (x>29 && x<45)
     System.out.println("You are a man");
   else
     System.out.println("You are elderly person");
   return;

}
}