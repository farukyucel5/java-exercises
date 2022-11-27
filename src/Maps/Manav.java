package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {

        Map<String,Integer> meyve=new HashMap<>();

        meyve.put("patates",2);
        meyve.put("sogan",3);

        cost(meyve);

    }

    private static void cost(Map<String, Integer> meyve) {

        double sum=0;

        boolean value =true;
        while (value)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("ürün secin: ");
            String product = scan.next();
            switch (product) {
                case "patates":
                    System.out.println("kac kilo");
                    double kilo = scan.nextDouble();
                    System.out.println("baska ürün istermisin: ");
                    String cevap = scan.next();

                    if (cevap.equals("hayır")) {
                        sum += meyve.get("patates") * kilo;
                        value = false;
                    }
                    if (cevap.equals("evet")) {
                        sum += meyve.get("patates") * kilo;

                    }
                    break;

                case "sogan":
                    System.out.println("kac kilo");
                    double kilo1 = scan.nextDouble();
                    System.out.println("baska ürün istermisin: ");
                    String cevap1 = scan.next();

                    if (cevap1.equals("hayır")) {
                        sum += meyve.get("sogan") * kilo1;
                        value = false;

                    }
                    if (cevap1.equals("evet")) {
                        sum += meyve.get("sogan") * kilo1;
                    }

                    break;
            }

        }

        System.out.println("Toplam fiyat "+sum);

    }
}
