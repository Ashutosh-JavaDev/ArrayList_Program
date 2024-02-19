package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class information {
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<Integer> Number = new ArrayList<>();

    void addInfo() {
        Scanner sc = new Scanner(System.in);

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
    void searching() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1: To Search By Name\nPress 2: To Search By Number");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                System.out.println("Enter Contact Name Wants to be Search");
                String name = sc.nextLine().toLowerCase();
                boolean found = false;
                for (String storedName : Name) {
                    if (storedName.equalsIgnoreCase(name)) {
                        found = true;
                    }
                    break;
                }
                if (found) {
                    System.out.println("Name Found in the Contact");
                } else {
                    System.out.println("No User found in the Data related to this Name");
                }
                break;
            case 2:
                System.out.println("Enter Contact Number Wants to be Search");
                int num = sc.nextInt();
                boolean founds = false;
                for (int storedNumber : Number) {
                    if (storedNumber == num) {
                        found = true;
                    }
                    break;
                }
                if (founds) {
                    System.out.println("Number Found in the Contact");
                } else {
                    System.out.println("No User found in the Data related to this Number");
                }
                break;
            default:
                System.out.println("Invalid Press");
                break;
        }
        System.out.println("Remaining Contacts Details:   ");
        for (int i = 0; i < Name.size(); i++) {
            System.out.print("Name: " + Name.get(i));
            System.out.println("Number: " + Number.get(i));
        }
    }
}

class removed extends search {
    void removes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of the User want to Remove from the Contact: +91-");
        int num = sc.nextInt();
        if (Number.contains(num)) {
            int index = Number.indexOf(num);
            Name.remove(index);
            Number.remove(index);
        }
    }
}

public class Contact {

}
