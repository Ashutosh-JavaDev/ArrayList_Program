package ArrayList_Program;
import java.util.ArrayList;
import java.util.Scanner;
class AddData{
    public void addData(){
        ArrayList<String>Name=new ArrayList<>();
        ArrayList<Integer>Class=new ArrayList<>();
        ArrayList<Integer>Marks=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Name of the Student\nor Press Enter to Exit");
        while(true){
            String name=sc.nextLine();
            if(name.equals("")){
                break;
            }
            else{
                Name.add(name);
            }
        }
    }
}
public class StudentDatabase {

    
}
