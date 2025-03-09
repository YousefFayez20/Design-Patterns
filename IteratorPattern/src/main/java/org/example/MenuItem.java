package org.example;

public class MenuItem {
    String Name;
    int price;
    public MenuItem (String Name, int price){
        this.Name = Name;
        this.price = price;
    }
    public String toString(){
        return "Name is " +this.Name +"with price: "+this.price;
    }

}
