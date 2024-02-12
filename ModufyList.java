package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;

class ModifyList {
    void Modification(int size) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enterr the Number in the list");
        for (int i = 0; i < 5; i++) {
            num.add(sc.nextInt());
        }
        System.out.println("Given Numbers Are:  ");
        for (int i = 0; i < 5; i++) {
            num.get(i);
        }
        System.out.println(num);
        System.out.println("Enter the Position want to add the New Number");
        int position = sc.nextInt();
        System.out.println("Insert New Number wants to add in the List");
        int newNum = sc.nextInt();
        try {
            if (position < 5) {
                num.add(position, newNum);
            }
            System.out.println(num);
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
        }

    }
}

public class ModufyList {
    public static void main(String[] args) {
        ModifyList ob=new ModifyList();
        ob.Modification(5);
    }
}
