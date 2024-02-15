package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class compared {
    void comparision() {
        ArrayList<String> lists = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value in First List");
        for (int i = 0; i < 5; i++) {
            lists.add(sc.nextLine());
        }
        ArrayList<String> lists2 = new ArrayList<>();
        System.out.println("Enter the VAlue in the Second Lists");

        for (int i = 0; i < 5; i++) {
            lists2.add(sc.nextLine());
        }
        ArrayList<String>c3=new ArrayList<>(); 
        for (String value : lists) {
            c3.add(lists2.contains(value)?"Yes":"No");

            System.out.println(c3);
        }
    }
}

public class Comparision {
    public static void main(String[] args) {
        compared ob=new compared();
        ob.comparision();
    }
}
