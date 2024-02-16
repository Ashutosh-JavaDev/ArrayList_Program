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
        System.out.println(
                "Press 1: To Remove Items from the Inventory\nPress 2: To Add New Items in the Inventory\nPress 3: To complete Both Task");
        int Press = sc.nextInt();
        switch (Press) {
            case 1:
                System.out.println("How Many Data want to remove from the List");
                int value = sc.nextInt();
                try {
                    if (value < 5 && value >= 0) {
                        for (int i = 0; i < value; i++) {
                            System.out.println("Enter the Element wants to remove from the List");
                            int items = sc.nextInt();
                            if (list1.contains(items)) {
                                list1.remove(Integer.valueOf(items));
                            } else {
                                System.out.println(items + " Not Present In the List");
                            }
                        }
                        System.out.println("Update List: " + list1);
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Invalid Position");
                    }
                } catch (ArrayIndexOutOfBoundsException e1) {
                    System.out.println(e1);
                }
                break;
            case 2:
                ArrayList<Integer> list2 = new ArrayList<>();
                System.out.println("How Many New Items Want to Add in this Inventory");
                int updateInv = sc.nextInt();
                System.out.println("Enter the Items Want to add in the Inventory");
                for (int i = 0; i < updateInv; i++) {
                    list2.add(sc.nextInt());
                }
                ArrayList<Integer> list3 = new ArrayList<>();
                list3.addAll(list1);
                list3.addAll(list2);
                System.out.println("Updated List:   " + list3);
                break;

                case 3:
                System.out.println("Press 1: To Remove First then Add\nPress 2: To Add First then Remove");
                int press=sc.nextInt();
                switch (press) {
                    case 1:
                        
                        break;
                
                    default:
                        break;
                }
            default:
                System.out.println("Invalid Press");
                break;
        }
    }
}

public class Inventory {
    public static void main(String[] args) {
        inventory ob = new inventory();
        ob.invent();
    }
}
