//sharhad Bashar
//260519664

import java.util.Random;
import java.util.Scanner; //Scanner used for testing the methods

public class ArrayUtilities {
//**************************************** Main to test the methods******************************************* 
  public static void main (String[]args){
    Scanner input=new Scanner(System.in);
    System.out.print("Please enter how many numbers you want to enter: ");
    int n=input.nextInt();
    int[]array=new int[n];
    System.out.println("Please enter the numbers of the array: ");
    for (int i =0; i<n;i++){
      array[i]=input.nextInt();
    }
    System.out.print("Enter target: ");
    int target=input.nextInt();
    
    /*Call Method 1*/
    System.out.println("Linear Search");
    System.out.println(linearSearch(array,target));
    
    /*Call Method 2*/
    System.out.println();
    System.out.println("Binary Search");
    System.out.println(binarySearch(array,target));
    
    /*Call Method 3*/
    System.out.println();
    System.out.println("Copying");
    System.out.print("{");
    for (int i=0;i<array.length;i++){
      System.out.print(copy(array)[i]+" ");
    }
    System.out.println("}");
    
    /*Call Method 4*/
    System.out.println();
    System.out.println("Bubble Sort");
    sort(array);
    
    /*Call Method 5*/
    System.out.println();
    System.out.println("Random Array Generator");
    System.out.print("{");
    for (int i=0;i<n;i++){
      System.out.print(generateRandom(n)[i]+" ");
    }
    System.out.print("}");
  }
//*********************************************************************************************************
  
//Method 1***************************************************************************88
  public static boolean linearSearch(int[]x,int target){
    for (int i=0;i<x.length;i++){
      if (x[i]==target){
        return true;
      }
    }
    return false;
  }
//*********************************************************************************88
  
//Method 2*************************************************************************88
  public static boolean binarySearch(int[]array,int target){
    int left=0;
    int right=array.length-1;
    int middle;
    middle = (left+right)/2;
  
    if (array[middle] == target){
      return true;
    }
    else if (array[middle] < target){
      for (int i = middle+1; i <= right; i++){
        if (array[i] == target){
          return true;
        }
      }
    }
    else if (array[middle] > target){
      for (int i = middle-1; i > 0; i--){
        if (array[i] == target){
          return true;
        }
      }
    }
    return false;
  }
//*********************************************************************************88
  
//Method 3*************************************************************************88
  public static int[] copy(int[]array){
    int []copiedArray=new int[array.length];
    for (int i=0;i<array.length;i++){
      copiedArray[i]=array[i];
    }
    return copiedArray;
  }
//*********************************************************************************88
  
//Method 4*************************************************************************88
  public static void sort(int[] array) {
    boolean swapped = true;
    int i = 0;
    int temporary;
    while (swapped){
      swapped = false;
      i++;
      for (int j = 0; j < array.length - i; j++) {
        if (array[j] > array[j + 1]) {
          temporary = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temporary;
          swapped = true;
        }
      }
    }
    /*Prints the sorted array. Commented out so it doesnt show un the the third class while running the comparision\
     The print statement is put here since its a void method and doesnt return anything
     System.out.print("{");
     for (i=0; i<array.length;i++){
     System.out.print(array[i]+" ");
     }
     System.out.println("}");
     }*/
  }
//*********************************************************************************88
  
//Method 5*************************************************************************88
  public static int[] generateRandom(int n){
    Random r=new Random(1);
    int [] array=new int[n];
    for (int i =0; i<n;i++){
      array[i]=r.nextInt(Integer.MAX_VALUE);
    }
    return array;
  }
//*********************************************************************************88
}
