/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;


/**
 *
 * @author DELL
 */
public class Account {
    
    private String name;
    private String account_no;
    private double current_amount;
    private LedgerEntry[] accountLedger;
  
    
    private int ledgerEntrycount;
    private final int Max_Entries = 50;
    
    public Account(){
        name = "";
        account_no = "";
        current_amount = 0.0;
        ledgerEntrycount = 0;
        initLedger();
    }
    
    public Account(String xname, String yAccnum, double zamount){
        name = xname;
        account_no = yAccnum;
        current_amount = zamount;
        ledgerEntrycount = 0;
        initLedger();
    }
    
    private void initLedger(){
        
        accountLedger = new LedgerEntry[Max_Entries];
  
        accountLedger[ledgerEntrycount] = new LedgerEntry();
        accountLedger[ledgerEntrycount].addEntry("deposite", "initledger", 0.0, 0.0);
        ledgerEntrycount +=1;
    }
    
    public void deposit(double xdepositAmount){
        
        current_amount = current_amount + xdepositAmount;
        accountLedger[ledgerEntrycount]= new LedgerEntry();
        accountLedger[ledgerEntrycount].addEntry("deposite",null,xdepositAmount,current_amount);
        ledgerEntrycount +=1;
    }
    public void withdraw(double ywithdrawamount, String PReason){
        current_amount = current_amount - ywithdrawamount;
        accountLedger[ledgerEntrycount]= new LedgerEntry();
        accountLedger[ledgerEntrycount].addEntry("withdraw1", PReason, ywithdrawamount, current_amount);
    }
    
    public void displayLedgerEntry(){
        System.out.println("Account name:" + getname());
        System.out.println("Account number:"+ getaccount_no());
        System.out.println("======");
        
        for(int i =0; i<ledgerEntrycount; i++){
            accountLedger[i].displayEntry();
        }
        System.out.println("=====");
        
    }
    public String getname()
    {
       return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public String getaccount_no(){
        return account_no;
    }
    public void setaccount_no(String account_no){
        this.account_no = account_no;
    }
    public double getcurrent_amount(){
        return current_amount;
    }
    public void setcurrent_amount(double current_amount){
        this.current_amount = current_amount;
    }
   
}