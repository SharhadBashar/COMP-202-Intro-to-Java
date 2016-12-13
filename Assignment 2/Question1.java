//Sharhad Bashar
//ID:260519664
//Question 1

import java.util.Scanner;
public class Question1{
public static void main (String [] args){
 Scanner input = new Scanner(System.in);
 System.out.println("Please enter a sting of your choice: ");
 String b = input.next();
 isConsequitive(b);
}
public static void isConsequitive (String b){
 int sLength = b.length();
 String a = b.toUpperCase();
 int countNum =0;
 int countLetter =0;
 int countConsNumber =0;
 int countConsLetter = 0;
//***********************CHECKS IF LETTERS, NUMBERS OR BOTH********************************** 
 for (int i = 0; i < sLength; i++){
  if (a.charAt(i) >= '0' && a.charAt(i) <= '9'){
   countNum+=1;
   }
  else if (a.charAt(i) >= 65 && a.charAt(i) <= 90){
   countLetter+=1;
  }
 }
//********************************************************************************************
//USER ENTERED ALL NUMBERS
 if (countNum == sLength) {                                        
  System.out.println("You've entered all numbers");
  for (int i = 0; i < sLength-1; i++){
   if ((a.charAt(0)+1==a.charAt(1))&&(a.charAt(i)+1==a.charAt(i+1))||(a.charAt(i)-('9'-'0'))==(a.charAt(i+1))||(a.charAt(0)-1==a.charAt(1))&&(a.charAt(i)-1==a.charAt(i+1))||(a.charAt(i)-('0'-'9'))==(a.charAt(i+1))){
    countConsNumber+=1;
   }
  }
 }
//USER ENTERED ALL LETTERS
 else if (countLetter == sLength) {       
  System.out.println("You've entered all Letters");
  for (int i = 0; i < sLength-1; i++){
   if ((a.charAt(0)+1==a.charAt(1))&&(a.charAt(i)+1==a.charAt(i+1))||(a.charAt(i)-('Z'-'A'))==(a.charAt(i+1))||(a.charAt(0)-1==a.charAt(1)) && (a.charAt(i)-1==a.charAt(i+1))||(a.charAt(i)-('A'-'Z'))==(a.charAt(i+1))){
    countConsLetter+=1;
   }
  }
 }
//USER ENTERED A MIXTURE OF NUMBERS AND LETTERS
 else {
  System.out.println("You've entered a mixture of Numbers and Letters.");
 }
//************************** FINAL ANSWER *********************************
if (countConsNumber==sLength-1 || countConsLetter==sLength-1){
 System.out.println(b+" IS Consequtive");
}
else {
 System.out.println(b+ " is NOT Consequtive");
}
//*************************************************************************
}
}