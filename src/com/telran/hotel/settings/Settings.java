package com.telran.hotel.settings;


public class Settings {
    private static final double BASE_PRICE=100;
    private static final int HOTEL_CAPACITY=10;
    private static final String[] CATEGORY_NAMES = {"suite", "apartment", "superior"};
    private static final double[] CATEGORY_FACTORS = {1.0, 1.5, 2.0};

    
    public static double getBasePrice() {
        return BASE_PRICE;
    }

    
    public static int getHotelCapacity() {
        return HOTEL_CAPACITY;
    }


    public static String getNameByCategory(int numCategory) {
	return CATEGORY_NAMES[numCategory];
    }
    
    public static double getFactorByCategory(int numCategory) {
 	return CATEGORY_FACTORS[numCategory];
     }
    

}
