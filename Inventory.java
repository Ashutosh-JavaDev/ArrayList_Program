package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class inventory {
    void invent() {
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Items in the Inventory");
        for (int i = 0; i < 5; i++) {
            list1.add(sc.nextInt());
        }

    }
}

public class Inventory {

}
