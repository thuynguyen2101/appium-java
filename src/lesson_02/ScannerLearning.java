package lesson_02;

import java.util.Scanner;

public class ScannerLearning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int inputNumber= scanner.nextInt();
        System.out.println("Input number is: " +inputNumber);
    }
}
