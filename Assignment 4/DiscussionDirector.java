//Sharhad Bashar
//ID:260519664

import java.util.*;
import java.io.*;

public class DiscussionDirector{
    static Random r = new Random();

  //The discussion method that takes input -> two agents and generates a discussion
  public void discuss(Agent a1, Agent a2) {
    int pro = r.nextInt(100);
    a1.sayHiHabibi();
    if (pro < 50) {
      a2.saysHelloTo(a1);
      pro = r.nextInt(100);
      if (pro >= 20) {
        a1.sayWhyNotFeelGood();
        a2.sayLeftMyHome();
        a1.sayWellMeToo();
        pro = r.nextInt(100);
        if (pro < 30) {
          a2.saySorryCanNotTalk(a1);
        } else {
          a2.sayFacinating();
        }
      } else {
        a1.sayWellDoNot(a2);
        pro = r.nextInt(100);
        if (pro < 10) {
          a2.sayWellIamSorry();
        } else {
          a2.sayNoOneInMy();
        }
        a1.saySorryHaveToGo();
      }
    } else {
      a2.sayHowAreYou();
      a1.sayFine();
      a2.sayCityBorn();
      a1.sayIDoNotLike(a2);
      pro = r.nextInt(100);
      if (pro < 30) {
        a2.sayFacinating();
      } else {
        a2.sayILove();
        a1.sayWellThanks();
        a2.sayHelloMyName(a1);
        a1.sayHaveToGoNow(a2);
      }
    }
  }
  
  //Main method
  public static void main(String[] args) throws IOException {
    Agent a1 = Agent.generateRandomAgent();
    Agent a2 = Agent.generateRandomAgent();
    DiscussionDirector discussion = new DiscussionDirector();
    discussion.discuss(a1,a2);
  }
    
}