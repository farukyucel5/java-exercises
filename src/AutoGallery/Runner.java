package AutoGallery;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        High_Quality_Honda car1=new High_Quality_Honda();
        Modest_Honda car2=new Modest_Honda();

        Map<Double,High_Quality_Honda> high_quality_hondaMap=new HashMap<>();
        Map<Double,Modest_Honda> modestHondaMap=new HashMap<>();

        Scanner scan =new Scanner(System.in);
        Scanner scan1=new Scanner(System.in);



        boolean status=true;
        while (status){


            System.out.println("please enter in the car model you'd like to purchase");
            String make=scan.nextLine();
            if (make.equalsIgnoreCase("High class")){

                System.out.println("Please pass in a model name");
                String model=scan.next();
                System.out.println("Please pass in a production year");
                int year= scan.nextInt();

               car1=new High_Quality_Honda("High qualified honda",model,year);
                high_quality_hondaMap.put(car1.getPrice(),  car1);

            }

            if (make.equalsIgnoreCase("Modest")){

                System.out.println("Please pass in a model name");
                String model=scan.next();
                System.out.println("Please pass in a production year");
                int year= scan.nextInt();
                System.out.println("Do you want your car to have a sunroof?(yes or no)\n" +
                        "you'll be charged 1000$ more for this");
                String respond=scan1.nextLine();

                if (respond.equalsIgnoreCase("yes")) {
                   double new_price=car2.getPrice()+car1.sunroof_price;
                    car2.setPrice(new_price);
                    car2=new Modest_Honda("Modest honda",model,year);
                    modestHondaMap.put(new_price,car2);

                }else {
                    car2=new Modest_Honda("Modest honda",model,year);
                    modestHondaMap.put(car2.getPrice(),car2);
                }

            }

            System.out.println("would you like to add any car to the database?(Y/N)");
            String reply=scan.next();

            if (reply.equalsIgnoreCase("N")){

                System.out.println("Would you like to see the list of cars(YES/NO)");
                String reply1=scan.next();

                if (reply1.equalsIgnoreCase("YES")){
                    System.out.println("High quality Honda list");
                    System.out.println(high_quality_hondaMap);
                    System.out.println("Modest honda list");
                    System.out.println(modestHondaMap);
                }

                status=false;

            }


        }

    }
}
