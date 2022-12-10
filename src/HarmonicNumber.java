/*a. Desc -> Prints the Nth harmonic number: 1/1 + 1/2 + ... + 1/N
b. I/P -> The Harmonic Value N. Ensure N != 0
c. Logic -> compute 1/1 + 1/2 + 1/3 + ... + 1/N
d. O/P -> Print the Nth Harmonic Value.*/

import java.util.Scanner;

public class HarmonicNumber {
    static double nthHarmonic(int N)
    {
        float harmonic = 1;



        for (int i = 2; i <= N; i++) {
            harmonic += (float)1 / i;
        }

        return harmonic;
    }



    public static void main (String[] args) {

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the number to find the nth Harmonic number");
        int N = sn.nextInt();
        System.out.print(nthHarmonic(N));
        if (N > 0) {

            System.out.println("The Harmonic Value for the number is: " + nthHarmonic(N));
        } else {
            System.out.println("The number should be greater than zero");
        }
    }

    }




