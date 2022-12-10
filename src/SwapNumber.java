import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {


        int a, b, c;
        System.out.println("Enter Value in a :");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        System.out.println("Enter Value in b :");
        Scanner sc1 = new Scanner(System.in);
        b = sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Values in a:" +a);
        System.out.println("Values in b:" +b);
    }
}
