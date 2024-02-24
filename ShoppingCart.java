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
        boolean state=true;
        System.out.println("Add Items in the List:  ");
        while (state) {
            for (int i = 0; i < Quantity.size(); i++) {
                System.out.println("Item Name:  " + item.add(sc.nextLine()) + " Quantity:  " + Quantity.add(sc.nextInt()));
                if(str.equalsIgnoreCase("Stop")){
                    state=false;
                    break;
                }
               
            }
        }
        System.out.println("Items Add in the Shop:  ");
        for (int i = 0; i < Quantity.size(); i++) {
            System.out.println("Item Name:  "+item.get(i)+" Qunatity:   "+Quantity.get(i));
        }
    }
}

public class ShoppingCart {

}
