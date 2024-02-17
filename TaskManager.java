package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class addTask {
    void taskManager() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Task You Want add in you list for a Today");
        int task = sc.nextInt();

        sc.nextLine();
        ArrayList<String> AddingTask = new ArrayList<>();
        System.out.println("Add Task in Your List:\nSyntax:\n0.Your Task\n1.Your Task\n2.Your Task\netc...\nStart Listing: ");
        for (int i = 0; i < task; i++) {
            AddingTask.add(sc.nextLine());
        }
        System.out.println("Task Added SuccesFully");
        System.out.println("How Many Task Did You Completed Yet ?");
        int count = sc.nextInt();
        if (count < task && count >= 0) {
            for (int i = 0; i < count; i++) {
                System.out.println("Pass Number, which task has been Completed\nfor Eg: 0,1,2...etc...?");
                int indexOfNumber = sc.nextInt();
                int index = AddingTask.indexOf(indexOfNumber);
                AddingTask.remove(index);
            }
            System.out.println("Task Completed SuccessFully");
            System.out.println("Remaining Task: "+AddingTask);
        }
        else{
            System.out.println("You Completetion Task is More than Your Existing Task");
        }
    }
}

public class TaskManager {
    public static void main(String[] args) {
        addTask ob=new addTask();
        ob.taskManager();
    }
}
