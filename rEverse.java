package ArrayList_Program;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class Reverse{
    void reVerse(){
        ArrayList<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value in the List");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}
public class rEverse {
    public static void main(String[] args) {
        Reverse ob=new Reverse();
        ob.reVerse();
    }
}
