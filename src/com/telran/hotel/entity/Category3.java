package com.telran.hotel.entity;

import com.telran.hotel.settings.Settings;

public class Category3 extends Category {
    private static final int numCategory=2;
    public static final Category3 INSTANCE = new Category3();

    public Category3() {
	super(Settings.getNameByCategory(numCategory), Settings.getFactorByCategory(numCategory));
	
    }

    @Override
    public void doService() {
	System.out.println("Services for category" + this.getName());
	System.out.println("all incl.");

    }

}