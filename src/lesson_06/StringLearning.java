package lesson_06;

public class StringLearning {
    public static void main(String[] args) {
//        String s1= "Teo";
//        String s2= "teo";
//        String s3= new String("Teo");
//        System.out.println((s1.equalsIgnoreCase(s2)));
//        System.out.println((s2.equals(s3)));

        //Xu ly từng character trong string

        String myPassword ="123myassword";
        int totalDigit=0;
        int totalUpperCases=0;
        int totalLowerCase=0;


        char[] passwordCharacters = myPassword.toCharArray();
        for (char character : passwordCharacters) {
            if(Character.isDigit(character))
                totalDigit++;
            if(Character.isUpperCase(character))
                totalUpperCases++;
            if(Character.isLowerCase(character))
                totalLowerCase++;
        }
        if(totalDigit>0 &&totalUpperCases>0 && totalLowerCase>0){
            System.out.println("Password is correct");
        }else{
            System.out.println("Password is incorrect");
        }



    }
}
