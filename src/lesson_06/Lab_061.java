package lesson_06;

public class Lab_061 {
    public static void main(String[] args) {
        // Given input string: "2hrs and 5 minutes"
        //Please calculate how many minutes in total
        String myStr="2hrs and 5 minutes";
        String subHours= myStr.substring(0,4);
        System.out.println("SubHour: "+ subHours);
        String subMinutes = myStr.substring(5);
        System.out.println("Sub Minutes: "+subMinutes);
        String hours= subHours.trim().replaceAll("[^0-9]","");
        System.out.println("String hour: "+hours);
        String minutes=subMinutes.replaceAll("[^0-9]","");
        System.out.println("String minutes:"+ minutes);

        int intHours= Integer.parseInt(hours);
        System.out.println("Hours: "+intHours);
        int intMinutes= Integer.parseInt(minutes);
        System.out.println("Minutes: "+intMinutes);
        System.out.println("Total minutes are: "+(((intHours * 60) + intMinutes)));


    }
}
