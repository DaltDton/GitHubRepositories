import java.util.*;

public class Policy {
//fields
   private String policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private double policyPrice;
   
      //set smoker counters and policy counts
   private static int policyCount = 0;
   private static int smokerCount = 0;
   private static int nonSmokerCount = 0;
      
      
      //default constructor
   public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyHolder = policyHolder;
        
        //counter for policy and an if else statment to check is someone is a smoker
      policyCount++;
      if (policyHolder.getPolicyholdersSmokingStat().equalsIgnoreCase("smoker")) {
         smokerCount++;
      } else {
         nonSmokerCount++;
      }
   }
      
      //getters and setters
   public String getPolicyNumber(){
      return policyNumber;
   }
    
   public String getProviderName(){
      return providerName;
   }
    
   public PolicyHolder getPolicyHolder(){
      return policyHolder;
   }
    
   public double getPolicyPrice() {
      return policyPrice;
   }
    
   public static int getPolicyCount(){
      return policyCount;
   }
    
   public static int getSmokerCount(){
      return smokerCount;
   }
    
   public static int getNonSmokerCount(){
      return nonSmokerCount;
   }
    
    //@param displays Policy Number, Provider Name and Policy Price
   public String toString() {
      return "Policy Number: " + policyNumber + "\n" +
                "Provider Name: " + providerName + "\n" +
                policyHolder.toString();
   }
}