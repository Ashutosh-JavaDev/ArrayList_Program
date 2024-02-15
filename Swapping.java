package ArrayList_Program;
import java.util.*;
class Swap{
    void  swapping(){
        ArrayList<Integer>list=new ArrayList<>();
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter tthe Value in the List");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        Collections.swap(list, 0, 3);
        System.out.println(list);
    }
}
public class Swapping {
    public static void main(String[] args) {
        Swap ob=new Swap();
        ob.swapping();
    }
}
