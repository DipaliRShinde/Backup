package com.stackroute.hackathon;

public class InsuranceSystem {
    public static void main(String[] args) {
        CustomerDetails customerdetails = new CustomerDetails();
        HealthInsurance healthinsurance = new HealthInsurance();
        ClaimManager claimmanager = new ClaimManager();
        int Customer = customerdetails.FilesClaim();
        int health = healthinsurance.ValidateClaim();
        int manager = claimmanager.ResultOfClaim();
    }
}

