package ArrayList_Program;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Shoping {
    ArrayList<String> item = new ArrayList<>();
    ArrayList<Integer> Quantity = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int Quant;

    void addItems() {
        System.out.println("How Many Number of Items You Want to Store in your Shop");
        Quant = sc.nextInt();
        System.out.println("Add Items in the List:  ");
        for(int i=0;i<Quant;i++){
            item.add(sc.nextLine());
        }
    }
}

public class ShoppingCart {

}
