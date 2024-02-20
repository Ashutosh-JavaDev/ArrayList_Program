package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;

class Information {
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<Integer> Number = new ArrayList<>();

    void addInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Data Want to insert in the Records");
        int Data = sc.nextInt();
        sc.nextLine();
        System.out.println("Add Contacts Details");
        for (int i = 0; i < Data; i++) {
            System.out.print("Name: ");
            Name.add(sc.nextLine());
            System.out.print("Number: +91-");
            Number.add(sc.nextInt());
            sc.nextLine();
        }
        System.out.println("Contacts Details:   ");
        for (int i = 0; i < Data; i++) {
            System.out.println("Name: " + Name.get(i) + " Number: " + Number.get(i));
        }

    }
}

class Search extends Information {
    void searching() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1: To Search By Name\nPress 2: To Search By Number");
        int press = sc.nextInt();
        sc.nextLine(); 
        switch (press) {
            case 1:
                System.out.println("Enter Contact Name Wants to be Search");
                String name = sc.nextLine().toLowerCase();
                boolean found = false;
                for (String storedName : Name) {
                    if (storedName.equalsIgnoreCase(name)) {
                        found = true;
                        break; // Move break statement here to exit loop after finding the name
                    }
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
                        founds = true;
                        break; // Move break statement here to exit loop after finding the number
                    }
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
    }
}

class Removed extends Search {
    void removes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of the User want to Remove from the Contact: +91-");
        int num = sc.nextInt();
        sc.nextLine(); // Consume newline character left by nextInt()
        if (Number.contains(num)) {
            int index = Number.indexOf(num);
            Name.remove(index);
            Number.remove(index);
        }
        System.out.println("Remaining Contacts Details:   ");
        for (int i = 0; i < Name.size(); i++) {
            System.out.print("Name: " + Name.get(i));
            System.out.println(" Number: " + Number.get(i));
        }
    }
}

class AllData extends Removed {
    void datas() {
        Scanner sc = new Scanner(System.in);
        addInfo();
        System.out.println("Press 1: To Search\nPress 2: To Remove\nPress 3: To Add New Data");
        // sc.nextLine(); // No need for this, as we're already consuming newlines
        // properly
        int press = sc.nextInt();
        sc.nextLine(); // Consume newline character left by nextInt()

        switch (press) {
            case 1:
                searching();
                break;
            case 2:
                removes();
                break;
            case 3:
                addInfo();
                break;
            default:
                System.out.println("Invalid Press");
                break;
        }
        // Close the scanner object - Note: It's better to close scanner where you open
        // it.
        // sc.close();
    }
}

public class Contact {
    public static void main(String[] args) {
        AllData ob = new AllData();
        ob.datas();
    }
}
