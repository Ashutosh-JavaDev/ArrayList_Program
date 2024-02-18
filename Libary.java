package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class BookInformation {
    ArrayList<String> bookTitle = new ArrayList<>();
    ArrayList<String> Author = new ArrayList<>();

    void information() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many new Books Want to Add in the Libary ? ");
        int bookCount = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Title and Author Name of the Book.");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Book Title:");
            bookTitle.add(sc.nextLine());
            System.out.println("Author Name:");
            Author.add(sc.nextLine());
        }
        System.out.println("Book Title:------- Author:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(bookTitle.get(i) + " ---- " + Author.get(i));
        }

    }
}

class searching extends BookInformation {

    void search() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Title of the Book, wnat ot see the Presence in the Library");
        String book = sc.nextLine();

        if (bookTitle.contains(String.valueOf(book.equalsIgnoreCase(book)))) {
            System.out.println("Book Present in the Libary");
        } else {
            System.out.println("Book Not Present in the Libary");
        }
        System.out.println("Book Title: "+bookTitle+" Author:   "+Author);

    }
}

class removing extends searching {
    void removes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Title of the Book, wnat ot see the Presence in the Library");
        String book = sc.nextLine();
        if (bookTitle.contains(String.valueOf(book.equalsIgnoreCase(book)))) {
            int index = bookTitle.indexOf(book);
            bookTitle.remove(index);
            Author.remove(index);
        } else {
            System.out.println("Book Not Present in the Libary");
        }
        System.out.println("Book Title: "+bookTitle+" Author:   "+Author);
    }
}
class finallys extends removing{
    void disp(){
        Scanner sc=new Scanner(System.in);
        information();
        System.out.println("Press 1: To Search Book in the Libary\nPress 2: To Remove book from the Libary\nPress 3: To Add New Books in the Libary");
        int press=sc.nextInt();
        switch(press){
            case 1:
            search();
            break;
            case 2:
            removes();
            break;
            case 3:
            information();
            break;
            default:
            System.out.println("Invalid Press");
            break;
        }
    }
}
public class Libary {
    public static void main(String[] args) {
        finallys ob = new finallys();
        ob.disp();
    }
}
