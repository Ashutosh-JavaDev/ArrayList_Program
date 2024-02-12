// Write a Java program to create an array list, add some colors (strings) and print out the collection.
import java.util.Scanner;
import java.util.ArrayList;
class ColorAdd{
    void takingInput(int size){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>colour=new ArrayList<>();
        System.out.println("How many Color wants to add in the File");
        size=sc.nextInt();
    }
}