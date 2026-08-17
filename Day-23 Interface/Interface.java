 interface account {
   
     void deposit();
     void checkbalance();
     void withdraw();
    } 

 class bank implements account {
   
      public void deposit(){
      System.out.println("\nAmount deposited");
    }
   
      public void checkbalance(){
      System.out.println("Checking balance..\n");
    }
   
      public void withdraw(){
      System.out.println("Amount withdrawn");
        
    }
}

  public class Interface {
    
    public static void main(String [] args){
      
       bank b = new bank();
      
        b.deposit();
        b.withdraw();
        b.checkbalance();
    }
}
