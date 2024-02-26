package ArrayList_Program;

import java.util.ArrayList;
import java.util.Scanner;

class employee {
    ArrayList<String> EmpName = new ArrayList<>();
    ArrayList<Integer> EmpID = new ArrayList<>();
    ArrayList<String> EmpDegination = new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    void addEmployee() {
        System.out.println("Press Enter or Stop to stop adding Details");
        System.out.println("Add Employee Details:");
        while(true){
            System.out.print("Employee Name: ");
            String empName=sc.nextLine();
            if(empName.equalsIgnoreCase("Stop")|| empName.equalsIgnoreCase("")){
                break;
            }
            else{
                EmpName.add(empName);
                System.out.print("EmpID:  ");
                int empId=sc.nextInt();
                EmpID.add(empId);
                System.out.print("Employee Degination:  ");
                String empDeg=sc.nextLine();
                EmpDegination.add(empDeg);
            }
        }
    }
}

public class Employee {

}
