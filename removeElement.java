package ArrayList_Program;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class ElementRemove {
    void function(int size) {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList();
        System.out.println("Enter the VAlue in the List");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        list.remove(3);
        System.out.println(list);
    }
}

public class removeElement {
    public static void main(String[] args) {
        ElementRemove ob = new ElementRemove();
        ob.function(5);
    }
}
