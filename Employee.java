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
                    String UpdateName = sc.nextLine();
                    int indexUpdate = -1;
                    for (int i = 0; i < EmpName.size(); i++) {
                        if (UpdateName.equals(EmpName.get(i))) {
                            indexUpdate = i;
                            break;
                        }
                    }
                    if (indexUpdate != -1) {
                        System.out.println("By What Name you want to Update?");
                        String NameUpdate = sc.nextLine();
                        EmpName.set(indexUpdate, NameUpdate);
                        System.out.println("Updated Name:");
                        EmpName.get(indexUpdate);
                        EmpID.get(indexUpdate);
                        EmpDegination.get(indexUpdate);
                    }
                    break;
                case "ID":
                    System.out.println("Whose ID You want to  Update?");
                    String updateName = sc.nextLine();
                    int indeUpdate = -1;
                    for (int i = 0; i < EmpName.size(); i++) {
                        if (updateName.equals(EmpName.get(i))) {
                            indeUpdate = i;
                            break;
                        }
                    }
                    if (indeUpdate != -1) {
                        System.out.println("What Will be the  New ID of this User?");
                        int IDupdate = sc.nextInt();
                        EmpID.set(indeUpdate, IDupdate);
                        System.out.println("Updated ID:");
                        EmpName.get(indeUpdate);
                        EmpID.get(indeUpdate);
                        EmpDegination.get(indeUpdate);
                    }
                    break;
                case "Degination":
                    System.out.println("Whose Degination You want to  Update?");
                    String updatename = sc.nextLine();
                    int indeXUpdate = -1;
                    for (int i = 0; i < EmpName.size(); i++) {
                        if (updatename.equals(EmpName.get(i))) {
                            indeXUpdate = i;
                            break;
                        }
                    }
                    if (indeXUpdate != -1) {
                        System.out.println("What Will be the  New Degination of this User?");
                        String DeginationUpdate = sc.nextLine();
                        EmpDegination.set(indeXUpdate, DeginationUpdate);
                        System.out.println("Updated Degination:");
                        EmpName.get(indeXUpdate);
                        EmpID.get(indeXUpdate);
                        EmpDegination.get(indeXUpdate);
                    }
                    break;
                default:
                    System.out.println("Choose Wisely or Check Your Alphabet Case of your Press.");
                    break;
            }
            Disp();
        }
    }
    void Choose(){
        addEmployee();
        System.out.println("Press 1: To Remove Employee Details\nPress 2: To Update Employee Details");
        int press=sc.nextInt();
        switch(press){
            case 1:
            RemoveEmp();
            break;
            case 2:
            UpdateDetails();    
            break;
            default:
            System.out.println("Invalid Press");
            break;
        }
    }
}

public class Employee {
    public static void main(String[] args) {
        employee ob = new employee();
        ob.Choose();
    }
}
