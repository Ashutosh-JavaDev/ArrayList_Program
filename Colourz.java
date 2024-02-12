// Write a Java program to create an array list, add some colors (strings) and print out the collection.
package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;

class ColorAdd {
    void takingInput(int size) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colour = new ArrayList<>();
        System.out.println("Please Enter the Name of the color");
        for (int i = 0; i < size; i++) {
            colour.add(sc.nextLine());
        }
        System.out.println("Given colour Are:   ");
        for (int i = 0; i < size; i++) {
            System.out.println(colour.get(i));
        }
    }

}
public class Colourz{
    public static void main(String[] args) {
        ColorAdd ob=new ColorAdd();
        ob.takingInput(5);
    }
}