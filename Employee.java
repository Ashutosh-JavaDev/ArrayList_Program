package ArrayList_Program;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
                try {
                    int empId = sc.nextInt();
                    EmpID.add(empId);
                    sc.nextLine();
                } catch (InputMismatchException e) {
                    System.out.println(e);
                }
                System.out.print("Employee Degination:  ");
                String empDeg = sc.nextLine();
                EmpDegination.add(empDeg);
            }
            Disp();
        }

    }

    void Disp() {
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Employee Details:");
        for (int i = 0; i < EmpName.size(); i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Name: " + EmpName.get(i) + " \nEmployee ID: " + EmpID.get(i) + "\nEmployee Deg: "
                    + EmpDegination.get(i) + "\n");
            System.out.println("--------------------------------");

        }
    }

    void RemoveEmp() {
        addEmployee();
        System.out.println("Enter the Emoplyee Name, whose Details want to remove ?");
        String employeeName = sc.nextLine();
        int indextoRemove = -1;
        // sc.nextLine();
        for (int i = 0; i < EmpName.size(); i++) {
            if (employeeName.equalsIgnoreCase(EmpName.get(i))) {
                indextoRemove = i;
                break;
            }
        }
        if (indextoRemove != -1) {
            EmpName.remove(indextoRemove);
            EmpID.remove(indextoRemove);
            EmpDegination.remove(indextoRemove);
        } else {
            System.out.println("Employee Not Found");
        }
        Disp();
    }

    void UpdateDetails() {
        System.out.println("Which Employee Details You want to Update?");
        String NameofEmp = sc.nextLine();
        int indexFind = -1;
        for (int i = 0; i < EmpName.size(); i++) {
            NameofEmp.equalsIgnoreCase(EmpName.get(i));
            indexFind = i;
            break;
        }
        if (indexFind != -1) {
            System.out.println("Press:\nName to Update Name\nID to update ID\nDegination to update Degination.");
            String write = sc.nextLine();
            switch (write) {
                case "Name":
                   System.out.println("Whose Name You want to  Update?");
                   String UpdateName=sc.nextLine();
                   int indexUpdate=-1;
                   for(int i=0;i<EmpName.size();i++){
                    if(UpdateName.equals(EmpName.get(i))){
                        indexUpdate=i;
                        break;
                    }
                   }
            }
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        employee ob = new employee();
        ob.RemoveEmp();
    }
}
