package ArrayList_Program;

import java.util.ArrayList;
import java.util.Scanner;

class Recipe {
    ArrayList<String> Iname = new ArrayList<>();
    ArrayList<Integer> iPrice = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addingValue(ArrayList<String> Sname, ArrayList<Integer> Sprice) {
        this.Iname = Sname;
        this.iPrice = Sprice;
        System.out.println("Press Enter to Stop Adding Value in The List");
        System.out.println("Add Ingredient Name");
        System.out.print("Ingredient: ");
        String name = sc.nextLine();
        if (name.equals("")) {
            return;
        } else {
            Sname.add(name);
            System.out.print("Price: ");
            int price = sc.nextInt();
            Sprice.add(price);
        }
    }
}

public class Ingredient {

}
