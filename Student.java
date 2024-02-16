package ArrayList_Program;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class informational_Data {
    void information() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Name = new ArrayList<>();
        ArrayList<Integer> Age = new ArrayList<>();
        ArrayList<String> Course = new ArrayList<>();
        System.out.println("How Many Student's Data Want to Insert in the Records ?");
        int Records = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Data Properly:");
        for (int i = 0; i < Records; i++) {
            System.out.println("Name of " + (i + 1) + " - Student:");
            Name.add(sc.nextLine());
            System.out.println("Age of " + (i + 1) + " - Student:");
            Age.add(sc.nextInt());
            sc.nextLine();
            System.out.println("Course of " + (i + 1) + " - Student:");
            Course.add(sc.nextLine());
        }
        for (int i = 0; i < Records; i++) {
            System.out.println("Data of " + (i + 1) + " Student:");
            System.out.print("Name:   " + Name.get(i));
            System.out.println();
            System.out.print("Age:   " + Age.get(i));
            System.out.println();
            System.out.print("Course:   " + Course.get(i));
            System.out.println();

        }
        System.out.println(
                "Press 1: To Add More Student's Data In the Records\nPress 2:To  Remove Some Data From the Records\nPress 3:To Do Both Task");
        int press = sc.nextInt();
        switch (press) {
            case 1:
                System.out.println("How Many New Student's Information, You Want to add in the Records ?");
                int newInformation = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the Data In the Records");
                for (int i = 0; i < newInformation; i++) {
                    System.out.println("Name of " + (i + 1) + " - Student:");
                    Name.add(sc.nextLine());
                    System.out.println("Age of " + (i + 1) + " - Student:");
                    Age.add(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Course of " + (i + 1) + " - Student:");
                    Course.add(sc.nextLine());
                }
                System.out.println("Updated Records");
                for (int i = 0; i < Name.size(); i++) {
                    System.out.println("Data of " + (i + 1) + " Student:");
                    System.out.print("Name:   " + Name.get(i));
                    System.out.println();
                    System.out.print("Age:   " + Age.get(i));
                    System.out.println();
                    System.out.print("Course:   " + Course.get(i));
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("How Many Data Want to remove From the Records ?");
                int remRecords=sc.nextInt();
                try{
                    if(remRecords<Records && remRecords>=0){
                        for(int i=0;i<remRecords;i++){
                            System.out.println("Enter the Name, Age and Course of the Student, whose Records wants to Delete.");
                            String name=sc.nextLine();
                            int age=sc.nextInt();
                            String course=sc.nextLine();
                            if(Name.contains(String.valueOf(name))&&Age.contains(String.valueOf(age))&&Course.contains(String.valueOf(course))){
                                Name.remove(name);
                                Age.remove(age);
                                Course.remove(course);
                            }
                            else{
                                System.out.println("Enter the Data Properly");
                            }
                        }
                        System.out.println("Updated Records");
                        for (int i = 0; i < Name.size(); i++) {
                            System.out.println("Data of " + (i + 1) + " Student:");
                            System.out.print("Name:   " + Name.get(i));
                            System.out.println();
                            System.out.print("Age:   " + Age.get(i));
                            System.out.println();
                            System.out.print("Course:   " + Course.get(i));
                            System.out.println();
                        }
                    }
                    else{
                        throw new ArrayIndexOutOfBoundsException("Invalid Position");
                    }
                }
                catch(ArrayIndexOutOfBoundsException e1){
                    System.out.println(e1);
                }
        }

    }
}

public class Student {
    public static void main(String[] args) {
        informational_Data ob = new informational_Data();
        ob.information();
    }
}
