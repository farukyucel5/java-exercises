package Maps;

import java.util.HashMap;
import java.util.Map;

public class Exp3 {
    /*
    3.practice
Given a map of food keys and topping values, modify and return the map as follows:
if the key "ice cream" is present, set its value to "cherry".
In all cases, set the key "bread" to have the value "butter".

topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
topping1({}) → {"bread": "butter"}
topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}

     */

    public static void main(String[] args) {

        Map<String,String> topping=new HashMap<>();

        topping.put("ice cream","peanuts");
        topping.put("pancake","syrup");
        System.out.println(topping);

        if (topping.containsKey("ice cream")) {

            topping.put("ice cream","cherry");
        }

        topping.put("bread","butter");

        System.out.println(topping);



    }
}
