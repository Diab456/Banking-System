/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banking;

/**
 *
 * @author Mohamed Diab
 */
public class SavingsAccount implements Bank_inerface {
    private double Balance;
    
    public SavingsAccount(){}

    public SavingsAccount(double Balance) {
        this.Balance = Balance;
    }
    

    
    @Override
    public void deposit(double amount) {
        Balance +=amount;
    }

    @Override
    public void withdraw(double amount) {
        if(Balance >= amount){
            Balance -=amount; 
        }else{
            System.out.println("Sorry, the account is not enough");
        }
    }

    @Override
    public double getBalance() {
        return Balance;
    }
    
}
