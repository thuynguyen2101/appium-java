package lesson_03;

public class ArrayLearning {
    public static void main(String[] args) {
        //int[] intArray = new int[5];
     int[] intArray={1,2,3,4,5};
//
//        for (int i = 0; i < intArray.length; i++) {
//            intArray[i]=i+1;
//        }
//
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println(intArray[i]);



            //ehance for
            for (int element : intArray) {
                System.out.println(element);

            }
        }
    }
