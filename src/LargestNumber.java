import com.sun.org.apache.bcel.internal.classfile.Utility;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sn = new Scanner(System.in);
        System.out.println("Please Enter First Number: ");
        int a = sn.nextInt();
        System.out.println("Please Enter Second Number: ");
        int b = sn.nextInt();
        System.out.println("Please Enter Third Number ");
        int c = sn.nextInt();
        if (a >= b && a >= c)
            System.out.println(a + " is the largest number.");
        else if (b >= a && b >= c)
            System.out.println(b + " is the largest number.");
        else
            System.out.println(c + " is the largest number.");
    }
}
