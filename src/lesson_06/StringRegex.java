package lesson_06;

public class StringRegex {
    public static void main(String[] args) {
        String myCookingTimes= "      105 mins      ";
        String trimString =myCookingTimes.trim();
//        System.out.println(myCookingTimes);
//        System.out.println(trimString);

        //Regulor expression
        String myCoookingTimeStr=myCookingTimes.replaceAll("[^0-9]","");
        System.out.println(myCoookingTimeStr);

        int myCookingTimeInt= Integer.parseInt(myCoookingTimeStr);
        myCookingTimeInt++;
        System.out.println(myCookingTimeInt);

        String s1="Hello";
        String s2="Kitty";
        //Concatenation: nối chuỗi dùng dấu +

        System.out.println(s1.concat(" ").concat(s2));

    }
}
