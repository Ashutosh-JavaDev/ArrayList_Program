package ArrayList_Program;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class addTask{
    void taskManager(){
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Task You Want add in you list for a Today");
        int task=sc.nextInt();
        ArrayList<String>AddingTask=new ArrayList<>();
        System.out.println("Add Task in Your List:\nSyntax:\n1.Your Task\n2.Your Task\n3.Your Task\netc... ");
        for(int i=0;i<task;i++){
            AddingTask.add(sc.nextLine());
        }
        System.out.println("Task Added SuccesFully");
        System.out.println("How Many Task Did You Completed Yet ?");
    }
}
public class TaskManager {
    
}
