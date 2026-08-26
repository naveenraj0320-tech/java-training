import java.util.Scanner;
public class c1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num1 == num2);
        if (num1 == num2) {
            System.out.println("num1 is equal to num2");
        } else {
            System.out.println("num1 is not equal to num2");
        }
    }
}
