package lesson_07;

public class Book {

    /*
    * Create a simple menu
1. Input book
2. Find book by ISBN
0. Exit!
   Book object
        String ISBN
        String title
        String authorName
        String/int year
Please override toString method to print out the found book.
If there is no matched book, please print out book not found
* */
    String ISBN;
    String title;
    String authorName;
    String  year;

    public Book(String ISBN, String title, String authorName, String year) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return printCont();
    }
    //Support method
    private String printCont(){
        return "House{" +
                "color='" + this.ISBN + '\'' +
                ", title=" + this.title +
                ", authorName=" + this.authorName+
                ", year=" + this.year +
                '}';
    }
}
