package ArrayList_Program;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class subLists{
    void Lists(){
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value in the List");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        ArrayList<Integer>sub_List=new ArrayList<>(list.subList(0, 3));
        System.out.println(sub_List);
    }
}
public class Extract{
    public static void main(String[] args) {
        subLists ob=new subLists();
        ob.Lists();
    }
}