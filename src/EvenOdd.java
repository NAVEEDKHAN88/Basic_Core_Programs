import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        int num;
       while(true){ Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number");
        num =sn.nextInt();

        if (num % 2 == 0)
        {
            System.out.println("the number is even");
        }else
        {
            System.out.println("the number is odd");
        }
    }
}
}
