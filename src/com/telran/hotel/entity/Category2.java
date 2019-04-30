package com.telran.hotel.entity;


import com.telran.hotel.settings.Settings;

public class Category2 extends Category {
    private static final int numCategory=1;
    public static final Category2 INSTANCE = new Category2();

    public Category2() {
	super(Settings.getNameByCategory(numCategory), Settings.getFactorByCategory(numCategory));
	
    }

    @Override
    public void doService() {
	System.out.println("Services for category" + this.getName());
	System.out.println("Service 1");
	System.out.println("Service 3");
    }

}