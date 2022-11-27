package Maps;

import java.util.*;

public class Exp4 {
    public static void main(String[] args) {
        /*
   We'll say that 2 swap "match" if they are non-empty and their first chars are the same.
   Loop over and then return the given array of non-empty swap as follows:
   if a string matches an earlier string in the array, swap the 2 swap in the array.
   When a position in the array has been swapped, it no longer matches anything. Using a map,
   this can be solved making just one pass over the array. More difficult than it looks.


allSwap(["ab", "ac"]) → ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
         */
        String[] swap={"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"} ;

        String[] result=new String[swap.length];
        Map<Character, Integer> map = new HashMap<>();//ilk karakter ve o karakterlerin indexlerinden map yaptım.
        for (int i = 0; i < swap.length; i++) {
            char firstchar  = swap[i].charAt(0);//ilk karakterleri aldım

            if (map.containsKey(firstchar)) {
                int p=map.get(firstchar);

                map.remove(firstchar);

                result[i]=result[p];
                result[p]=swap[i];
            } else {
                result[i]=swap[i];
                map.put(firstchar,i);
            }
        }

        System.out.println(Arrays.toString(result));
    }
}
