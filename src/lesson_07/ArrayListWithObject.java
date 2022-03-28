package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWithObject {
    public static void main(String[] args) {
        List<House> houseList= new ArrayList<>();
        House house1= new House("White",1);
        House house2= new House("White",1);
        House house3= new House("White",1);
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);

        final int HOUSE_2ND_INDEX=1;
        houseList.get(HOUSE_2ND_INDEX).setColor("Green");

        for (House housex : houseList) {
            System.out.println(housex);
        }

    }
}
