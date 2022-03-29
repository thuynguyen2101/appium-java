package lesson_07;

import java.util.*;

public class Lab_07_test_book {
    /*
    * Một class sinh ra thì mặc định nó có 1 constructor rỗng
    *
    *
    *
    *
    *
    * */
    public static void main(String[] args) {
        List<Book> newBook= new ArrayList<>();
        //Map<String, String,String,String> book = new HashMap<>();
        boolean isContinuing = true;

        Book book1= new Book("978-1138793248","Selenium testing","John","1990");
        Book book2= new Book("978-1138792322","Cook book","Chaen","2000");
        Book book3= new Book("978-1133454444","Flower book","Nobita","2001");
        Book book4= new Book("978-1138454448","Math","Bin","2003");

        newBook.add(book1);
        newBook.add(book2);
        newBook.add(book3);
        newBook.add(book4) ;
        while (isContinuing) {
            //Display menu
            System.out.println("========Menu========");
            System.out.println("1.Input information to a book");
            System.out.println("2.Find student by ISBN");


            //input option
            Scanner scanner = new Scanner(System.in);
            System.out.println("Option number, please: ");
            int userInput = scanner.nextInt();

            //Select option
            switch (userInput) {
                case 1:
                    System.out.println("Enter information of each book: ");
                    newBook.add(book1);
                    newBook.add(book2);
                    newBook.add(book3);
                    newBook.add(book4);
                    break;
                case 2:
                    System.out.println("Find book by ISBN:");
                    for (Book index : newBook) {
                        System.out.println(index);
                    }
                    break;

                default:
                    System.out.println("Good bye!");

            }

        }
    }

}
