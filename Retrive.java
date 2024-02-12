package ArrayList_Program;

import java.util.ArrayList;
import java.util.Scanner;

class retrive {
    void findIndex(int size) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        System.out.println("Enter the Value in the List");
        for (int i = 0; i < 5; i++) {
            num.add(sc.nextInt());
        }

        System.out.println("Please Enter the Index whose Element want to  find");
        int newNum = sc.nextInt();
        try {
            
        } catch (ArrayIndexOutOfBoundsException e1) {

        }

    }
}

public class Retrive {
    public static void main(String[] args) {
        retrive ob = new retrive();
        ob.findIndex(5);
    }

}
