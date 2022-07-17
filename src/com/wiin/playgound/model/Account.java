package com.wiin.playgound.model;

public class Account {
    private int balance;
    
    public Account(int balance){
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public void transfer(int amount){
        balance = balance - amount;
    }
}
