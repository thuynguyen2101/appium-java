package lesson_05;

import java.util.*;

public class Lab_05 {
    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<>();

        boolean isContinuing = true;
        while (isContinuing) {
            //Display menu
            System.out.println("========Menu========");
            System.out.println("1.Input student infor");
            System.out.println("2.Find student by Id");


            //input option
            Scanner scanner = new Scanner(System.in);
            System.out.println("Option number, please: ");
            int userInput = scanner.nextInt();

            //Select option
            switch (userInput) {
                case 1:
                    System.out.println("Enter information of student: ");
                    student.put(1,"Teo");
                    student.put(2,"Ti");
                    student.put(3,"Bin");
                    break;
                case 2:
                    Set<Integer> allStudents= student.keySet();
                    System.out.println("Print information of these students: ");
                    for (Integer index : allStudents) {
                        System.out.println(student.get(index));
                    }
                    break;

                default:
                    System.out.println("Good bye!");

            }

        }
    }
}

