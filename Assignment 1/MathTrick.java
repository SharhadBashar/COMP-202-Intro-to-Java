//Sharhad Bashar
//ID: 260519664

import java.util.Scanner;
public class MathTrick {
  static Scanner input=new Scanner(System.in);

  public static void main(String[]args){
    System.out.println("Please enter a 3 digit number in which all digits are decreasing: ");
    int num=input.nextInt(); //num is the user input
    int a=(num % 10);
    int b=(num % 100)/10;
    int c=(num % 1000)/100;
    int numr=a*100+b*10+c;
    System.out.println("Your reversed number is: " + numr); // numr is the input reversed
    int dif=num-numr; //dif is the difference between the input and its reversed value
    System.out.println("Difference is: " + dif);
    int d=(dif % 10);
    int e=(dif % 100)/10;
    int f=(dif % 1000)/100;
    int difr=d*100+e*10+f; //difr is the difference between the initial two values and the reversed value
    System.out.println("The difference reversed is: " + difr);
    int sum=dif+difr;
    System.out.println("The total sum is " + sum);
 }
}
