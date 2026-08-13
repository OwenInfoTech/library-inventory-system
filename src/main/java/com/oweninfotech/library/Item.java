package com.oweninfotech.library;

public  abstract class Item {
    //Variables
    private final int Id;
    private String title;
    private boolean available;

    //Cuntructor
    public Item(int Id,String title){
        this.Id = Id;
        this.title = title;
        available = true;
    }

    public int getId(){
        return Id;
    }
    public String getTitle(){
        return title;
    }
    public boolean isAvailable(){
        return available;
    }


    public void settitle(String title) {
        this.title = title;

    }
    public void checkOut(){
        available  = false;
    }
    public void checkIn(){
        available = true;
    }
    public abstract String getDetails();
}