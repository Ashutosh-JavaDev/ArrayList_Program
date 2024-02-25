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
        System.out.println("Press 1: To Remove Items\nPress 2: To remove Some Quantity of the Items");
        int press = sc.nextInt();
        sc.nextLine();
        switch (press) {
            case 1:
                System.out.println("Which Item you want to remove?");
                String itemToRemove = sc.nextLine().toLowerCase();
                int itemRemove=-1;
                for(int i=0;i<item.size();i++){
                    if(item.get(i).equalsIgnoreCase(itemToRemove)){
                        itemRemove=i;
                        break;
                    }
                }
                if(itemRemove!=-1){
                   item.remove(itemRemove);
                   Quantity.remove(itemRemove);
                   cost.remove(itemRemove);
                   System.out.println("Items After Removal from the Shop:");
                   for (int i = 0; i < item.size(); i++) {
                       System.out.println("Item Name: " + item.get(i) + " : Quantity: " + Quantity.get(i) + " Total Cost: "+ cost.get(i));
                   }
                }
                else{
                    System.out.println("Items not Present in the List");
                }
                break;
            case 2:
                System.out.println("Which items Quantity, you want to remove  from the List");
                String itemtoRemove = sc.nextLine();
                int indextoRemove=-1;
                for(int i=0;i<item.size();i++){
                    if(item.get(i).equalsIgnoreCase(itemtoRemove)){
                        indextoRemove=i;
                        break;
                    }
                }
               if(indextoRemove!=-1){
                System.out.println("How much Quantity you want to remove from the List of the Item ?");
                int quant=sc.nextInt();
                if(quant<=Quantity.get(indextoRemove)){
                    Quantity.set(indextoRemove, Quantity.get(indextoRemove)-quant);
                    System.out.println("Items After Removal from the Shop:");
                    for (int i = 0; i < item.size(); i++) {
                        System.out.println("Item Name:"+ item.get(i) + " : Quantity:" + Quantity.get(i) + " Total Cost:"+ cost.get(i));
                    }
                }
                else{
                    System.out.println("Removing Size is More then Original Size");
                }
               }
               else{
                System.out.println("Item is Not Present in the List");
               }
                break;
            default:
                System.out.println("Invalid Press");
        }

    }

    void update() {
        System.out.println("Which Item Quantity want to Update?");
        String itemName = sc.nextLine();
        int itemRemove=-1;
        for(int i=0;i<item.size();i++){
            if(item.get(i).equalsIgnoreCase(itemName)){
                itemRemove=i;
                break;
            }
        }
        if(itemRemove!=-1){
            if (item.contains(itemName)) {
                System.out.println("How Many Quantity want to Add?");
                int addQuant = sc.nextInt();
                Quantity.add(addQuant);
                System.out.println("Updated Quantity: " + Quantity.size());
            } else {
                System.out.println("Item Not Present in the Shop");
            }
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
