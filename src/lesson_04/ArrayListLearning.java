package lesson_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {
    public static void main(String[] args) {

//        List<Integer> myArrayList= Arrays.asList(1,2,3);
        List<Integer> myIntList= new ArrayList<>();

//        myArrayList.add(4);//add ko được , remove ra ko được chỉ có update là được
       //Add value
        myIntList.add(1); // index=0
        myIntList.add(3); //
        myIntList.add(4); //
        myIntList.add(1,2); //Update


        myIntList.set(3,6);
        System.out.println(myIntList);


        //length/ .size()
        int listLength = myIntList.size();
        for (int index = 0; index < listLength; index++) {
            System.out.println(myIntList.get(index));
        }
        // enhance for
        myIntList.remove(3);
        for (Integer value : myIntList) {
            System.out.println(value);
        }


    }
}
