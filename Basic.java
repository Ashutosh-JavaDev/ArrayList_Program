package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

class inserting {
    public void insert() {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        System.out.println("Enter number or write 'STOP' to stop adding number");
        while (true) {
            String number = sc.nextLine();
            if (number.equalsIgnoreCase("STOP")) {
                break;
            } else {
                float num = Float.parseFloat(number);
                list.add(num);
            }
            continue;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

public class Basic {

}
