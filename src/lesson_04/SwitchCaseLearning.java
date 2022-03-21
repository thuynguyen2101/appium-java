package lesson_04;

import java.util.Scanner;

public class SwitchCaseLearning {
    public static void main(String[] args) {
        /*
        * 1=> Giai nhat
        * 2=> Giai nhi
        * 3=> Giai Ba
        * Others: Chúc bạn may mắn lần sau
        **/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Day: ");
        int userInput = scanner.nextInt();

        switch (userInput){
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekdays");
                break;
            case 7:
            case 8:
                System.out.println("Weekends!");
                break;
            default:
                System.out.println("Nhap lui roi nhe :D ");
        }


    }
}
