package lesson_03;

public class Lab_032 {
    public static void main(String[] args) {
//        Finding maximum value/minimum value from an integer array
//
//        int[] intArr = {1, 2, 3, 4, 5};
//
//        Minimum: 1
//        Maximum: 5

        int[] intArr={1,2,3,4,5};
        int Minimum=intArr[0];
        int Maximum=intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]>Maximum){
                Maximum=intArr[i];
            }
        }

        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]<Minimum){
                Minimum=intArr[i];
            }
        }
        System.out.println("Maximum number is: "+Maximum);
        System.out.println("Minimum number is: "+Minimum);
    }
}
