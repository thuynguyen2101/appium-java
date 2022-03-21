package lesson_02;

public class OperatorLearning {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        int sum = num1 + num2;
        System.out.println("Tong: " + sum);

        //In ấn có format
        int slashDivision = 5 / 2;
        int percentageDivision = 5 % 2;

        //5:2 kết qua bang 2 và du 1
        System.out.printf("%d:%d, ket qua bang %d, du %d", 5, 2, slashDivision, percentageDivision);
         /*
         * %d: byte, short, integer, long
         * %f: Float, double
         * %s: Character, String
         * %b: boolean
         */

    }
}
