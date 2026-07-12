import java.util.Scanner;

public class challenge4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        if (num1 % 2 == 0)
            System.out.println("This number is even.");
        else
            System.out.println("This number is odd.");

        sc.close();
    }
}