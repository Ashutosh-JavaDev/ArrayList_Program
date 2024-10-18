package ArrayList_Program;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class student {
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<Integer> Age = new ArrayList<>();
    ArrayList<Integer> Roll = new ArrayList<>();
    ArrayList<ArrayList<Integer>> Marks = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    void Choice() {
        System.out.println("Press 1:For Add Data\nPress 2:For Update Record\nPress 3:For Delete Record\nPress 4:For  Display Record");
        int Press = sc.nextInt();
        switch (Press) {
            case 1:
                addData();
                break;
            case 2:
                update();
                break;
            case 3:
                remove();
                break;
            case 4:
                display();
                break;
            default:
                System.out.println("Choose Wisely");
                break;

        }

    }

    public void addData() {

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
                System.out.println("Roll: ");
                try {
                    int roll = sc.nextInt();
                    Roll.add(roll);
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

    // Update
    void update() {
        System.out.println("Press 1: To Update Name\nPress 2:To Update Age\nPress 3: To Upadate Roll");
        int Press = sc.nextInt();
        switch (Press) {
            case 1:
                name();
                break;
            case 2:
                age();
                break;
            case 3:
                roll();
                break;
            default:
                System.out.println("Choose Case Wisely");
                break;
        }
    }

    // Name
    void name() {
        System.out.print("Enter the Roll Number Of Student: ");
        int roll = sc.nextInt();
        int count = 0;
        for (int i = 0; i < Roll.size(); i++) {
            if (Roll.get(i) == roll) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("Enter the New Name for the Student");
            String newName = sc.nextLine();
            Name.set(roll, newName);
        }
    }

    // Age
    void age() {
        System.out.print("Enter the Roll Number Of Student: ");
        int roll = sc.nextInt();
        int count = 0;
        for (int i = 0; i < Roll.size(); i++) {
            if (Roll.get(i) == roll) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("Enter the Updated Age for the Student");
            int newAge = sc.nextInt();
            Age.set(roll, newAge);
        }
    }

    // Roll
    void roll() {
        System.out.print("Enter the Roll Number Of Student: ");
        int roll = sc.nextInt();
        int count = 0;
        for (int i = 0; i < Roll.size(); i++) {
            if (Roll.get(i) == roll) {
                count++;
                break;
            }
        }
        if (count > 0) {
            System.out.println("Enter the Updated Roll for the Student");
            int newRoll = sc.nextInt();
            Roll.set(roll, newRoll);
        }
    }

    //
    void remove() {

    }

    void display() {
        System.out.println(
                "Name\tAge\tMath\tEng\tIT\tOS\tDS\n--------------------------------------------------------------");
        for (int i = 0; i < Name.size(); i++) {
            System.out.println("\t\tStudent" + (i + 1) + "");

            System.out.println("Name: " + Name.get(i) + "\nRoll: " + Roll.get(i) + "\nAge: " + Age.get(i) + "\nMarks: "
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
