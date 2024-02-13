package ArrayList_Program;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class sHuffle{
    void shUffle(){
        Scanner sc=new Scanner(System.in);
        ArrayList<String>list=new ArrayList<>();
        System.out.println("Enter the Value in the List");
        for(int i=0;i<5;i++){
            list.add(sc.nextLine());
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}
public class Shuffle {
    public static void main(String[] args) {
        sHuffle ob=new sHuffle();
        ob.shUffle();

    }
}
