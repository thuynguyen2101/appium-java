package lesson_02;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        boolean isHeOnTime = true;
        boolean isHeAngry= false;
        System.out.println("Go to the coffee");
        if (isHeOnTime) {
            System.out.println("Let's talk");
            if(isHeAngry){
                System.out.println("Go Home");
            }
        } else {
            System.out.println("Writing a letter");
        }
        // Nested: lồng nhau
        //
    }
}
