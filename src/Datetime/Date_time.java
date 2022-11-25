package Datetime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Date_time {

    protected void checkDay(String date1) {
       String[] date_arr= date1.split("-");
        List<Integer> date_list=new ArrayList<>();

        for (String s : date_arr) {
            if (!s.equals("."))
                date_list.add(Integer.parseInt(s));
        }
        System.out.println(date_list);

        LocalDate date2=LocalDate.of(date_list.get(2),date_list.get(1),date_list.get(0));

       String day= String.valueOf(date2.getDayOfWeek());

       if (day.equalsIgnoreCase("sunday"))
        System.out.println("This day is "+day+" and it is a weekend");
       if (day.equalsIgnoreCase("saturday"))
           System.out.println("This day  is "+day+" and it is a weekend");




    }
}
