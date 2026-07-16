
import java.util.Scanner;
public class c02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //collect five sujects marks
        int english = sc.nextInt();
        int tamil = sc.nextInt();
        int maths = sc.nextInt();
        int science = sc.nextInt();
        int social = sc.nextInt();
        //calculate total marks
        int add = english + tamil + maths + science + social;
        //calculate average marks
        int average= add/5;
        if (average<35)
            {
            System.out.print("additional class is required");
        }
        else
        {
            System.out.print("you are good to go");
        }
    }
}