//Sharhad Bashar
//ID:260519664
//Question 2

import java.util.Scanner;
public class Question2 {
 
public static void main(String[]args){
Scanner input=new Scanner(System.in);
//Enter the center of the Circle
 System.out.println("Please enter the center point of the circle:");
 int x=input.nextInt();
 int y=input.nextInt();
//Enter the radius of the Circle 
 System.out.println("Please enter the radius:");
 int r=input.nextInt();
//Run the void method 
 DrawMeACircle(x,y,r);
   
}

public static void DrawMeACircle(int posX, int posY, double radius){
//Prints the center and radius of the Circle
System.out.println("Center:(" + posX + "," + posY +")");
System.out.println("The radius of the circle is: "+ radius);
 for (int j=0;j<=40;j++){
  for (int i=0;i<=40;i++){
   double r=Math.sqrt(Math.pow((posX-i),2)+ Math.pow((posY-j), 2)); //Equation of the Circle
    if ((int)r==radius) {
    System.out.print("*"); //A * circle looks much neater to me!
   }
   else {
    System.out.print(" ");
   }
  }
  System.out.println(); //Goes to the next line
 }
}
}
