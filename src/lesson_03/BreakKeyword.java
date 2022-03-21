package lesson_03;

public class BreakKeyword {
    public static void main(String[] args) {
        int[] intArray= {1,2,3,4,5};
        //find the index of the number 3
        for (int elementIndex = 0; elementIndex < intArray.length; elementIndex++) {
            System.out.println(intArray[elementIndex]);
            if(intArray[elementIndex]==3){
                System.out.println("Number 3 index is: "+elementIndex);
                break;
            }
        }
    }
}
