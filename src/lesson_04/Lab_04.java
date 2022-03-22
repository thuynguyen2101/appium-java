package lesson_04;

import java.util.*;

public class Lab_04 {
    public static void main(String[] args) {
        /*
         * ========Menu========
         * 1.Input number
         * 2.Print Number list
         * 0. Exit!
         *
         * =====MENU======
1. Add number into ArrayList
2. Print numbers
3. Get maximum number
4. Get minimum number
         * */

        List<Integer> myIntList= new ArrayList<>();
        boolean isContinuing = true;
        while (isContinuing) {
            //Display menu
            System.out.println("========Menu========");
            System.out.println("1.Add number into ArrayList");
            System.out.println("2.Print Number list");
            System.out.println("3.Print max value");
            System.out.println("4.Print min value");



            //input option
            Scanner scanner = new Scanner(System.in);
            System.out.println("Option number, please: ");
            int userInput = scanner.nextInt();
            //add number into arraylist
           // Scanner scanner = new Scanner(System.in);
            System.out.println("Add number into arraylist, please: ");


            //Trigger base on user's input

//            if (userInput == 0) {
//                isContinuing = false;
//                System.out.println("Good bye!");
//            }
            if (userInput == 1) {
                myIntList.add(1);
                myIntList.add(2);
                myIntList.add(3);
            }
            if (userInput == 2) {
                System.out.println(myIntList);
            }
            if(userInput == 3){
                System.out.println("Max value: "+ Collections.max(myIntList));
            }
            if(userInput==4){
                System.out.println("Min value: "+Collections.min(myIntList));
            }
        }

    }
}
