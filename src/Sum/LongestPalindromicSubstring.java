package Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestPalindromicSubstring {
    /*
Given a string s, return the longest palindromic substring in s.
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
     */

    public static void main(String[] args) {

        String s="bababd";
        //String s="cbbd";

       List<String> longest_sub= palindromic_substring(s);

        Collections.sort(longest_sub);

        System.out.println("The longest palindromic substring: "+longest_sub.get(longest_sub.size()-1));
    }

    private static List<String> palindromic_substring(String s) {
        String[] str_array= s.split("");
        List<String> str_list=new ArrayList<>();
        str_list.addAll(Arrays.asList(str_array));

        List<String> liste=new ArrayList<>();
        for (int i = 0; i < str_list.size(); i++) {

            for (int j = i+2; j < str_list.size()+1; j++) {
                List<String> sublist=str_list.subList(i,j);
                String str="";
                String reverse_str="";
                for (int k = sublist.size()-1; k>=0 ; k--) {
                    str+=sublist.get(k);

                }
                for (String value : sublist) {
                    reverse_str += value;

                }
                if (str.equals(reverse_str))
                   liste.add(str);


            }
        }

        return liste;

    }
}
