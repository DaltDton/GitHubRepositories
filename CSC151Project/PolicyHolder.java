import java.util.*;

public class PolicyHolder{

   //fields
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholdersAge;
   private String policyholdersSmokingStat;
   private double policyholdersHeight;
   private double policyholdersWeight;
   
   /*Constructor that accepts arguments for the policyholderFirstName, policyholderLastName, policyholdersAge, policyholdersSmokingStat, policyholdersHeight and policyholdersWeight
    This constructor can be used to initialize the fields. 
    @param policyholderFirstName - policy holder first name
    @param policyholderLastName - policy holder last name
    @param policyholdersAge - policy holders age
    @param policyholdersSmokingStat - if the holder is a smoker or not
    @param policyholdersHeight - the policy holders height
    @param policyholdersWeight - the policy holders weight
    */
   public PolicyHolder(String policyholderFirstName, String policyholderLastName, int policyholdersAge, String policyholdersSmokingStat, double policyholdersHeight, double policyholdersWeight) {
      this.policyholderFirstName = policyholderFirstName;
      this.policyholderLastName = policyholderLastName;
      this.policyholdersAge = policyholdersAge;
      this.policyholdersSmokingStat = policyholdersSmokingStat;
      this.policyholdersHeight = policyholdersHeight;
      this.policyholdersWeight = policyholdersWeight;
   }
   
   
   //getter methods
   
   public String getPolicyholderFirstName() {
      return policyholderFirstName;
   }
   
   public String getPolicyholderLastName() {
      return policyholderLastName;
   }
   
   public int getPolicyholdersAge() {
      return policyholdersAge;
   }
   
   public String getPolicyholdersSmokingStat() {
      return policyholdersSmokingStat;
   }
   
   public double getPolicyholdersHeight() {
      return policyholdersHeight;
   }
   
   public double getPolicyholdersWeight() {
      return policyholdersWeight;
   }
   
  //toString method
  //displays the policy holders information
   public String toString() {
      return "Policyholder's First Name: " + policyholderFirstName + "\n" +
             "Policyholder's Last Name: " + policyholderLastName + "\n" +
             "Policyholder's Age: " + policyholdersAge + "\n" +
             "Policyholder's Smoking Status (Y/N): " + policyholdersSmokingStat + "\n" +
             "Policyholder's Height: " + policyholdersHeight + " inches\n" +
             "Policyholder's Weight: " + policyholdersWeight + " pounds\n" +
             "Policyholder's BMI: " + String.format("%.2f", calculateBMI()) + "\n" +
             "Policy Price: " + String.format("%.2f", calcualtePrice()) + "\n";
   }
   
   //calculatesBmi method
   //returns bmi of policy holder
   private double calculateBMI() {
      return (policyholdersWeight / (policyholdersHeight * policyholdersHeight)) * 703.0;
   }
   
   public double calcualtePrice(){
      double price = 600.00;
      
         if ( policyholdersAge > 50) {
            price = price + 75.00;
         }
         
         if ( policyholdersSmokingStat.equalsIgnoreCase("Smoker")) { 
            price = price + 100.00;
         }
         
         
         double BMI = calculateBMI(); 
         if (BMI > 35) {
            price  = price + ((BMI - 35) * 20);
         }
         
         return price;
      }
}