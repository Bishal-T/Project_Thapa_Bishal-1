public class Policy{
      
      // Fields
      private int policyNumber;
      private String providerName;
      private String holdersFirst;
      private String holderLast;
      private int holderAge;
      private String holderSmokeStatus;
      private double holderHeight;
      private double holderWeight; 
      private double policyPrice = 600;
      private double bodymassIndex;
  
   
   
   
      /**
      Constructor 
      @param polNumber The policy Number
      @param proName The policy provider name
      @param nameFirst Holder's first name
      @param nameLast Holder's last name 
      @param age Holder's age 
      @param smokerStatus Holder's smokes status
      @param Height Holder's height 
      @param Weight Holders's height 
      
      **/
      public Policy (int polNumber, String proName, String nameFirst, String nameLast, int age, String smokerStatus, double Height, double Weight) {
         
         policyNumber = polNumber;
         providerName = proName;
         holdersFirst = nameFirst;
         holderLast = nameLast;
         holderAge = age;
         holderSmokeStatus = smokerStatus;
         holderHeight = Height;
         holderWeight = Weight;
   
   
     }
     // Return policy number 
     public int getpolicyNum() {
      
         return policyNumber;
     }
     // Returns provider name
     public String getprovName() {
     
         return providerName; 
     }
     // Returns first name of holder
     public String getholderFname() {
         
         return holdersFirst;
     }
     // Returns last name of holder
     public String getholderLname() {
     
        return holderLast;
     }
     // Returns holder age
     public int getholderAge() {
      
         return holderAge;
     }
     // Returns the smoker status of holder
     public String getsmokeStatus() {
     
         return holderSmokeStatus;
     }
     // Returns the Height of holder
     public double getholderHeight() {
     
         return holderHeight;
     }
     // Returns the weight of holder
     public double getholderWeight() {
     
         return holderWeight;
     }
      // Calculates the holder's body mass index and returns it 
      public double getHolderBMI() {
         
         bodymassIndex = holderWeight * 703  / Math.pow(holderHeight,2);
         return bodymassIndex;
         
     }
     // Adds fees to policy price and returns the total policy price.
     public double getPrice() {
             
          final double FEE_OVER_50 = 70;
          final double FEE_IF_SMOKER = 100;
       
             
          if(holderAge > 50) {
          
            policyPrice += 75;
         }
          if(holderSmokeStatus.equalsIgnoreCase("smoker")) {
            
            policyPrice += 100;
         }
          if (bodymassIndex > 35) {
           
             policyPrice += (bodymassIndex - 35) * 20;
         }
         else {
         
             policyPrice = 600;                 
         }

       return policyPrice;
 }
}
   
  
   

