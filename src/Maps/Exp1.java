package Maps;

import java.util.HashMap;
import java.util.Map;

public class Exp1 {
    public static void main(String[] args) {
        /*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
and set the key "a" to have the value "".
Basically "b" is a bully, taking the value and replacing it with the empty string.


mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
         */

        Map<String,String> mapBully=new HashMap<>();

        mapBully.put("a","candy");
        mapBully.put("b","carrot");
        mapBully.put("c","meh");

        System.out.println(mapBully);

        if(mapBully.containsKey("a")) {
            String newvalueB=mapBully.get("a");
            mapBully.put("b",newvalueB);
            String newvalueA="";
            mapBully.put("a",newvalueA);
        }



        System.out.println(mapBully);

    }
}