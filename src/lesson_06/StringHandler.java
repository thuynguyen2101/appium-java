package lesson_06;

import java.security.SecureRandom;

public class StringHandler {
    public static void main(String[] args)  {
//        System.out.println(extractNumber("203fiosfuosfuoiof"));
//        System.out.println(extractNumber(""));
//        System.out.println(extractNumber(null));
        saySth();
    }
  public static String extractNumber(String originalStr) {
        if(originalStr==null ){
            throw new IllegalArgumentException("Proved str is null");
        }
        if(originalStr.length()==0){
            return "";
        }
      return originalStr.replaceAll("[^0-9]","");
    }


    public static int generateRandomNumber(){
      return new SecureRandom().nextInt(Integer.MAX_VALUE);
     }

     public static void saySth(){
         System.out.println("I found the number %d for you: "+generateRandomNumber());
     }

     //parameters and argument
}
