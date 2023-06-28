import java.util.*;
import java.io.*;

public class Demo{

   public static void main (String args[]) throws IOException{
        PolicyHolder policyHolder1 = new PolicyHolder("Alice", "Jones", 20, "smoker", 65.0, 110.0);
        Policy policy1 = new Policy("3450", "State Farm", policyHolder1);
        System.out.println(policy1);

        PolicyHolder policyHolder2 = new PolicyHolder("Bob", "Lee", 54, "non-smoker", 72.0, 200.0);
        Policy policy2 = new Policy("3455", "Aetna", policyHolder2);
        System.out.println(policy2);
        
        PolicyHolder policyHolder3 = new PolicyHolder("Chester", "Williams", 40, "smoker", 71.0, 300.0);
        Policy policy3 = new Policy("2450", "Met Life", policyHolder3);
        System.out.println(policy3);
        
        PolicyHolder policyHolder4 = new PolicyHolder("Cindy", "Smith", 55, "non-smoker", 62.0, 140.0);
        Policy policy4 = new Policy("3670", "Global", policyHolder4);
        System.out.println(policy4);
        
        PolicyHolder policyHolder5 = new PolicyHolder("Jenna", "Lewis", 30, "smoker", 60.0, 105.0);
        Policy policy5 = new Policy("1490", "Reliable", policyHolder5);
        System.out.println(policy5);
        
        PolicyHolder policyHolder6 = new PolicyHolder("Craig", "Duncan", 23, "smoker", 66.0, 215.0);
        Policy policy6 = new Policy("3477", "State Farm", policyHolder6);
        System.out.println(policy6);

        System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
        System.out.println("The number of policies with a smoker is: " + Policy.getSmokerCount());
        System.out.println("The number of policies with a non-smoker is: " + Policy.getNonSmokerCount());
    }
}