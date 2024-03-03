package ArrayList_Program;
import java. util.ArrayList;
import java.util.Scanner;
class Recipe{
    ArrayList<String>Iname=new ArrayList<>();
    ArrayList<Integer>iPrice=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    void addingValue(ArrayList<String>Sname,ArrayList<Integer>Sprice){
        this.Iname=Sname;
        this.iPrice=Sprice;
        System.out.println("Press Enter to Stop Adding Value in The List");
        System.out.println("Add Ingredient Name");
        String name=sc.nextLine();
        if(name.equals("")){
            
        }
    }
}
public class Ingredient {
    
}
