package lesson_04;

import java.util.*;

public class ArrayListLearnin_2 {
    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(1);
        arrList.add(2);
        arrList.add(2);
        arrList.add(4);
        arrList.add(3);

        List<Integer> noDuplicatedList =new ArrayList<>();
//        Set<Integer> set = new HashSet<>(arrList);
//        List<Integer> withoutDuplicatedValues = new ArrayList<>(set);
//        for (Integer value : arrList) {
//            if(!noDuplicatedList.contains(value)) {
//                noDuplicatedList.add(value);
//            }
//            }
        Set<Integer> set2= new HashSet<>(arrList);
        List<Integer> cloneList = new ArrayList<>(set2);
        cloneList.add(100);

//       Collections.sort(withoutDuplicatedValues);
//        for (Integer value : withoutDuplicatedValues) {
////            System.out.println(value);
////        }
//        System.out.println("================");
//        for (Integer value : cloneList) {
//            System.out.println(value);
//        }

        //Work with new list
        List<Integer> subList= cloneList.subList(0,4);
        for (Integer value : subList) {
            System.out.println(value+ "");
        }

        ///Convert array to ArrayList

        Integer[] myIntArrWrapperType={6,7,8};
        List<Integer> listFromArr= Arrays.asList(myIntArrWrapperType);

    }
}
