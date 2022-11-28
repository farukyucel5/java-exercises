package GreenGrocer;

import java.util.HashMap;
import java.util.Map;

public class Product {
    /*
 Hocam benim dedigim su sekilde : Urunler diye ayri bir class acin icine field olarak urunAdi ve fiyat olusturun.
 Sonra bu fieldlari kullanarak parametreli constructor olusturun. Bu constructor sayesinde
 ornegin 5 adet urun olusturun ve uretilen objeleri Map'e atin.
 Daha sonra bu map'i kullaniciya urun listesini gosterirken kullanabilirsiniz.
 Ikincisi fiyat hesaplama konularini method'a baglarsaniz bir kez yazarsiniz her yerde kullanirsiniz

  * Basit bir manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     */

    String name_of_product;


    double price;

    Product( String name_of_product,double price) {

        this.name_of_product=name_of_product;
        this.price=price;

        Map<String,Double> product_map=new HashMap<>();
        product_map.put(name_of_product,price);

        System.out.println(product_map);

    }

    public double getPrice() {
        return price;
    }

}
