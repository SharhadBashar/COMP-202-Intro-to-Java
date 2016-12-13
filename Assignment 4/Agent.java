//Sharhad Bashar
//ID:260519664

import java.util.*;
import java.io.*;

public class Agent {
  private boolean isFemale; //Stores the gender of the agent
  private String name, cityBorn, cityLiving, major; ////Stores the rest of the agents identity
  private int [] birthday=new int[3]; //Stores the birthday of the agent
  
  static Random r = new Random(); 
  
  //Constructor
  public Agent (String fileFemale, String fileMale, String fileCities, String fileMajor) throws IOException {
    int n = r.nextInt(2);//Gives a random number between 0 and 1
    if (n==0){ // If 0, its a girl
      isFemale=true; 
      WordList femaleName = new WordList(fileFemale); 
      this.name = femaleName.getRandomWord(); //Gets a random name for the girl
    }
    else { //else if the number was 1, we get a male agent
      isFemale=false;
      WordList maleName = new WordList(fileMale);
      this.name = maleName.getRandomWord(); //Gets a random name for the guy
    }
    
    WordList city = new WordList(fileCities);
    this.cityBorn = city.getRandomWord(); //Gets the agent's birth city
    this.cityLiving = city.getRandomWord(); //Gets the agents current city
    
    WordList currentMajor = new WordList(fileMajor);
    this.major = currentMajor.getRandomWord(); //Gets the agents major
    
    int nYear = r.nextInt(51)+1940; //Gets the birth year of the agent
    birthday [2]=nYear; 
    int nMonth = r.nextInt(12)+1; //Gets the birth month of the agent
    birthday [1]=nMonth;
    if (nMonth == 1 || nMonth == 3 || nMonth == 5 || nMonth == 7 || nMonth == 8 || nMonth == 10 || nMonth == 12){ //Months that have 31 days
      birthday [0] = r.nextInt(31)+1;
    }
    else if (nMonth == 4 || nMonth == 6 || nMonth == 9 || nMonth == 11){ //Months that have 30 days
      birthday [0] = r.nextInt(30)+1;
    }
    else{ //February
      if (nYear % 4 == 0){ //Leap year
        birthday [0] = r.nextInt(29)+1; 
      }
      else{ //Non leap year
        birthday [0] = r.nextInt(28)+1;
      }
    }
  }
//Get methods***************************************************************************8  
  public String getCityBorn() {
    return this.cityBorn;
  }
  public String getCityLiving(){
    return this.cityLiving;
  }
  public String getName() {
    return this.name;
  }
  public String getGender() {
    if (this.isFemale == true){
      return "Female";
    }
    else{
      return "Male";
    }
  }
  public String getMajor() {
    return this.major;
  }
  public String getBirthday() {
    return (this.birthday[0] + "/" + this.birthday[1] + "/" + this.birthday[2]) ;
  }
//say methods***************************************************************************************
  public void sayName(){
    System.out.println(this.name + " says: Hello dear, my name is " + this.name);
  }
  public void sayCityBorn() {
    System.out.println(this.name + " says: I am from " + this.cityBorn);
  }
  public void sayAge() {
    int age=(Calendar.getInstance().get(Calendar.YEAR) - this.birthday[2]);
    System.out.println(this.name + " says: I am " + age + " years old");
  }
  public void sayGender() { 
    System.out.println(this.name + " says: I am a " + getGender());
  } 
  public void sayCityLiving() {
    System.out.println(this.name + " says: I live in " + this.cityLiving);
  }
  public void sayMajor() {
    System.out.println(this.name + " says: I am majoring in " + this.major);
  }
  public void sayBirthday(){
    System.out.println(this.name + " says: My birthday is on " + getBirthday());
  }    
  //**********************************************************************************************
  //The who are you method
  public void whoAreYou() {
    this.sayName();
    this.sayGender();
    this.sayCityBorn();
    this.sayAge();
    this.sayCityLiving();
    this.sayMajor();
    this.sayBirthday();
  }
  
  //Generates a random agent
  public static Agent generateRandomAgent(){
    try{
      Agent randomAgent = new Agent("FemaleNames.txt","MaleNames.txt","Cities.txt","Majors.txt");
      return randomAgent;
    }
    catch (Exception e){
      System.out.println(e);
    }
    return null;
  }
  //Main method
  public static void main (String [] args) throws IOException {
    Agent doubleOO7 = generateRandomAgent();
    doubleOO7.whoAreYou();
    
  }
  //methods for DiscussionDirector**********************************************************************  
  public void sayHello() {
    System.out.println(this.name + " says: Hello my dear");
  }
  public void sayHiHabibi() {
    System.out.println(this.name + " says: Hello my name is " + this.getName() + ".");
  }
  public void saysHelloTo(Agent a) {
    System.out.println(this.name + " says: Hello " +  a.getName() + ", I am " + this.name + ", and I'm not feeling so good.");
  }
  public void sayHowAreYou() {
    System.out.println(this.name + " says: How are you?");
  }
  public void sayWhyNotFeelGood() {
    System.out.println(this.name + " says: Why are you not feeling so good?");
  }
  public void sayLeftMyHome() {
    System.out.println(this.name + " says: I just my home rown " + this.getCityBorn() + ".");
  }
  public void sayWellMeToo() {
    System.out.println(this.name + " says: Well me too, I was from " + this.getCityBorn() + " and now I live in " +  this.getCityLiving() + ".");
  }
  public void saySorryCanNotTalk(Agent a) {
    System.out.println(this.name + " says: Sorry I cannot speak with people from " + a.getCityBorn() + ".");
  }
  public void sayFacinating() {
    System.out.println(this.name + " says: This is so facinating!");
  }
  public void sayWellDoNot(Agent a) {
    System.out.println(this.name + " says: Well " + a.getName() + ", I do not care because I am from " + this.getCityBorn() + ".");
  }
  public void sayWellIamSorry() {
    System.out.println(this.name + " says: Well I am sorry, I am Canadian.");
  }
  public void sayNoOneInMy() {
    System.out.println(this.name + " says: No one in my major " + this.getMajor() + " is this rude.");
  }
  public void saySorryHaveToGo() {
    System.out.println(this.name + " says: Sorry I have to go.");
  }
  public void sayFine() {
    System.out.println(this.name + " says: Fine. Where are you from?");
  }
  public void sayIDoNotLike(Agent a) {
    System.out.println(this.name + " says: I do not like people from " + a.getCityBorn() + " because I am from " + this.getCityBorn() + ".");
  }
  public void sayILove() {
    System.out.println(this.name + " says: I love your groove.");
  }
  public void sayWellThanks() {
    System.out.println(this.name + " says: Well thank you, but I don't know your name.");
  }
  public void sayHelloMyName(Agent a) {
    System.out.println(this.name + " says: Hello " +  a.getName() + " my name is " + this.getName() + ".");
  }
  public void sayHaveToGoNow(Agent a) {
    System.out.println(this.name + " says: Sorry " + a.getName() + ", I have to go.");
  }
  
  
//****************************************************************************************************
  
}