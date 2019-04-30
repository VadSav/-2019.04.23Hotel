package com.telran.hotel.entity;

public abstract class Category {
    
    private String name;
    private double factor;
    
    public Category(String name, double factor) {
	super();
	this.name = name;
	this.factor = factor;
    }
    @Override
    public String toString() {
	return "[" + name + "(" + factor + ")]";
    }
    
    
    
    public String getName() {
        return name;
    }
    public double getFactor() {
        return factor;
    }
    public abstract void doService();
    
    

}
