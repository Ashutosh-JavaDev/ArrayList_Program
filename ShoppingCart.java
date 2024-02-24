package ArrayList_Program;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Shoping {
    ArrayList<String> item = new ArrayList<>();
    ArrayList<Integer> Quantity = new ArrayList<>();
    ArrayList<Integer>cost=new ArrayList<>();
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
        System.out.println(itemsName+" Quantity: ");
        int Quant=sc.nextInt();
        sc.nextLine();
        int costing;
        System.out.println("Cost of 1 Quantity: ");
        costing=sc.nextInt();
        item.add(itemsName);
        Quantity.add(Quant);
        cost.add(costing*Quant);
      }
       
    }
    void removes(){
        
    }
    void update(){

    }
    void disp(){
        System.out.println("Items Add in the Shop:  ");
        for (int i = 0; i < Quantity.size(); i++) {
            System.out.println("Item Name: "+item.get(i)+" : Qunatity: "+Quantity.get(i)+" Total Cost: "+cost.get(i));
        }
    }
    void switchCondition(){
        System.out.println("Press 1: To Remove Items From the List\nPress 2: To Update Quantities Press 3:To Display Records");
        int press=sc.nextInt();
        switch(press){
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
        Shoping ob=new Shoping();
        ob.addItems();
    }
}
