package lesson_03;

public class Lab_031 {
    public static void main(String[] args) {
//        Lab 3.1:
//        Count how many odd, even number(s) in an integer array
//
//        int[] intArr = {1, 2, 3, 4, 5};
//
//        Even numders: 2
//        Odd numbers: 3

        int[] intArr = {1, 2, 3, 4, 5};
        int odd = 0;
        int even = 0;
        for (int elementindex = 0; elementindex < intArr.length; elementindex++) {
            if (intArr[elementindex] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even is: " + even);
        System.out.println("Number of odd is:  " + odd);
    }
}
