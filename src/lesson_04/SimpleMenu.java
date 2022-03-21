package lesson_04;

import java.util.Scanner;

public class SimpleMenu {
    public static void main(String[] args) {
        /*
         * ========Menu========
         * 1.Input number
         * 2.Print Number list
         * 0. Exit!
         * */
        boolean isContinuing = true;
        while (isContinuing) {
            //Display menu
            System.out.println("========Menu========");
            System.out.println("1.Input number");
            System.out.println("2.Print Number list");
            System.out.println("0. Exit!");

            //input option
            Scanner scanner = new Scanner(System.in);
            System.out.println("Option number, please: ");
            int userInput = scanner.nextInt();

            //Trigger base on user's input

            if (userInput == 0) {
                isContinuing = false;
                System.out.println("Good bye!");
            } else if (userInput == 1) {
                System.out.println("Nhap so..");
            }
            if (userInput == 2) {
                System.out.println("Printing number...");
            }
        }
    }
}
