package lesson_05;

import lesson_04.ArrayListLearnin_2;

import java.util.*;

public class HashMapLearning {
    public static void main(String[] args) {
        //CRUD
        //khoi tap

        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Police");
        emergencyList.put(114, "Fire Dept");
        emergencyList.put(115, "Hospital");
        emergencyList.put(116, "Others");
//        emergencyList.put(113,"CSCD");

        //Read
//        System.out.println(emergencyList.get(113));

        //Update
//        emergencyList.replace(113,"CSCD");
//        emergencyList.replace(113,"CSCD","Police");

        //Read
//        System.out.println(emergencyList.get(113));
//        System.out.println(emergencyList.get(113));

        //Remove
//        emergencyList.remove(116);
//        System.out.println(emergencyList.get(116));

//        Set<Integer> allkeys = emergencyList.keySet();
//        Iterator<Map.Entry<Integer,String>> emergenctyListIterator= emergencyList.entrySet().iterator();
//
//        while (emergenctyListIterator.hasNext()){
//            Map.Entry<Integer,String> entry= emergenctyListIterator.next();
//            String entryValue = entry.getValue();
//            if(entryValue.equals("Others")){
//               emergenctyListIterator.remove();
//        }

//        for (Integer key : allkeys) {
//          // System.out.println(emergencyList.get(key));
//            if(emergencyList.get(key).equals("Others")){
//                emergencyList.remove(key);
//            }
////        }
//        for (Integer key : allkeys) {
//            System.out.println(emergencyList.get(key));
//        }


        Map<String, List<Integer>> salaryTracking = new HashMap<>();
        salaryTracking.put("Teo", Arrays.asList(10, 11, 2, 20));
        salaryTracking.put("Ti", Arrays.asList(15, 10, 17));

        List<Integer> teoSalary = salaryTracking.get("Teo");
        int teoTotalSalary = 0;
        for (Integer dailySalary : teoSalary) {
            teoTotalSalary = teoTotalSalary + dailySalary;
        }
        System.out.println(teoSalary);
    }
}

