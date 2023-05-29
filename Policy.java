import java.util.*;

public class Policy {
   private int policyNumber;
      private String policyName;
      private String policyholderFirstName;
      private String policyholderLastName;
      private int policyholdersAge;
      private char policyholdersSmokingStat;
      private int policyholdersHeight;
      private int policyholdersWeight;
      
      public Policy() {
         policyNumber = 0;
         policyName = " ";
         policyholderFirstName = " ";
         policyholderLastName = " ";
         policyholdersAge = 0;
         policyholdersSmokingStat = 'a';
         policyholdersHeight = 0;
         policyholdersWeight = 0;
         
      }
      
      public Policy(int policyNumber, String policyName,String policyholderFirstName, String policyholderLastName, int policyholdersAge, char policyholdersSmokingStat, int policyholdersHeight, int policyholdersWeight) {
         this.policyNumber = policyNumber;
         this.policyName = policyName;
         this.policyholderFirstName = policyholderFirstName;
         this.policyholderLastName = policyholderLastName;
         this.policyholdersAge = policyholdersAge;
         this.policyholdersSmokingStat = policyholdersSmokingStat;
         this.policyholdersHeight = policyholdersHeight;
         this.policyholdersWeight = policyholdersWeight;
         
      }
      
      public int getPolicyNumber() {
      return policyNumber;
      }
      
      public String getPolicyName() {
      return policyName;
      }
      
      public String getPolicyholderFirstName() {
      return policyholderFirstName;
      }
      
      public String getPolicyholderLastName() {
      return policyholderLastName;
      }
      
      public int getPolicyholdersAge() {
      return policyholdersAge;
      }
      
      public char getPolicyholdersSmokingStat() {
      return policyholdersSmokingStat;
      }
      
      public int getPolicyholdersHeight() {
      return policyholdersHeight;
      }
      
      public int getPolicyholdersWeightt() {
      return policyholdersWeight;
      }
      
      public void setPolicyNumber(int policyNumber) {
      this.policyNumber = policyNumber;
      }
            
      public void setPolicyName(String policyName) {
      this.policyName = policyName;
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
      
      public void setPolicyholdersSmokingStat(char policyholdersSmokingStat) {
      this.policyholdersSmokingStat = policyholdersSmokingStat;
      }
      
      public void setPolicyholdersHeight(int policyholdersHeight) {
      this.policyholdersHeight = policyholdersHeight;
      }
      
      public void setPolicyholdersWeightt(int policyholdersWeight) {
      this.policyholdersWeight = policyholdersWeight;
      }    
}