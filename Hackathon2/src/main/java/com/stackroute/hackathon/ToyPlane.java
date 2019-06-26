package com.stackroute.hackathon;

public class ToyPlane implements Toy, Moving, Flying {
    double price;
    String color;
    public void setPrice(double price)
    {
        this.price=price;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void move()
    {
        System.out.println("\nPlane can Move ");
    }
    public void fly()
    {
        System.out.println("Plane can Fly ");
    }
    public String display(){
        return "Price: "+price+" Color: "+color;
    }
}
