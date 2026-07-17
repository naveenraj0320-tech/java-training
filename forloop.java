import java.util.Scanner; 
public class forloop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for a: ");
        int a = sc.nextInt();
        System.out.print("Enter a number for b: ");
        int b = sc.nextInt();
         for(int i=a; i<=b; i++){
            System.out.println(i);
        

        }
          sc.close();
    }
  
}
