package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;

class recipe {
    ArrayList<String> recipesName = new ArrayList<>();
    ArrayList<Integer> recipePrice = new ArrayList<>();

    void Recipes(ArrayList<String> recipesNAme, ArrayList<Integer> recipePrice) {
        this.recipePrice = recipePrice;
        this.recipesName = recipesNAme;
    }

    ArrayList<String> returnName() {
        return recipesName;
    }

    ArrayList<Integer> returnPrice() {
        return recipePrice;
    }

}

public class Recipe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        recipe ob=new recipe();

    }

}
