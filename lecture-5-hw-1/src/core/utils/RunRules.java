package core.utils;

public class RunRules {
    public static boolean run(boolean... things) {
      	 for(boolean thing : things) {
      		 if(!thing) return false;
      	 }
      	 return true;
       }
}
