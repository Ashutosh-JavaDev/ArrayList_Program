package ArrayList_Program;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Shoping {
    ArrayList<String> item = new ArrayList<>();
    ArrayList<Integer> Quantity = new ArrayList<>();
    ArrayList<Integer> cost = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int Quant;
    int costing;

    void addItems() {
        System.out.println("Press Stop for stop Adding item in the Cart");
        String str = "";
        System.out.println("Add Items in the List:  ");
        while (true) {
            System.out.println("Items Name: ");
            String itemsName = sc.nextLine();
            if (itemsName.equalsIgnoreCase("Stop")|| itemsName.equalsIgnoreCase("")) {
                break;
            }
            System.out.println(itemsName + " Quantity: ");
            Quant = sc.nextInt();
            sc.nextLine();
            System.out.println("Cost of 1 Quantity: ");
            costing = sc.nextInt();
            sc.nextLine();
            int total = costing * Quant;
            item.add(itemsName);
            Quantity.add(Quant);
            cost.add(total);
        }

    }

    void removes() {
        System.out.println("Press 1: To Remove Items\nPress 2: TO remove Some Quantity of the Items");
        int press = sc.nextInt();
        sc.nextLine();
        switch (press) {
            case 1:
                System.out.println("Which Item you want to remove?");
                String itemToRemove = sc.nextLine();
                if (item.contains(itemToRemove)) {
                    int indexToRemove = item.indexOf(itemToRemove); // Get the index of the item to remove
                    item.remove(indexToRemove); // Remove the item from the list
                    Quantity.remove(indexToRemove); // Remove the corresponding quantity
                    cost.remove(indexToRemove); // Remove the corresponding cost
                    System.out.println("Items After Remove in the Shop:  ");
                    for (int i = 0; i < Quantity.size(); i++) {
                        System.out.println("Item Name: " + item.get(i) + " : Qunatity: " + Quantity.get(i) + " Total Cost: "
                                        + cost.get(i));
                    }
                } else {
                    System.out.println("Item not found in the cart.");
                }
                break;
            case 2:
                System.out.println("Which items Quantity, you want to remove  from the List");
                String itemtoRemove = sc.nextLine().toLowerCase();
                if (item.contains(itemtoRemove.equalsIgnoreCase(itemtoRemove))) {
                    System.out.println("How many Quantity you want to remove of " + item + "?");
                    int quant = sc.nextInt();
                    if (quant <= Quantity.size()) {
                        Quantity.remove(quant);
                        System.out.println("Items After Removes from the Shop:  ");
                        for (int i = 0; i < Quantity.size(); i++) {
                            System.out.println("Item Name: " + item.get(i) + " : Qunatity: " + Quantity.get(i) + " Total Cost: "
                                            + cost.get(i));
                        }
                    } else {
                        System.out.println("Removing Item is more then Added Items");
                    }
                } else {
                    System.out.println(itemtoRemove + " Not Present in the List");
                }
                break;
            default:
                System.out.println("Invalid Press");
        }

    }

    void update() {
        System.out.println("Which Item Quantity want to Update?");
        String itemName = sc.nextLine().toLowerCase();
        if (item.contains(itemName)) {
            System.out.println("How Many Quantity want to Add?");
            int addQuant = sc.nextInt();
            Quantity.add(addQuant);
            System.out.println("Updated Quantity: " + Quantity.size());
        } else {
            System.out.println("Item Not Present in the Shop");
        }
    }

    void disp() {
        System.out.println("Items Add in the Shop:  ");
        for (int i = 0; i < Quantity.size(); i++) {
            System.out.println(
                    "Item Name: " + item.get(i) + " : Qunatity: " + Quantity.get(i) + " Total Cost: " + cost.get(i));
        }
    }

    void switchCondition() {
        addItems();
        System.out.println(
                "Press 1: To Remove Items From the List\nPress 2: To Update Quantities\nPress 3:To Display Records");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                removes();
                break;
            case 2:
                update();
                break;
            case 3:
                disp();
                break;
            default:
                System.out.println("Invalid Press");
                break;
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Shoping ob = new Shoping();
        ob.switchCondition();
    }
}
