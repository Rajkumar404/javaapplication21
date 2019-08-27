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
public class LedgerEntry {
    
    private String reason;
    private double amount;
    private double depositewithdrawamount;
    private String entrytype;
    
    public LedgerEntry(){
        
        entrytype = "";
        reason = "";
        amount = 0.0;
        depositewithdrawamount = 0.0;
    }
    
    public void addEntry(String xentrytype, String xreason,double xdepositewithdrawamount, double xcurrent_amount){
        
        entrytype = xentrytype;
        reason = xreason;
        depositewithdrawamount = xdepositewithdrawamount;
        amount = xcurrent_amount;
    }
    public void displayEntry(){
        System.out.println("===");
        System.out.println("entry type:" + entrytype);
        if (reason!=null){
        System.out.println("Reason: "+ reason);   
    }
        System.out.printf("amount: $%.2f \n", depositewithdrawamount);
        System.out.printf("currentAmount: $%.2f\n", amount);
        System.out.printf("=====");
    }

   
}
