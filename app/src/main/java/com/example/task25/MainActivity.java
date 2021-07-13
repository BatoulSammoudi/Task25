package com.example.task25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView infoText ;
    BankAccount user ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        infoText=findViewById(R.id.infoText) ;
        user= new BankAccount() ;
        BankAccount client = new BankAccount(5000,432) ;
        infoText.setText("this user account number is   " + user.getAccountNum() + "  number of users for this bank is : " + BankAccount.counter +
        "  total money for this client is : " + client.totalMoney() + "  if user wanted to deposit in save account " + client.deposit("save" , 56.34) +
        " and if deposit in check account " + client.deposit("check" , 56.12) + " now total money is  : " + client.totalMoney() +
                " if user wanted to withdraw 5000 from his account " + client.withdraw(500000) + " if wanted to withdraw 40 " + client.withdraw(40) );
    }

}