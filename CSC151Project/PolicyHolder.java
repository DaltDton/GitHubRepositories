import java.util.*;

public class PolicyHolder {
      private String policyNumber;
      private String providerName;
      private String policyholderFirstName;
      private String policyholderLastName;
      private int policyholdersAge;
      private String policyholdersSmokingStat;
      private double policyholdersHeight;
      private double policyholdersWeight;
      
      public PolicyHolder() {
         policyNumber = "  ";
         providerName = " ";
         policyholderFirstName = " ";
         policyholderLastName = " ";
         policyholdersAge = 0;
         policyholdersSmokingStat = " ";
         policyholdersHeight = 0;
         policyholdersWeight = 0;
         
      }
      
      public PolicyHolder(String policyNumber, String providerName,String policyholderFirstName, String policyholderLastName, int policyholdersAge, String policyholdersSmokingStat, double policyholdersHeight, double policyholdersWeight) {
         this.policyNumber = policyNumber;
         this.providerName = providerName;
         this.policyholderFirstName = policyholderFirstName;
         this.policyholderLastName = policyholderLastName;
         this.policyholdersAge = policyholdersAge;
         this.policyholdersSmokingStat = policyholdersSmokingStat;
         this.policyholdersHeight = policyholdersHeight;
         this.policyholdersWeight = policyholdersWeight;
         
      }
      
      public static String getPolicyNumber() {
      return policyNumber;
      }
      
      public static String getProviderName() {
      return providerName;
      }
      
      public static String getPolicyholderFirstName() {
      return policyholderFirstName;
      }
      
      public static String getPolicyholderLastName() {
      return policyholderLastName;
      }
      
      public static int getPolicyholdersAge() {
      return policyholdersAge;
      }
      
      public static String getPolicyholdersSmokingStat() {
      return policyholdersSmokingStat;
      }
      
      public static double getPolicyholdersHeight() {
      return policyholdersHeight;
      }
      
      public static double getPolicyholdersWeightt() {
      return policyholdersWeight;
      }
      
      public void setPolicyNumber(String policyNumber) {
      this.policyNumber = policyNumber;
      }
            
      public void setPolicyName(String providerName) {
      this.providerName = providerName;
      }
      
      public void setPolicyholderFirstName(String policyholderFirstName) {
      this.policyholderFirstName = policyholderFirstName;
      }
      
      public void setPolicyholderLastName(String policyholderLastName) {
      this.policyholderLastName  = policyholderLastName;
      }
      
      public void setPolicyholdersAge(int policyholdersAge) {
      this.policyholdersAge  = policyholdersAge;
      }
      
      public void setPolicyholdersSmokingStat(String policyholdersSmokingStat) {
      this.policyholdersSmokingStat = policyholdersSmokingStat;
      }
      
      public void setPolicyholdersHeight(double policyholdersHeight) {
      this.policyholdersHeight = policyholdersHeight;
      }
      
      public void setPolicyholdersWeightt(double policyholdersWeight) {
      this.policyholdersWeight = policyholdersWeight;
      }    
      
      public double BMICalc(){
      return (policyholdersWeight * 703) / (policyholdersHeight * policyholdersHeight);
      }
      
      public double calcualtePrice(){
      double price = 600.00;
      
         if ( policyholdersAge > 50) {
            price = price + 75.00;
         }
         
         if ( policyholdersSmokingStat.equalsIgnoreCase("Smoker")) { 
            price = price + 100.00;
         }
         
         
         double BMI = BMICalc(); 
         if (BMI > 35) {
            price  = price + ((BMI - 35) * 20);
         }
         
         return price;
      }
      
      public String toString() {
        return "Policyholder's First Name: " + policyholderFirstName + "\n" +
                "Policyholder's Last Name: " + policyholderLastName + "\n" +
                "Policyholder's Age: " + policyholdersAge + "\n" +
                "Policyholder's Smoking Status (Y/N): " + policyholdersSmokingStat + "\n" +
                "Policyholder's Height: " + policyholdersHeight + " inches\n" +
                "Policyholder's Weight: " + policyholdersWeight + " pounds\n" +
                "Policyholder's BMI: " + BMICalc() + "\n";
    }
      
      
}