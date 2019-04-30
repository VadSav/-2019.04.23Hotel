package com.telran.hotel.entity;

public class Person {
    String name;

    public Person(String name) {
	super();
	this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
	return " [" + name + "]";
    }
    
    
}
