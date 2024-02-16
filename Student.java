package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class informational_Data {
    void information() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<Integer> Age = new ArrayList<>();
        ArrayList<String> Course = new ArrayList<>();
        System.out.println("How Many Student's Data Want to Insert in the Records ?");
        int Records = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Data Properly:");
        for (int i = 0; i < Records; i++) {
            System.out.println("Name of " + (i + 1) + " - Student:");
            Name.add(sc.nextLine());
            System.out.println("Age of " + (i + 1) + " - Student:");
            Age.add(sc.nextInt());
            sc.nextLine();
            System.out.println("Course of " + (i + 1) + " - Student:");
            Course.add(sc.nextLine());
        }
        for (int i = 0; i < Records; i++) {
            System.out.println("Data of "+(i+1)+" Student:");
            System.out.print("Name:   " + Name.get(i));
            System.out.println();
            System.out.print("Age:   " + Age.get(i));
            System.out.println();
            System.out.print("Course:   " + Course.get(i));
            System.out.println();

        }

    }
}

public class Student {
    public static void main(String[] args) {
        informational_Data ob=new informational_Data();
        ob.information();
    }
}
