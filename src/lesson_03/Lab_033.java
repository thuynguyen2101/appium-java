package lesson_03;

public class Lab_033 {
    public static void main(String[] args) {
//        Sort an integer array from min to max
//        Input: {12, 34, 1, 16, 28}
//        Expected output: {1, 12, 16, 28, 34}
        int[] intArr={12,34,1,16,26};
        int usp= intArr.length-1;

        while(usp>0){
            for(int index=0; index<usp; index++){
                if(intArr[index]>intArr[index+1]){
                    int temp= intArr[index+1];
                    intArr[index]=intArr[index+1];
                    intArr[index+1]=temp;
                }
            }
         usp--;
        }
        for (int value:intArr){
            System.out.println(value);
        }
    }
}
