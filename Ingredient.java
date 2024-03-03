package ArrayList_Program;

import java.util.ArrayList;
import java.util.Scanner;

class Recipeses {
    ArrayList<String> Iname = new ArrayList<>();
    ArrayList<Integer> iPrice = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void addingValue(boolean firstTIme) {
        if (firstTIme) {
            System.out.println("Press Enter to Stop Adding Value in The List");
            System.out.println("Add Ingredient Name");
        }

        System.out.print("Ingredient: ");
        String name = sc.nextLine();
        if (name.equals("")) {
            return;
        } else {
            Iname.add(name);
            System.out.print("Price: ");
            int price = sc.nextInt();
            sc.nextLine(); // consume newline character
            iPrice.add(price);
            addingValue(false); // recursive call
        }
    }

    ArrayList<String> setName() {
        return Iname;
    }

    ArrayList<Integer> setPrice() {
        return iPrice;
    }
}

public class Ingredient {
    public static void main(String[] args) {
        Recipeses ob = new Recipeses();
        ob.addingValue(true);
        System.out.println(ob.setName());
        System.out.println(ob.setPrice());
    }
}
