//Sharhad Bashar
//ID:260519664

import java.io.*;
import java.util.*;

public class WordList {
  private ArrayList<String> word;//Array list of words
  
//Constructor
  public WordList (String filename)throws IOException{
    word=new ArrayList<String>();
    BufferedReader input=new BufferedReader (new FileReader(filename));//Initializing the buffered reader
    String line=input.readLine();//Line Reader
    while (line!=null){
      word.add(line);
      line=input.readLine();
    }
    input.close(); //Closes the Buffered Reader
  }
  //Returns random word
  static Random r=new Random();
  public String getRandomWord(){
    int index=r.nextInt(word.size()-1);
    String randomString=word.get(index);
    return randomString;
    
  }
 /*main method to try the class and see if it works properly
  public static void main(String[] args){
   try{
   WordList testClass = new WordList("MaleNames.txt");
   testClass.getRandomWord();
   }
   catch(Exception e){
   System.out.println("exception");
   }
   }*/
}

