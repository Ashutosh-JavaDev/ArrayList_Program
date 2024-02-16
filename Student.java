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
                int remRecords = sc.nextInt();
                try {
                    if (remRecords < Records && remRecords >= 0) {
                        for (int i = 0; i < remRecords; i++) {
                            System.out.println("Enter the Name of the Student, whose Records wants to Delete.");
                            String name = sc.nextLine();
                            sc.nextLine();
                            if (Name.contains(String.valueOf(name))) {
                                Name.remove(name);
                            }
                            System.out.println("Enter the Age of the Student, whose Records wants to Delete.");
                            int age = sc.nextInt();
                            sc.nextLine();
                            if (Age.contains(String.valueOf(age))) {
                                Age.remove(age);
                            }
                            System.out
                                    .println("Enter the Course of the Student, whose Records wants to Delete.");
                            String course = sc.nextLine();
                            if (Course.contains(String.valueOf(course))) {
                                Course.remove(course);
                            } else {
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
                    } else {
                        throw new ArrayIndexOutOfBoundsException("Invalid Position");
                    }
                } catch (ArrayIndexOutOfBoundsException e1) {
                    System.out.println(e1);
                }
                break;
            case 3:
                System.out.println(
                        "Press 4:To Remove old Data then Add New Data");
                int Press = sc.nextInt();
                switch (Press) {
                    case 4:
                        System.out.println("How Many Data Want to remove From the Records ?");
                        int RemRecords = sc.nextInt();
                        try {
                            if (RemRecords < Records && RemRecords >= 0) {
                                for (int i = 0; i < RemRecords; i++) {
                                    System.out.println("Enter the Name of the Student, whose Records wants to Delete.");
                                    String name = sc.nextLine();
                                    if (Name.contains(String.valueOf(name))) {
                                        Name.remove(name);
                                    }
                                    System.out.println("Enter the Age of the Student, whose Records wants to Delete.");
                                    int age = sc.nextInt();
                                    if (Age.contains(String.valueOf(age))) {
                                        Age.remove(age);
                                    }
                                    System.out
                                            .println("Enter the Course of the Student, whose Records wants to Delete.");
                                    String course = sc.nextLine();
                                    if (Course.contains(String.valueOf(course))) {
                                        Course.remove(course);
                                    } else {
                                        System.out.println("Enter the Data Properly");
                                    }
                                }

                            } else {
                                throw new ArrayIndexOutOfBoundsException("Invalid Position");
                            }
                        } catch (ArrayIndexOutOfBoundsException e1) {
                            System.out.println(e1);
                        }

                        System.out.println("How Many New Student's Information, You Want to add in the Records ?");
                        int NewInformation = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Enter the Data In the Records");
                        for (int i = 0; i < NewInformation; i++) {
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
                    default:
                        System.out.println("Press Valid Key");

                }
                break;
            default:
                System.out.println("Invalid Press");
        }

    }
}

public class Student {
    public static void main(String[] args) {
        informational_Data ob = new informational_Data();
        ob.information();
    }
}
