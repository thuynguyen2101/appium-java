package lesson_02;

public class SingleIfElseStatement {
    public static void main(String[] args) {
        boolean isHeOnTime = true;
        System.out.println("Go to the coffee");
        if (isHeOnTime) {
            System.out.println("Let's talk");
        } else {
            System.out.println("Writing a letter");
        }
        // Toan tử 3 ngôi
        int timeToCome= isHeOnTime? 7:0;
        System.out.println("timeToCome" +timeToCome);
        System.out.println("Let's go home");
    }
}
