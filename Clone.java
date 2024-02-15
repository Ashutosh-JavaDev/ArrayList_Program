package ArrayList_Program;

import java.util.*;

class clone {
    void Clonning() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value in the List");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
        ArrayList<Integer> lists2 = new ArrayList<Integer>();
        System.out.println("Enter the Value in the Second ArrayList");
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }
    }
}

public class Clone {

}
