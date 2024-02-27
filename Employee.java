package ArrayList_Program;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class EmployeeManager {
    ArrayList<String> EmpName = new ArrayList<>();
    ArrayList<Integer> EmpID = new ArrayList<>();
    ArrayList<String> EmpDesignation = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    // Method to add employee details
    void addEmployee() {
        System.out.println("Press Enter or Stop to stop adding Details");
        System.out.println("Add Employee Details:");
        while (true) {
            System.out.print("Employee Name: ");
            String empName = sc.nextLine();
            if (empName.equalsIgnoreCase("Stop") || empName.equalsIgnoreCase("")) {
                break;
            } else {
                EmpName.add(empName);
                System.out.print("EmpID:  ");
                try {
                    int empId = sc.nextInt();
                    EmpID.add(empId);
                    sc.nextLine(); // Consume newline character
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter an integer for Employee ID.");
                    // Clear the memory by removing the last added employee details
                    EmpName.remove(EmpName.size() - 1);
                    EmpID.remove(EmpID.size() - 1);
                    EmpDesignation.remove(EmpDesignation.size() - 1);
                    sc.nextLine(); // Clear the input buffer
                    continue;
                }
                System.out.print("Employee Designation:  ");
                String empDeg = sc.nextLine();
                EmpDesignation.add(empDeg);
            }
        }
        displayEmployees();
    }

    // Method to display employee details
    void displayEmployees() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Employee Details:");
        for (int i = 0; i < EmpName.size(); i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Name: " + EmpName.get(i) + "\nEmployee ID: " + EmpID.get(i) + "\nEmployee Designation: "
                    + EmpDesignation.get(i) + "\n--------------------------------");
        }
    }

    // Method to remove employee details
    void removeEmployee() {
        System.out.println("Enter the Employee Name whose Details you want to remove:");
        String employeeName = sc.nextLine();
        int indexToRemove = -1;
        for (int i = 0; i < EmpName.size(); i++) {
            if (employeeName.equalsIgnoreCase(EmpName.get(i))) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            EmpName.remove(indexToRemove);
            EmpID.remove(indexToRemove);
            EmpDesignation.remove(indexToRemove);
            System.out.println("Employee details removed successfully.");
            displayEmployees();
        } else {
            System.out.println("Employee Not Found");
        }
    }

    // Method to update employee details
    void updateEmployeeDetails() {
        // Prompt user to enter the name of the employee whose details they want to
        // update
        System.out.println("Enter the Employee Name whose Details you want to Update:");
        String employeeName = sc.nextLine();
        int indexToUpdate = -1;
        // Find the index of the employee whose details are to be updated
        for (int i = 0; i < EmpName.size(); i++) {
            if (employeeName.equalsIgnoreCase(EmpName.get(i))) {
                indexToUpdate = i;
                break;
            }
        }
        // Check if the employee was found
        if (indexToUpdate != -1) {
            // Prompt user to select the field to update
            System.out.println(
                    "Press:\n1. Name to Update Name\n2. ID to Update ID\n3. Designation to Update Designation");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    // Update the name of the employee
                    System.out.println("Enter the new Name:");
                    String newName = sc.nextLine();
                    EmpName.set(indexToUpdate, newName);
                    // Print the updated details
                    System.out.println("Updated Name:");
                    System.out.println("Name: " + EmpName.get(indexToUpdate) +
                            "\nEmployee ID: " + EmpID.get(indexToUpdate) +
                            "\nEmployee Designation: " + EmpDesignation.get(indexToUpdate));
                    break;
                case 2:
                    // Update the ID of the employee
                    System.out.println("Enter the new ID:");
                    int newId = sc.nextInt();
                    EmpID.set(indexToUpdate, newId);
                    // Print the updated details
                    System.out.println("Updated ID:");
                    System.out.println("Name: " + EmpName.get(indexToUpdate) +
                            "\nEmployee ID: " + EmpID.get(indexToUpdate) +
                            "\nEmployee Designation: " + EmpDesignation.get(indexToUpdate));
                    break;
                case 3:
                    // Update the designation of the employee
                    System.out.println("Enter the new Designation:");
                    String newDesignation = sc.nextLine();
                    EmpDesignation.set(indexToUpdate, newDesignation);
                    // Print the updated details
                    System.out.println("Updated Designation:");
                    System.out.println("Name: " + EmpName.get(indexToUpdate) +
                            "\nEmployee ID: " + EmpID.get(indexToUpdate) +
                            "\nEmployee Designation: " + EmpDesignation.get(indexToUpdate));
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Employee details updated successfully.");
        } else {
            System.out.println("Employee Not Found");
        }
    }

    void search() {
        System.out.println("Enter the Employee name want ot be Search.");
        String Searchname = sc.nextLine();
        int c = 0;
        sc.nextLine();
        for (int i = 0; i < EmpName.size(); i++) {
            if (Searchname.equalsIgnoreCase(EmpName.get(i))) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("Employee Found in the List");
        } else {
            System.out.println("Employee Not In the List");
        }
    }

    // Method to choose the operation
    void chooseOperation() {
        addEmployee();
        System.out.println(
                "Press:\n1. To Remove Employee Details\n2. To Update Employee Details\n3. To search User by Name");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline character
        switch (choice) {
            case 1:
                removeEmployee();
                break;
            case 2:
                updateEmployeeDetails();
                break;
            case 3:
                search();
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        manager.chooseOperation();
    }
}
