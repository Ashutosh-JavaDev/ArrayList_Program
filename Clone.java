package ArrayList_Program;

import java.util.*;

class cLone {
    void Clonning() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value in the List");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer>List3=(ArrayList<Integer>)list.clone();
        System.out.println(List3);
        // ArrayList<Integer>list2=new ArrayList<>(list);
        // System.out.println(list2);
    }
}

public class Clone {
public static void main(String[] args) {
    cLone ob=new cLone();
    ob.Clonning();
}
}
