package lesson_02;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {
     /*
     * Under 18: ko bán
     * 18-50: Unlimited
     * 51 ->: 2 chai
     */
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter your age: ");

        int customerAge= scanner.nextInt();
        if(customerAge < 18){
            System.out.println("Khong ban");
        }else if(customerAge<=50){
            System.out.println("Unlimited");
        }else {
            System.out.println("2 chai");
        }

    }
}
