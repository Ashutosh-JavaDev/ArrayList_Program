package ArrayList_Program;

import java.util.ArrayList;
import java.util.Scanner;

class Recipeses {
    ArrayList<String> Iname = new ArrayList<>();
    ArrayList<Integer> iPrice = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int indexOFremove = -1;
    String Rname;

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

    void Caseignorance() {

        for (int i = 0; i < Iname.size(); i++) {
            if (Rname.equalsIgnoreCase(Iname.get(i))) {
                indexOFremove = i;
                break;
            }
        }
    }

    void removeRecipe() {
        System.out.println("Which Ingrident You want to remove from the List");
        Rname = sc.nextLine();
        Caseignorance();
        if (indexOFremove != -1) {
            Iname.remove(indexOFremove);
            iPrice.remove(indexOFremove);
            System.out.println(Iname);
            System.out.println(iPrice);
        } else {
            System.out.println("Ingridient Not Found in the List");
        }

    }

    void updateIngrident() {
        System.out.println("Which Ingrident You want to Update");
        Rname = sc.nextLine();
        Caseignorance();
        if (indexOFremove != -1) {
            System.out.println("Update the Name and Price of the Ingrident");
            System.out.print("New Name: ");
            String newName = sc.nextLine();
            System.out.print("New Price: ");
            int newPrice = sc.nextInt();
            sc.nextLine();
            Iname.set(indexOFremove, newName);
            iPrice.set(indexOFremove, newPrice);
            System.out.println(Iname);
            System.out.println(iPrice);
        } else {
            System.out.println("Item Not Present in the List.");
        }
    }

}

class caseSwitch extends Recipeses {
    void caseState() {
        addingValue(false);
        System.out.println("Press 1: To Remove Item From the List\nPress 2: To Update the Ingrident From the List");
        int press = sc.nextInt();
        sc.nextLine();
        switch (press) {
            case 1:
                removeRecipe();
                break;
            case 2:
                updateIngrident();
                break;
            default:
                System.out.println("Invalid Press");
                break;
        }
    }
}

public class Ingredient {
    public static void main(String[] args) {
        caseSwitch ob = new caseSwitch();
        ob.caseState();
        System.out.println(ob.setName());
        System.out.println(ob.setPrice());
    }
}
