//Sharhad Bashar
//ID:260519664
//Question 3

import java.util.Scanner;
public class Question3 {

public static void main(String[]args){
Scanner input=new Scanner(System.in);
//The center point of the Ellipse
System.out.println("Please enter the center (x,y) coordinates of the eclipse: ");
int x=input.nextInt();
int y=input.nextInt();

//The two radii of the Ellipse
System.out.println("Please enter the two radii of the circle");
int radiusA=input.nextInt();
int radiusB=input.nextInt();
//Run the void method
DrawMeAnEllipse(x,y,radiusA,radiusB);
}

public static void DrawMeAnEllipse(int posX, int posY, double radiusA, double radiusB){
//The center and radii of the Ellipse
System.out.println("Center:(" + posX + "," + posY +")");
System.out.println("Radii:" + radiusA + " and " + radiusB);
 for(int j=0;j<40;j++){
     for(int i=0;i<40;i++){
     double r= Math.sqrt(Math.pow(((posX-i)/radiusA),2.0)+Math.pow(((posY-j)/radiusB),2.0)); //Ellipse equation
      if((int)r == 1){
        System.out.print("*");
       }
      else{
       System.out.print(" ");
      }
     }
    System.out.println(); //Goes to the next line
    }
}
}

