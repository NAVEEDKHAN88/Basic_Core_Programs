import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number");
        int power = sn.nextInt();


        for (int i = 1;i<= power;i++)
        {
            int value = 1;
            for (int j=1;j<=i;j++)
            {
                value = value * 2;
            }
            System.out.println("2 rais to"+i+ "is :" + value);
        }
    }
}
