package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class inventory {
    void invent() {
        ArrayList<String> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Items You want to add in the Inventory?");
        int itemsNumber=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Items in the Inventory");
        for (int i = 0; i < itemsNumber; i++) {
            list1.add(sc.nextLine());
        }
        System.out.println(
                "Press 1: To Remove Items from the Inventory\nPress 2: To Add New Items in the Inventory\nPress 3: To complete Both Task");
        int Press = sc.nextInt();
        switch (Press) {
            case 1:
                System.out.println("How Many Data want to remove from the List");
                int value = sc.nextInt();
                try {
                    if (value < itemsNumber && value >= 0) {
                        for (int i = 0; i < value; i++) {
                            System.out.println("Enter the Element wants to remove from the List");
                            String items = sc.nextLine();
                            if (list1.contains(items)) {
                                list1.remove(String.valueOf(items));
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
                ArrayList<String> list2 = new ArrayList<>();
                System.out.println("How Many New Items Want to Add in this Inventory");
                int updateInv = sc.nextInt();
                System.out.println("Enter the Items Want to add in the Inventory");
                for (int i = 0; i < updateInv; i++) {
                    list2.add(sc.nextLine());
                }
                ArrayList<String> list3 = new ArrayList<>();
                list3.addAll(list1);
                list3.addAll(list2);
                System.out.println("Updated List:   " + list3);
                break;

            case 3:
                System.out.println("Press 4: To Remove First then Add\nPress 5: To Add First then Remove");
                int press = sc.nextInt();
                switch (press) {
                    case 4:
                        System.out.println("How Many Items Want to remove from the List");
                        int elementtoRemove = sc.nextInt();
                        try {
                            if (elementtoRemove < list1.size() && elementtoRemove >= 0) {
                                for (int i = 0; i < elementtoRemove; i++) {
                                    System.out.println("Enter the " + i + " element want to remove from the List");
                                    String removeElement = sc.nextLine();
                                    if (list1.contains(removeElement)) {
                                        list1.remove(String.valueOf(removeElement));
                                    } else {
                                        System.out.println(removeElement + " Not Present in the List");
                                    }
                                }
                                System.out.println("List After Remove Items:   " + list1);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Invalid Position");
                            }
                        } catch (ArrayIndexOutOfBoundsException e1) {
                            System.out.println(e1);
                        }
                        // Update List
                        System.out.println("How Many new Element wants to add in the List");
                        int NewElement = sc.nextInt();
                        ArrayList<String> list6 = new ArrayList<>();
                        System.out.println("Enter the Element want to add in the List");
                        for (int i = 0; i < NewElement; i++) {
                            list6.add(sc.nextLine());
                        }
                        ArrayList<String> list5 = new ArrayList<>();
                        list5.addAll(list1);
                        list5.addAll(list6);
                        System.out.println("Updated List:   " + list5);
                        // Break
                        break;
                    case 5:
                        System.out.println("How Many new Element wants to add in the List");
                        int newElement = sc.nextInt();
                        ArrayList<String> list4 = new ArrayList<>();
                        for (int i = 0; i < newElement; i++) {
                            list4.add(sc.nextLine());
                        }
                        ArrayList<String> list7 = new ArrayList<>();
                        list7.addAll(list1);
                        list7.addAll(list4);
                        System.out.println("Updated List:   " + list7);
                        System.out.println("How Many Items Want to remove from the List");
                        int elementRemove = sc.nextInt();
                        try {
                            if (elementRemove < list7.size() && elementRemove >= 0) {
                                for (int i = 0; i < elementRemove; i++) {
                                    System.out.print("Remove "+i+" Element: ");
                                    String removeElement = sc.nextLine();
                                    if (list7.contains(removeElement)) {
                                        list7.remove(String.valueOf(removeElement));
                                    } else {
                                        System.out.println(removeElement + " Not Present in the List");
                                    }
                                }
                                System.out.println("List After Remove Items:   " + list7);
                            } else {
                                throw new ArrayIndexOutOfBoundsException("Invalid Position");
                            }
                        } catch (ArrayIndexOutOfBoundsException e1) {
                            System.out.println(e1);
                        }

                        break;

                    default:
                        System.out.println("Press Valid Key");
                        break;
                }
                break;
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
