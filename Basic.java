package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;

class inserting {
    public void insert() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number or write 'STOP' to stop adding number");
        while (true) {
            String number = sc.nextLine();
            if (number.equalsIgnoreCase("STOP")) {
                break;
            } else {
                float num = Float.parseFloat(number);
            }
        }
    }
}

public class Basic {

}
