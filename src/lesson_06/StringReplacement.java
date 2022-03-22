package lesson_06;

public class StringReplacement {
    public static void main(String[] args) {
        String badWordContainer= "bad, very bad, sth else, bad";
        String filteredStr= badWordContainer.replace("bad","b**");

        System.out.println(badWordContainer);
        System.out.println(filteredStr);


        //SubString, indexOf, Split

        String googleUrl="https://google.com";
        System.out.println((googleUrl.indexOf("tt")));
        System.out.println("String length: "+(googleUrl.length()));

        for (int i = 0; i < 3; i++) {
            System.out.println("Element: "+(i+1));
        }

        System.out.println(googleUrl.substring(8));

        String[] splitStrings= googleUrl.split(":");
        for (String str : splitStrings) {
            System.out.println(str);
        }



    }
}
