package AutoGallery;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {


        boolean status=true;
        int count1=0;
        int count2=0;

        Map<Integer,High_Quality_Honda> high_quality_hondaMap=new HashMap<>();
        Map<Integer,Modest_Honda> modestHondaMap=new HashMap<>();



        while (status){
            Scanner scan =new Scanner(System.in);

            System.out.println("please enter in the car model you'd like to purchase");



            String make=scan.nextLine();

            if (make.equalsIgnoreCase("High honda")){
                count1++;
                System.out.println("Please pass in a model name");
                String model=scan.next();
                System.out.println("Please pass in a production year");
                int year= scan.nextInt();

                High_Quality_Honda car1=new High_Quality_Honda("High qualified honda",model,year);
                high_quality_hondaMap.put(count1,  car1);

            }

            if (make.equalsIgnoreCase("Modest honda")){
                count2++;
                System.out.println("Please pass in a model name");
                String model=scan.next();
                System.out.println("Please pass in a production year");
                int year= scan.nextInt();

                Modest_Honda car2=new Modest_Honda("Modest honda",model,year);
                modestHondaMap.put(count2,car2);

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
