package ArrayList_Program;

import java.sql.Array;
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
            if (newNum < 5) {
                System.out.println(num.get(newNum));
            }
            else{
              throw new  ArrayIndexOutOfBoundsException("Invalid Position");
            }
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println(e1);
        }

    }
}

public class Retrive {
    public static void main(String[] args) {
        retrive ob = new retrive();
        ob.findIndex(5);
    }

}
