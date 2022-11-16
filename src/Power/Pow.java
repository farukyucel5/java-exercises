package Power;

import java.util.Scanner;

public class Pow {
    /*
    Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
    Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        double num=scan.nextDouble();
        System.out.println("please enter a power ");
        double power= scan.nextDouble();

        double result =pow_method(num,power);

        System.out.println(result);
    }

    private static double pow_method(double num, double power) {
            double const_num=num;

            if(power>=1)
            {
                for (int i = 1; i < power; i++) {
                    num*=const_num;
                }
            }
            else if(power==0 && num!=0)
                return 1;

            else{
                power=power*(-1);

                for (int i = 1; i < power; i++) {
                    num*=const_num;
                }

                return 1/num;
            }



        return num;
    }
}
