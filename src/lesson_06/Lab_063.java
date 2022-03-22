package lesson_06;

public class Lab_063 {
    public static void main(String[] args) {
        /*
        *String myStr = "100 minutes";
        NOT using REGEX, extract digit character from that String
        Expected output: "100".
        EX: "12345nabc678" -> "12345678"
        *
        *
        * */
        String myStr="100 minutes";
        String myStr1="";
        //int totalDigit=0;

        char[] passwordCharacters = myStr.toCharArray();
        for (char character : passwordCharacters) {
            if(Character.isDigit(character)) {
                //totalDigit++;
//                System.out.println(character);
                myStr1 = myStr1+ character;
            }
        }
        System.out.println(myStr1);
    }
}
