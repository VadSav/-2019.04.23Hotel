package com.telran.hotel.entity;

import com.telran.hotel.settings.Settings;

public class Category1 extends Category {
    private static final int numCategory=0;
    public static final Category1 INSTANCE = new Category1();

    public Category1() {
	super(Settings.getNameByCategory(numCategory), Settings.getFactorByCategory(numCategory));
	
    }

    @Override
    public void doService() {
	System.out.println("Services for category" + this.getName());
	System.out.println("Service 1");
	System.out.println("Service 2");
	System.out.println("Service 3");
    }

}
