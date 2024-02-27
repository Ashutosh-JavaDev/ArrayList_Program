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
        System.out.println("Enter the Employee Name whose Details you want to Update:");
        String employeeName = sc.nextLine();
        int indexToUpdate = -1;
        for (int i = 0; i < EmpName.size(); i++) {
            if (employeeName.equalsIgnoreCase(EmpName.get(i))) {
                indexToUpdate = i;
                break;
            }
        }
        if (indexToUpdate != -1) {
            System.out.println("Press:\n1. Name to Update Name\n2. ID to Update ID\n3. Designation to Update Designation");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline character
            switch (choice) {
                case 1:
                    System.out.println("Enter the new Name:");
                    String newName = sc.nextLine();
                    EmpName.set(indexToUpdate, newName);
                    System.out.println("Updated Name:");
                    EmpName.get(indexToUpdate);
                    EmpID.get(indexToUpdate);
                    EmpDesignation.get(indexToUpdate);
                    break;
                case 2:
                    System.out.println("Enter the new ID:");
                    int newId = sc.nextInt();
                    EmpID.set(indexToUpdate, newId);
                    System.out.println("Updated ID:");
                    EmpName.get(indexToUpdate);
                    EmpID.get(indexToUpdate);
                    EmpDesignation.get(indexToUpdate);
                    break;
                case 3:
                    System.out.println("Enter the new Designation:");
                    String newDesignation = sc.nextLine();
                    EmpDesignation.set(indexToUpdate, newDesignation);
                    System.out.println("Updated Name:");
                    EmpName.get(indexToUpdate);
                    EmpID.get(indexToUpdate);
                    EmpDesignation.get(indexToUpdate);
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Employee details updated successfully.");
        } else {
            System.out.println("Employee Not Found");
        }
    }

    // Method to choose the operation
    void chooseOperation() {
        addEmployee();
        System.out.println("Press:\n1. To Remove Employee Details\n2. To Update Employee Details");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline character
        switch (choice) {
            case 1:
                removeEmployee();
                break;
            case 2:
                updateEmployeeDetails();
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
