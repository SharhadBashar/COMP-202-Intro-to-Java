//Sharhad Bashar
//260519664

public class StopWatch {
  private long startTime,stopTime; //Declaring the two private variables with type:long
  
//The constructor 
  public StopWatch () {
    startTime=0;
    stopTime=0;
  }
//********************************** Pre-defined Main Method***********************************************
  public static void main(String[] args){
    StopWatch watch = new StopWatch();
    watch.start();
    for (int i = 0; i < 100; i++){
      System.out.println("I'm going to test how fast it is to print this 100 times");
    }
    watch.stop();
    System.out.println("It took " + watch.getTimeNano() + " nanoseconds to complete that task");
  }
//*********************************************************************************************************
  
//Method that sets the value startTime
  public void start(){
    startTime=System.nanoTime();
  }
  
//Method that sets the value stopTime
  public void stop(){
    stopTime=System.nanoTime();
  }
  
//Calcuates Nanoseconds
  public long getTimeNano(){
    long difference;
    difference=stopTime-startTime;
    return difference;
  }
  
//Calculates Microseconds
  public long getTimeMicro(){
    return getTimeNano()/1000;
  }
  
//Calculates Milliseconds
  public long getTimeMilli(){
    return getTimeNano()/1000000;
  }
  
//Calculates Seconds
  public long getTimeSeconds(){
    return getTimeNano()/1000000000;
  }
}
