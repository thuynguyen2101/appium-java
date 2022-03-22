package lesson_06;

import java.util.Scanner;

public class Lab_062 {
    public static void main(String[] args) {
        String myPassword= "password123";
        int enterTime=0;


        do{
            Scanner scanner= new Scanner(System.in);
            String stringEnterByUser;
            System.out.println("Enter the String: ");
            stringEnterByUser=scanner.nextLine();
            if(stringEnterByUser.equals(myPassword))
            {
                System.out.println("Entering right password!");
            }else {
                System.out.println("Entering wrong password");
            }
            enterTime++;

        } while(enterTime<3);
    }
}
