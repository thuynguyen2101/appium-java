package lesson_02;

import java.util.Scanner;

public class BitWiseOperator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String inputName= scanner.nextLine();
        if (inputName != null && inputName.length()>=2){
            System.out.println("Valid name");
        }else {
            System.out.println("Invalid name");
        }
    }
}
