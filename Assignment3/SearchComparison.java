//Sharhad Bashar
//260519664

import java.util.Arrays; //Import the library that is required for the Arrays.sort to work

public class SearchComparison {
  
  public static void main (String []args){
    int limit=50000000; //the number of times the loop is executed. I set it as a variable, so it would be easier to change depending on the computer's capabilities
    int [] array=new int[limit/2]; //(limit/2) is the number of integers in the array, since we are incrementing it by double for every loop
    int [] copiedArray=new int[limit/2]; // the variable that stores the copied array
    
    //Varibles that store the time in Micro Seconds
    long timeGenerateArray=0;
    long timeLinearSearch=0;
    long timeToCopy=0;
    long timeBubbleSort=0;
    long timeLibraryMethod=0;
    long timeBinarySearch=0;
    long totalTime=0;
    
    //Creates the object StopWatch
    StopWatch time = new StopWatch();
    
    System.out.println("n, timeGenerateArray, timeLinearSearch, timeDuplicate, timebubbleSort, timeLibrary, timeBinarySearch");//Prints the titles and position of each time values for easier comparision 
    
//main loop
    time.start();
    for (int n = 10; n < limit; n *= 2){
      
      //Tests and stores the time it takes to generate an array of size n and fill it with random digits
      time.start();
      array=ArrayUtilities.generateRandom(n);
      time.stop();
      timeGenerateArray=time.getTimeMicro();
      
      //Tests and stores the time it takes to search for -1
      time.start();
      ArrayUtilities.linearSearch(array,-1);
      time.stop();
      timeLinearSearch=time.getTimeMicro();
      
      //Tests and stores the time it takes to copy the previously generated array
      time.start();
      copiedArray=ArrayUtilities.copy(array);
      time.stop();
      timeToCopy=time.getTimeMicro();
      
      //Tests and stores the time it takes to sort the array using Bubble Sort
      //ignores arrays with more that 100000 integers so it speeds up the program
      if (n <= 100000){
        time.start();
        ArrayUtilities.sort(array);
        time.stop();
        timeBubbleSort=time.getTimeMicro();
      }
      else{
        timeBubbleSort = 0;
      }
      
      //Tests and stores the time it takes to sort the copied Array using Javas predefined library method
      time.start();
      Arrays.sort(copiedArray);
      time.stop();
      timeLibraryMethod=time.getTimeMicro();
      
      //Tests and stores the time it takes to perform binary search for the value -1
      time.start();
      ArrayUtilities.binarySearch(array, -1); 
      time.stop();
      timeBinarySearch=time.getTimeMicro();
      
      //Printing all the values:
      System.out.println(n + " , " + timeGenerateArray + " , " + timeLinearSearch + " , " +timeToCopy + " , " + timeBubbleSort + " , " + timeLibraryMethod + " , " + timeBinarySearch);
    }
    time.stop();
    totalTime=time.getTimeMilli();
    System.out.println("Time taken to execute program: "+totalTime + " milliseconds");//Shows the total time taken to execute the whole program in milliseconds
  }
}
