/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.banking;

/**
 *
 * @author Mohamed Diab
 */
public class Banking {

    public static void main(String[] args) {
        
        SavingsAccount s = new SavingsAccount();
        s.deposit(15000);
        System.out.println("Savings Account Balance: " + s.getBalance()+ " $ ");
        s.withdraw(2000);
        System.out.println("Savings Account Balance after withdrawal: " + s.getBalance()+ " $ ");
        
        System.out.println(" ");
        
       CheckingAccount c = new CheckingAccount();
       c.deposit(7120.250);
       System.out.println("Checking Account Balance: " + c.getBalance()+ " $ ");
       c.withdraw(50.20);
       System.out.println("Checking Account Balance: " + c.getBalance()+ " $ ");

       
       
       
       
        
        
    }
}
