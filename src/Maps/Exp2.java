package Maps;

import java.util.HashMap;

public class Exp2 {
    /*
    Given a string s, find the length of the longest substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    public static void main(String []args) {
        String s = "abcabcbbaaaaaab";
        int length_of_longest_substring = max_length_of_substring(s);
        System.out.println("The length of longest substring: " + length_of_longest_substring);
    }

    static int max_length_of_substring(String kelime) {
        HashMap<Character, Integer> map = new HashMap<>();
        int Max_length = 0;
        int begining = 0;
        for(int end = 0; end < kelime.length(); end++) {
            if(map.containsKey(kelime.charAt(end))) {

                begining =Math.max(begining,map.get(kelime.charAt(end))+1);
                System.out.println(begining);
            }

            map.put(kelime.charAt(end), end);

            Max_length = Math.max(Max_length, end-begining+1);
        }
        System.out.println(map);
        return Max_length;
    }

}
