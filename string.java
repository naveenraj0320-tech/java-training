import java.util.Scanner;
public class string{
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        String csk = sc.nextLine();
        if(csk.equals("win"))
            {
            System.out.print("CSK is the winner");
        }
        else{
           System.out.print("CSK is the loser");
    }
}
}