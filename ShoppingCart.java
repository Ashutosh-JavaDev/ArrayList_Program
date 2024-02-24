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
    }
}

public class ShoppingCart {

}
