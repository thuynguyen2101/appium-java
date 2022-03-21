package lesson_03;

import java.security.SecureRandom;
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        /*
        * Lucky number: Random
        * User: 3 times to guess
        *
        *
        * */
        int luckyNumber= new SecureRandom().nextInt(6);
        final int MAX_GUESS_TIME=3;
        boolean isAnswerCorrect= false;
        int guessTime=0;
        while(!isAnswerCorrect && guessTime<MAX_GUESS_TIME){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Input number: ");
            int userInput= scanner.nextInt();
            if(userInput==luckyNumber){
                System.out.println("Hooray...!");
                isAnswerCorrect= true;
            }else {
                guessTime++;
            }
            if(guessTime==MAX_GUESS_TIME)
            {
                System.out.println("See you nex time!");
            }
        }
    }
}
