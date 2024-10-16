package ArrayList_Program;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class AddData {
    public void addData() {
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<Integer> Class = new ArrayList<>();
        ArrayList<Integer> Marks = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of the Student\nor Press Enter to Exit");
        System.out.println("Add Student Detail: ");
        while (true) {
            System.out.println("Add Name: ");
            String name = sc.nextLine();
            if (name.equals("")) {
                break;
            } else {
                Name.add(name);
                System.out.print("Class: ");
                try{
                    int clasS=sc.nextInt();
                    Class.add(clasS);
                    sc.nextLine();
                }
                catch(InputMismatchException e){
                   e.printStackTrace();  
                }
            }
        }
        System.out.print(Name);
        System.out.println();
    }
}

public class StudentDatabase {
    public static void main(String[] args) {
        AddData ob = new AddData();
        ob.addData();
    }

}
