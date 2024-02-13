package ArrayList_Program;
import java.util.*;
class sORTING{
    void SOrt(){
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(32);
        list.add(21);
        list.add(4);
        list.add(87);
        Collections.sort(list);
        System.out.println(list);
    }
}
public class Sorting {
    public static void main(String[] args) {
        sORTING ob=new sORTING();
        ob.SOrt();
    }
}
