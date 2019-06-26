package com.stackroute.hackathon;

public class ClaimManager {
    private boolean result=true;
    private int customer_details;

    public void ClaimManager(boolean result,int customer_details){
        this.result=result;
        this.customer_details=customer_details;
    }
    public int ResultOfClaim(){
        if(result==false){
            System.out.println("approved");
        }else{
            System.out.println("rejected");
        }
        return 0;
    }
}
