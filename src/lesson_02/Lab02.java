package lesson_02;

import java.util.Scanner;

public class Lab02 {
    public static void main(String[] args) {

//        Get input from user about height(m) and weight(kg) then calculate BMI
//
//        Underweight = <18.5
//        Normal weight = 18.5 – 24.9
//        Overweight = 25–29.9
//        Obesity = BMI of 30 or greater
//        BMI = weight / (height x 2)

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter height: ");
        Double height = scanner.nextDouble();
        System.out.println("Please enter weight: ");
        double weight = scanner.nextDouble();

         double BMI= weight/(height*height);
         if(BMI<=18.5){
             System.out.println("Under weight");
         } else if(BMI<=24.9){
             System.out.println("Normal weight");
         }else if(BMI<=29.9){
             System.out.println("Over weight");
         }else {
             System.out.println("Obesity");
         }
        // tìm so lượng số chẵn số lẻ
        System.out.println("Enter a number: ");
         int inputNumber = scanner.nextInt();
         if(inputNumber%2 !=0)
         {
             System.out.println("it is odd number");
         }else{
             System.out.println("It is even number");
         }
    }
}
