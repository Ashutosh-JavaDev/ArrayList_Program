package ArrayList_Program;
import java.util.*;
public class aa {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>num=new ArrayList<>();
        System.out.println("Enter the Number in the List");
        for(int i=0;i<5;i++){
            try{
                num.add(sc.nextInt());
            }
            catch (InputMismatchException e){
                System.out.println("Invalid String, Pass Only Integer");
                // System.out.println(e);
                sc.nextLine();
                i--;
            }
        }
        System.out.print(num);
    }
}
