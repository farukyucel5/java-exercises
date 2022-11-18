package Array_concat;

import java.util.ArrayList;
import java.util.List;

public class Detected_the_same {
    /* iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
     * (buyuk kucuk harf onemsiz)
     * Input1 : {John,Brad,Ange,Sofia,Emily}
     * Input2 : {sofia,brad,grace,emily,hazel}
     * Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {

        String[] input1={"John","Brad","Ange","Sofia","Emily","faruk","harun","grace"};
        String[] input2={"sofia","brad","grace","emily","hazel"};

        List<String> liste=new ArrayList<>();

        int minlength=Math.min(input1.length,input2.length);
        int maxlength=Math.max(input1.length,input2.length);

        for (int i = 0; i <minlength ; i++) {
            for (int j = 0; j < maxlength; j++) {
                if (input2[i].equalsIgnoreCase(input1[j]))
                    liste.add(input2[i]);
            }

        }

        System.out.println(liste);
    }




}
