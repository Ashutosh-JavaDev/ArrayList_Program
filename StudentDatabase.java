package ArrayList_Program;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class student {
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<Integer> Age = new ArrayList<>();
    ArrayList<ArrayList<Integer>> Marks = new ArrayList<>();

    public void addData() {

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
                System.out.println("Age: ");
                try {
                    int clasS = sc.nextInt();
                    Age.add(clasS);
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    e.printStackTrace();
                }
            }
            ArrayList<Integer> mark = new ArrayList<>();
            System.out.println("Enter Marks of 5 Subjects");
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.print("Enter marks for subject " + (i + 1) + ": ");
                    int marks = sc.nextInt();
                    mark.add(marks);
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input, print marks in the Subject");
                    sc.nextLine();
                    i--;
                }
            }
            Marks.add(mark);
            sc.nextLine();
        }
       display();
    }
    void update(){
        
    }
    void display() {
        System.out.println(
                "Name\tAge\tMath\tEng\tIT\tOS\tDS\n--------------------------------------------------------------");
        for (int i = 0; i < Name.size(); i++) {
            System.out.println("\t\tStudent" + (i + 1) + "");

            System.out.println("Name: " + Name.get(i) + "\nAge: " + Age.get(i) + "\nMarks: "
                    + Marks.get(i) + "\n----------------------------");
        }

        System.out.println();
    }
    
}




public class StudentDatabase {
    public static void main(String[] args) {
        student ob = new student();
        ob.addData();
    }

}
