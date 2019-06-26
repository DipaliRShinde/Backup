package com.stackroute.hackathon;

public class ToyBuilder {
    public static void buildToyCarTrain(){
        ToyCarTrain toyCarTrain=new ToyCarTrain();
        toyCarTrain.setPrice(500.00);
        toyCarTrain.setColor("Blue");
        toyCarTrain.move();
        String print=toyCarTrain.display();
        System.out.println(print);
    }

    public static void buildToyPlane(){
        ToyPlane toyPlane=new ToyPlane();
        toyPlane.setPrice(1000.00);
        toyPlane.setColor("Black");
        toyPlane.move();
        toyPlane.fly();
        String print=toyPlane.display();
        System.out.println(print);
    }

    public static void main(String args[])
    {
        ToyBuilder.buildToyCarTrain();
        ToyBuilder.buildToyPlane();
    }
}