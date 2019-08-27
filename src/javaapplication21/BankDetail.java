/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class BankDetail {
    
    private final int Endprogram = 10;
    private Account AccountChecking;
    private Account Accountsaving;
    private Scanner Raj;
    
    public BankDetail(){
    Raj = new Scanner(System.in);
    
  
    Accountsaving = new Account("Saldin", "987654321", 30000.00);
   
    
}
    public void displaymenu(){
        
        int response = 0;
        while(response != Endprogram){
          System.out.println("1: deposit");
          System.out.println("2: Withdraw");
          System.out.println("3: See all transaction");
          System.out.println("4: check balance");
          System.out.println("5:exit");
          System.out.println("enter the menu option:");
          response = Raj.nextInt();
          MenuSelected(response);
        }
    }
    private void MenuSelected(int PResponse){
        
        double depositamount = 0.0;
        double withdrawamount = 0.0;
        String reason = "";
        switch(PResponse){
            
            case 1:
                System.out.println("Enter the amount deposit:");
                depositamount = Raj.nextDouble();
                while(depositamount<0.0){
                    System.out.println("Enter ammount: ");
                    depositamount = Raj.nextDouble();
                }
                Accountsaving.deposit(depositamount);
                break;
                
            case 2:
                    System.out.println("Enter the withdraw:");
                    withdrawamount = Raj.nextDouble();
                    while(withdrawamount<0.0){
                        System.out.println("enter biggest amount:");
                        withdrawamount = Raj.nextDouble();
                    }
                    
                    String clearendline = Raj.nextLine();
                    System.out.println("enter withdraw reason : ");
                    reason = Raj.nextLine();
                    Accountsaving.withdraw(withdrawamount , reason);
                    break;
                             
            case 3:
                                 Accountsaving.displayLedgerEntry();
                                 break;
                                 
            case 4:
                                System.out.println("your balance:");
                                System.out.println(Accountsaving.getcurrent_amount());
                                  break;
                                  
            case 5:
                System.out.println("thanks for using");
                break;
                                  
            default:
                                  System.out.println("Wrong way");
                        break;
                    
                    
        }
        
    }
    
    public static void main(String[] args){
        BankDetail bank = new BankDetail();
        bank.displaymenu();
    }
}
