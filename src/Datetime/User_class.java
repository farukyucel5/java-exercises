package Datetime;

import java.util.Scanner;

public class User_class extends Date_time{

    public static void main(String[] args) {
        User_class obj=new User_class();

        Scanner scan=new Scanner(System.in);
        System.out.println("Please pass in the date to be able to check whether or not it is a weekend.");
        String date=scan.nextLine();

        obj.checkDay(date);

    }
}
