import java.util.Scanner;
public class DemoProgram {
   public static void main(String [] args ) { 
      
      Scanner keyboard = new Scanner(System.in);
      
      
      // Variable Declaration
      int policyNum = 0;
      String ProviderName ="";
      String holderFname = "";
      String holderLname ="";
      int holderAge = 0;
      String smokeStat = "";
      double height = 0;
      double weight = 0.0;
      double policyPrice;
      double BMI = 0.0;
      
      

      
      // Gets user info
      System.out.print("Please Enter Your Policy Number: ");
      policyNum = keyboard.nextInt();
      keyboard.nextLine();
      System.out.print("Please Enter Your Policy Provider Name: ");
      ProviderName = keyboard.nextLine();      
     
      System.out.print("Please Enter Policyholder's First Name: ");
      holderFname = keyboard.nextLine();
 
      System.out.print("Please Enter Policyholder's Last Name: ");
      holderLname = keyboard.nextLine();

      System.out.print("Please Enter Policyholder's Age: ");
      holderAge = keyboard.nextInt();
       keyboard.nextLine();

      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeStat = keyboard.nextLine();
    
      System.out.print("Please Enter Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
       keyboard.nextLine();
      System.out.print("Please Enter Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      
      // Object to pass on values to class 
      Policy p = new Policy(policyNum, ProviderName, holderFname, holderLname, holderAge, smokeStat, height, weight);
      
      
      
      
      // Prints the user enterd info and the price of the policy.
      System.out.println();
      System.out.println("Policy Number: " + p.getpolicyNum());
      
      System.out.println("Provider Name: " + p.getprovName());
      
      System.out.println("Policyholder's First Name: " + p.getholderFname());
      
      System.out.println("Policyholder's Last Name: " + p.getholderLname());
      
      System.out.println("Policyholder's Age: " + p.getholderAge());
      
      System.out.println("Policyholder's Smoking Status: " + p.getsmokeStatus());
      
      System.out.println("Policyholder's Height: " + p.getholderHeight() + " inches");
     
      System.out.println("Policyholder's Weight: " + p.getholderWeight() + " pounds");
      
      System.out.printf("Policyholder's BMI: %.2f", p.getHolderBMI());
      
      System.out.printf("\nPolicy Price: $%,.2f\n", p.getPrice());
      
      
     
         
      
      
      
       
 }
}