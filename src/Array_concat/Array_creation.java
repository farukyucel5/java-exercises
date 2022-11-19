package Array_concat;

import java.util.Arrays;
import java.util.Scanner;

public class Array_creation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 1 ile 49 arasinda 6 sayi giriniz");
        int[] arr= new int[6];
        for (int i = 0; i <arr.length ; i++) {
            int girilensayı=scan.nextInt();
            if (girilensayı<0 || girilensayı>49) {

                System.out.println("gecersiz sayi tekrar sayi giriniz");
                int dogru_tamsayı=scan.nextInt();//burada yeni bir değişken oluşturup scan yardımıyla hatalı
                arr[i]=dogru_tamsayı;            //olanın yerine değer aldım.
            }


            else {
                arr[i]=girilensayı;
                System.out.println("Yeni sayi giriniz");
            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
