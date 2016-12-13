//Sharhad Bashar
//ID: 260519664

import java.util.Scanner; 
public class CellComparison {
  static Scanner input = new Scanner(System.in);

  public static void main(String[]args){
    System.out.println("How many months will you use the phone:");
    int month=input.nextInt();
    System.out.println("How many minutes will you talk per month:");
    int minutes=input.nextInt();
    //Plan 1
    double plan1=50*month+0.1*minutes*month;
    //Plan2
    double plan2=500+25*month+0.05*minutes*month;
    System.out.println("Under Plan 1, you'll pay: "+ plan1);
    System.out.println("Under Plan 2, you'll pay: "+ plan2);
 }
}