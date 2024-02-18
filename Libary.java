package ArrayList_Program;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class BookInformation{
    void information(){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>bookTitle=new ArrayList<>();
        ArrayList<String>Author=new ArrayList<>();
        System.out.println("How Many new Books Want to Add in the Libary ? ");
        int bookCount=sc.nextInt();
        System.out.println("Enter the Title and Author Name of the Book.");
        for(int i=0;i<bookCount;i++){
            System.out.println("Book Title:");
            bookTitle.add(sc.nextLine());
            System.out.println("Author Name:");
            Author.add(sc.nextLine());
        }
        System.out.println("Book Title: "+bookTitle+" , Author:   "+Author+"\n");

    }
}
public class Libary {
    public static void main(String[] args) {
        BookInformation ob=new BookInformation();
        ob.information();
    }
}
