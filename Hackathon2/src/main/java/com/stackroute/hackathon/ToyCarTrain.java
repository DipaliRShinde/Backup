package com.stackroute.hackathon;

public class ToyCarTrain implements Toy, Moving
{
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
        System.out.println("\nCar and Train can Move");
    }
    public String display(){
        return "Price: "+price+" Color: "+color;
    }
}
