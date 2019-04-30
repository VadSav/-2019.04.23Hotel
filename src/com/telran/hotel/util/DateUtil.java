package com.telran.hotel.util;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


/*
   import java.util.Random;
   
   public class DateUtil { static Random rnd = new
   Random(System.currentTimeMillis()); public static long between(String
   d1,String d2) { return rnd.nextInt(10)+1; } }
 */


public class DateUtil {

    public static final String pattern = "yyyy-MM-dd";

    public static LocalDate stringToDate(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate newDate = LocalDate.parse(s, formatter);
        return newDate;
    }

    public static Long between(LocalDate d1, LocalDate d2) {
        return ChronoUnit.DAYS.between(d1, d2);
    }

    public static Long between(String sDay1, String sDay2) {
        return ChronoUnit.DAYS.between(stringToDate(sDay1), stringToDate(sDay2));
        
        

    }

    public static boolean isDateNotInterseption(LocalDate dStart1, LocalDate dFinish1, LocalDate dStart2,
            LocalDate dFinish2) {

	
        return ((dStart2.isBefore(dStart1) || dStart2.isEqual(dStart1))
                && (dFinish2.isBefore(dStart1)||dFinish2.isEqual(dStart1)) )
                || 
                  ((dStart2.isAfter(dFinish1)||dStart2.isEqual(dFinish1)) 
                &&(dFinish2.isAfter(dFinish1)||dFinish2.isEqual(dFinish1)) );
        
        
    }

    public static boolean isDateNotInterseption(String sStart1, String sFinish1, String sStart2, String sFinish2) {

        LocalDate dStart1 = stringToDate(sStart1);
        LocalDate dFinish1 = stringToDate(sFinish1);
        LocalDate dStart2 = stringToDate(sStart2);
        LocalDate dFinish2 = stringToDate(sFinish2);

        return ((dStart2.isBefore(dStart1) || dStart2.isEqual(dStart1))
             && (dFinish2.isBefore(dStart1)||dFinish2.isEqual(dStart1)) )
             || 
               ((dStart2.isAfter(dFinish1)||dStart2.isEqual(dFinish1)) 
             &&(dFinish2.isAfter(dFinish1)||dFinish2.isEqual(dFinish1)) );

    }
    
    public static boolean isBefore(String date1, String date2) {
        return stringToDate(date1).isBefore(stringToDate(date2));
    }

    public static boolean isAfter(String date1, String date2) {
        return stringToDate(date1).isAfter(stringToDate(date2));
    }
    
    public static boolean isEqual(String date1, String date2) {
        return stringToDate(date1).isEqual(stringToDate(date2));
    }
    
    public static boolean isBefore(String date1) {
        return stringToDate(date1).isBefore(LocalDate.now());
    }

    public static boolean isAfter(String date1) {
        return stringToDate(date1).isAfter(LocalDate.now());
    }
    
    public static boolean isEqual(String date1) {
        return stringToDate(date1).isEqual(LocalDate.now());
    }


    public static String dateToString(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(pattern)).toString();
    }
    
    public static String getToday() {
        return dateToString(LocalDate.now());
    }
    
    
}