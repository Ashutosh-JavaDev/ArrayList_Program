package ArrayList_Program;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class cOpying{
    void cOpY(){
        Scanner sc=new Scanner(System.in);
        ArrayList list=new ArrayList();
        ArrayList list1=new ArrayList();
        System.out.println("Enter the value in the List 1");
        for(int i=0;i<5;i++){
            list.add(i);
        }
        System.out.println("Enter the value in the List 2");
        for(int i=0;i<5;i++){
            list1.add(i);
        }
        Collections.copy(list, list1);
        System.out.println(list);        
        System.out.println(list1);

    }
}
public class Copying {
    
}
