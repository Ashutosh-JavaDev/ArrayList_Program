package ArrayList_Program;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Shoping {
    ArrayList<String> item = new ArrayList<>();
    ArrayList<Integer> Quantity = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    void addItems() {
        System.out.println("Press Stop for stop Adding item in the Cart");
        String str="";
        System.out.println("Add Items in the List:  ");
      while(true){
        System.out.println("Items Name: ");
        String itemsName=sc.nextLine();
        if(itemsName.equalsIgnoreCase("Stop")){
            break;
        }
        System.out.println("Items Quantity: ");
        int Quant=sc.nextInt();
        sc.nextLine();
        item.add(itemsName);
        Quantity.add(Quant);
      }
        System.out.println("Items Add in the Shop:  ");
        for (int i = 0; i < Quantity.size(); i++) {
            System.out.println("Item Name:  "+item.get(i)+" Qunatity:   "+Quantity.get(i));
        }
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Shoping ob=new Shoping();
        ob.addItems();
    }
}
