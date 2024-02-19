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
    void searching(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Press 1: To Search By Name\nPress 2: To Search By Number");
        int press=sc.nextInt();
        switch(press){
            
        }
    }
}

public class Contact {

}
