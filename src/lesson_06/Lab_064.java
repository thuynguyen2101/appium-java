package lesson_06;

public class Lab_064 {
    public static void main(String[] args) {
//        LAB 6.4
     String url = "https://google.com";
//        Check http OR https; domain name, .com OR .net

        if(url.indexOf("https")==0){
            System.out.println("Here is https");
        }else {
            System.out.println("Here is http");
        }

        if(url.indexOf(".com")==0){
            System.out.println("Here is .com");
        }else {
            System.out.println("Here is .net");
        }


    }
}
