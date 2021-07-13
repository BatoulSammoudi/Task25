package com.example.task25;

import android.widget.Toast;

import java.util.Random;

public class BankAccount {
    private String accountNum;
    private double checkBalance;
    private double saveBalance;
    static int counter = 0;
    static double moneyAmount =0 ;

    public BankAccount( double checkBalance, double saveBalance) {
        this.accountNum = random();
        this.checkBalance = checkBalance;
        this.saveBalance = saveBalance;
        counter++;
    }

    public BankAccount() {
        this.accountNum=random() ;
        counter++;
    }

    public String getAccountNum() {
        return accountNum;
    }

    private void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public double getCheckBalance() {
        return checkBalance;
    }

    private void setCheckBalance(double checkBalance) {
        this.checkBalance = checkBalance;
    }

    public double getSaveBalance() {
        return saveBalance;
    }

    private void setSaveBalance(double saveBalance) {
        this.saveBalance = saveBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNum='" + accountNum + '\'' +
                ", checkBalance=" + checkBalance +
                ", saveBalance=" + saveBalance +
                '}';
    }
    private String random(){
        Random randomNumber = new Random() ;
        int number = randomNumber.nextInt(999999999);
        return String.format("%10d", number) ;

    }
    public double totalMoney() {
        return this.moneyAmount+=this.saveBalance +this.checkBalance ;
    }
    public double deposit (String balance , double amount ){
        if ( balance.equals("check")) {
            this.checkBalance+=amount;
            return this.checkBalance ;
        }
        else if (balance.equals("save")) {
            this.saveBalance+=amount ;
            return this.saveBalance ;
        }
        else {
            return 0.0;
        }
    }
    public boolean withdraw (double amount ) {
        if ( amount>moneyAmount ) {
           return false ;
        }
        else
            moneyAmount-=amount ;
            return true ;
    }

}
