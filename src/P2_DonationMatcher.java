import java.util.Scanner;

/*
ISYS 320
 Name(Mansoor Malbaibi):
 Date: 07-04-2018 
*/

public class P2_DonationMatcher {

 public static void main(String[] args) {

  int donationsSum = 1000;
  int donationsCount = 20;
  Scanner console = new Scanner(System.in);
  System.out.print("Will you donation be multiplied 1 or 2? ");
  int multiplier = console.nextInt();
  
  if (multiplier>0){
   System.out.print("And how much are you donating? ");
   int donation = console.nextInt();

   donationsSum = donationsSum + calc(donation, multiplier);
   
   donationsCount++;

  System.out.println("Total donated sum: " + donationsSum);
  System.out.println("Total number of donations: " + donationsCount);
  }
  else
  System.out.println("Error: Invalid input.");
 
  }
   public static int calc(int d, int n ) {
   if (n == 1)
     d = d * 1;
   else
     d = d * 2;
   return d;
  }
  
 }