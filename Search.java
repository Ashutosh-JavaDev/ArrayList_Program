package ArrayList_Program;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collection;
class srECH{
    void valueContain(){
        ArrayList list=new ArrayList();
        list.add("Red");
        list.add("Green");
        list.add(23);
        list.add(2.4f);
        list.add("Blue");
        Boolean answer=list.contains("Red");
        System.out.println(answer);
    }
}
public class Search {
    public static void main(String[] args) {
        srECH ob=new srECH();
        ob.valueContain();
    }
}
