
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here
        
        // Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance. NB! Perform all the operations in this exact order.
        
        Account myAccount = new Account("Pete's Account", 100);
        
        myAccount.deposit(20);
        
        System.out.println(myAccount.toString());
        
    }
}
