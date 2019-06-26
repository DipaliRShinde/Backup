package com.stackroute.hackathon;

public class HealthInsurance {
    private int customer_id;
    private int customer_details;

    public void HealthInsuranceSure(int customer_id,int customer_details){
        this.customer_id=customer_id;
        this.customer_details=customer_details;
    }
    public int ValidateClaim(){
        System.out.println("Validate a claim");
        return 0;
    }
}
