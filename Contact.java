package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class information {
    void addInfo() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<Integer> Number = new ArrayList<>();
        System.out.println("How many Data Want to insert in the Records");
        int Data = sc.nextInt();
        System.out.println("Add Contacts Details");
        for (int i = 0; i < Data; i++) {
            System.out.print("Name::    ");
            Name.add(sc.nextLine());
            System.out.print("Number:+91-   ");
            Number.add(sc.nextInt());
        }
        System.out.println("Contacts Details:   ");
        for (int i = 0; i < Data; i++) {
            System.out.print("Name: " + Name.get(i));
            System.out.println("Number: " + Number.get(i));
        }
    }
}

class search extends information {

}

public class Contact {

}
