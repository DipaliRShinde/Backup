package com.stackroute.hackathon;

public class CustomerDetails {
    public String name;
    public int customer_id;
    public int age;

    public void CustomerDetails(String name, int customer_id, int age){
        this.name=name;
        this.customer_id=customer_id;
        this.age=age;
    }
    public int FilesClaim(){
        System.out.println("files a claim");
        return 0;
    }
}
