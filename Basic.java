package ArrayList_Program;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Inserting {
    public void insert() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter numbers or press Enter twice to stop adding numbers:");
        while (true) {
            String input = sc.nextLine();
            if (input.isEmpty()) {
                break;
            } else {
                try {
                    int num = Integer.parseInt(input);
                    list.add(num);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid integer.");
                }
            }
        }
       

        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("Sum of numbers: " + sum);

        int mul=1;
        for(int i=0;i<list.size();i++){

        }
        
        System.out.println("Numbers in the list:");
        for (int num : list) {
            System.out.println(num);
        }

        if (!list.isEmpty()) {
            System.out.println("Enter the index of the number you want to remove:");
            int ind = sc.nextInt();
            if (ind >= 1 && ind <= list.size()) { // Check if index is within bounds
                list.remove(ind - 1);
                System.out.println("List after removing the element:");
                for (int num : list) {
                    System.out.println(num);
                }
            } else {
                System.out.println("Invalid index.");
            }
            
            System.out.println("Enter the number you want to find:");
            int find = sc.nextInt();
            System.out.println("List contains " + find + ": " + list.contains(find));
            
            System.out.println("Reversed List:");
            Collections.reverse(list);
            for (int num : list) {
                System.out.println(num);
            }
            
            System.out.println("Shuffled List:");
            Collections.shuffle(list);
            System.out.println(list);
        } else {
            System.out.println("List is empty.");
        }
    }
}

public class Basic {
    public static void main(String[] args) {
        Inserting ob = new Inserting();
        ob.insert();
    }
}
