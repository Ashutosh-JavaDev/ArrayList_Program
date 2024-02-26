package ArrayList_Program;

import java.util.ArrayList;
import java.util.Scanner;

class employee {
    ArrayList<String> EmpName = new ArrayList<>();
    ArrayList<Integer> EmpID = new ArrayList<>();
    ArrayList<String> EmpDegination = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

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
                int empId = sc.nextInt();
                EmpID.add(empId);
                sc.nextLine();
                System.out.print("Employee Degination:  ");
                String empDeg = sc.nextLine();
                EmpDegination.add(empDeg);
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Employee Details:");
        for (int i = 0; i < EmpName.size(); i++) {
            System.out.println("Employee "+(i+1)+":");
            System.out.print("Name: " + EmpName.get(i) + " \nEmployee ID: " + EmpID.get(i) + "\nEmployee Deg: "
                    + EmpDegination.get(i) + "\n");
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        employee ob = new employee();
        ob.addEmployee();
    }
}
