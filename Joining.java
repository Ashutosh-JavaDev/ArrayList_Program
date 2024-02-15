package ArrayList_Program;

import java.util.*;

class Join {
    void joinning() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the Value in the  List");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer>list2=new ArrayList<>();
        System.out.println("Enter the VAlue in  the Second ArrayList");
        for(int i=0;i<5;i++){
            list2.add(sc.nextInt());
        }
        ArrayList<Integer>list3=new ArrayList<>();
        list3.addAll(list);
        list3.addAll(list2);
        System.out.println(list3);

    }
}

public class Joining {

}
