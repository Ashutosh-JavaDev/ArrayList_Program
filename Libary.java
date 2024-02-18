package ArrayList_Program;
 import java.util.Scanner;
import java.util.ArrayList;

class BookInformation {
    ArrayList<String> bookTitle = new ArrayList<>();
    ArrayList<String> Author = new ArrayList<>();

    void information() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How Many new Books Want to Add in the Library ? ");
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

        System.out.println("Enter The Title of the Book, want to see the Presence in the Library");
        String book = sc.nextLine().toLowerCase(); // Convert input to lowercase
        // Iterate over the book titles and check for a case-insensitive match
        boolean found = false;
        for (String storedTitle : bookTitle) {
            if (storedTitle.equalsIgnoreCase(book)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Book Present in the Library");
        } else {
            System.out.println("Book Not Present in the Library");
        }
    }
    
}

class removing extends searching {
    void removes() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Title of the Book, want to see the Presence in the Library");
        String book = sc.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        int index = -1;
        for (int i = 0; i < bookTitle.size(); i++) {
            if (bookTitle.get(i).equalsIgnoreCase(book)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            bookTitle.remove(index);
            Author.remove(index);
            System.out.println("Book Removed from the Library");
        } else {
            System.out.println("Book Not Present in the Library");
        }
    }
}

class finallys extends removing {
    void disp() {
        Scanner sc = new Scanner(System.in);
        information();
        System.out.println("Press 1: To Search Book in the Library\nPress 2: To Remove book from the Library\nPress 3: To Add New Books in the Library");
        int press = sc.nextInt();
        switch (press) {
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
