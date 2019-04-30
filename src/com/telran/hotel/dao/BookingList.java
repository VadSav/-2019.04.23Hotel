package com.telran.hotel.dao;


import com.telran.hotel.entity.Booking;

public class BookingList {
    private Node first = null;
    private Node last = null;
    private int size;
    
    
    public int size() {
        return this.size;
    }
    public Node add(Booking booking) {
        Node node = new Node();
        if(first == null) {
            node.setBooking(booking);
            node.setPrev(null);
            node.setNext(null);
            first = node;
        } else {
            node.setBooking(booking);
            last.setNext(node);
            node.setNext(null);
            node.setPrev(last);                 
        }       
        last = node;
        size++;
        return node;
    }
    
    public void print() {
        Node curNode = first;
        while(curNode!=null) {
            System.out.println(curNode.getBooking());
            curNode=curNode.getNext();
        }
    }
    
    
    
}

class Node{
    private Node prev=null;
    private Node next = null;
    private Booking booking= null;
    
    public Node getPrev() {
        return prev;
    }
    public void setPrev(Node prev) {
        this.prev=prev;
    }
    
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next= next;
    }
    
    public Booking getBooking() {
        return booking;
    }
    public void setBooking(Booking booking) {
        this.booking= booking;
    }
    
    
    
    
    
    
}