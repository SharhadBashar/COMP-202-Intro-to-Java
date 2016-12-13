//Sharhad Bashar
//ID: 260519664

import java.util.Scanner;
public class ConsecutiveChecker {
  static Scanner input=new Scanner(System.in);
  public static void main(String[]args){
    System.out.println("Please enter the number: ");
    int num=input.nextInt();
    int d=(num % 10);         //4th digit
    int c=(num % 100)/10;     //3rd digit
    int b=(num % 1000)/100;   //2nd digit
    int a=(num % 10000)/1000; //1st digit 
 
    boolean digitOne=(num<10);
    boolean digitTwo=((a==0 && b==0)&&(c==d-1||c==d+1));
    boolean digitThree=((a==0) && ((b==c+1 && c==d+1 )||(b==c-1 && c==d-1 )));
    boolean digitFour=((a==b+1 && b==c+1 && c==d+1)||(a==b-1 && b==c-1 && c==d-1));
         
    boolean isDigitConsecutive=(digitOne || digitTwo || digitThree || digitFour);
    System.out.println("Is the digit consecutive..."); 
    System.out.println(isDigitConsecutive);
  }
}