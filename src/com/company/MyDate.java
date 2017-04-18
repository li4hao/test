package com.company;


/**
 * Created by lisho on 17/4/11.
 */
public class MyDate {
    String Year;
    String Month;
    String Day;
    String Date;

//    public MyDate() {
//        Year = "2001";
//        Month = "09";
//        Day = "23";
//        Date = Year+"."+Month+"."+Day;
//    }
//
//    @Override
//    public String toString() {
//        return Date;
//    }

    public MyDate(String year, String month, String day, String date) {
        Year = year;
        Month = month;
        Day = day;
        Date = date;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "Year='" + Year + '\'' +
                ", Month='" + Month + '\'' +
                ", Day='" + Day + '\'' +
                ", Date='" + Date + '\'' +
                '}';
    }
}
