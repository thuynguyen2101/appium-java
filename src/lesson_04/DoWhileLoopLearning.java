package lesson_04;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoopLearning {
    public static void main(String[] args) {

        final int MAX_GUESS_TIME = 3;
        boolean isAnswerRight = false;
        int guessTime = 0;
        int luckyNumber = new SecureRandom().nextInt(6);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input number: ");
            int userInput = scanner.nextInt();
            if (userInput == luckyNumber) {
                System.out.println("Hooray...!");
                isAnswerRight = true;
            }
            guessTime++;
        } while (!isAnswerRight && guessTime < MAX_GUESS_TIME);
        if (guessTime == MAX_GUESS_TIME) {
            System.out.println("See you next time");
        }
    }
}
