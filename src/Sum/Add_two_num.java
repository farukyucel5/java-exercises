package Sum;

import java.util.ArrayList;
import java.util.List;

public class Add_two_num {
    public static void main(String[] args) {
        /*
        You are given two non-empty linked lists representing two non-negative integers.
         The digits are stored in reverse order, and each of their nodes contains a single digit.
         Add the two numbers and return the sum as a linked list.

         You may assume the two numbers do not contain any leading zero, except the number 0 itself.
         Input: l1 = [2,4,3], l2 = [5,6,4]
         Output: [7,0,8]
         Explanation: 342 + 465 = 807.
         */

        List<Integer> l1=new ArrayList<>();
        l1.add(2);
        l1.add(4);
        l1.add(3);

        List<Integer> l2=new ArrayList<>();
        l2.add(5);
        l2.add(6);
        l2.add(4);

        System.out.println(summation(l1, l2));

    }

    private static List<Integer> summation(List<Integer> l1, List<Integer> l2) {
        int l1size=l1.size();
        int l2size=l2.size();
        List<Integer> sumlist=new ArrayList<>();


        int number1=0;
        int number2=0;
        for (int i = 0; i < l1size; i++) {
            number1+=(l1.get(i)*Math.pow(10,l1size-i-1));
        }

        for (int i = 0; i < l2size; i++) {
            number2+=(l2.get(i)*Math.pow(10,l2.size()-i-1));
        }

        int sum=number1+number2;
        String strsum=""+sum;

        for (int i = 0; i <strsum.length() ; i++) {

            int lastdigit=sum%10;
            sumlist.add(lastdigit);
            sum=sum/10;
        }
        return sumlist;
    }

}