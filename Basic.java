package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class inserting {
    public void insert() {
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        System.out.println("Enter number or Press Double time 'ENTER' to stop adding number");
        while (true) {
            String number = sc.nextLine();
            if (number.equals("")) {
                break;
            } else {
                int num = Integer.parseInt(number);
                list.add(num);
            }
            continue;

        }
        System.out.println("Numbers are:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Enter the Index want to remove:");
        int ind = sc.nextInt();
        list.remove(ind - 1);
        System.out.println("Existing Numbers are:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Enter the Number want to find:");
        int find = sc.nextInt();
        if (list.contains(find)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        System.out.println("Reverse List:");
        for(int i=list.size()-1;i>=0;i--){
           System.out.println(list.get(i)); 
        }
        Collections.shuffle(list);
        System.out.println(list);
        
    }
}

public class Basic {
    public static void main(String[] args) {
        inserting ob = new inserting();
        ob.insert();
    }
}
