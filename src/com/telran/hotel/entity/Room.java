package com.telran.hotel.entity;


import com.telran.hotel.settings.Settings;

public class Room {
    
    private static int counter =0;
    private int num;
    private Category category;
    private int id;
    
    public Room(int num, Category category) {
	this.num = num;
	this.category = category;
	this.id = ++counter;
    }

    public int getNum() {
        return num;
    }

    public Category getCategory() {
        return category;
    }

    public int getId() {
        return id;
    }
    
    private double getBasePrice() {
	return Settings.getBasePrice();
    }

    public double getRealPrice() {
	return this.getBasePrice()*this.category.getFactor();

    }

    @Override
    public String toString() {
	return "Room "+ id + " [num=" + num + ", category=" + category + "]";
    }

    
    
    
    

}
