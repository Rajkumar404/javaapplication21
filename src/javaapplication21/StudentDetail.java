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
public class StudentDetail {
    
    public static void main(String[] args){
        

      // ask no of student increase typr code  
      System.out.println("type no of student list:");
      Scanner obj = new Scanner(System.in);
      int numberofstudents = obj.nextInt();
      Student[] students = new Student[numberofstudents];
      
      
      //create no of students  
      
      for(int i=0; i<numberofstudents; i++){
      students[i] = new Student();
      students[i].rollno();
      students[i].paytution();
      System.out.println("STUDENT DETAILS:");
      System.out.println(students[i].toString());
      
      }
    }
    
}


//maths using method


/*  double raj1;
        double raj2;
        String operations;
        
        Scanner xraj1 = new Scanner(System.in);
        Scanner yraj2 = new Scanner(System.in);
        Scanner zoperations = new Scanner(System.in);
        
        
        while(true){
            System.out.println("first number: ");
            raj1 = xraj1.nextDouble();
            System.out.println("second number:");
            raj2 = yraj2.nextDouble();
            System.out.println("operations:(+,-,*,/):");
           operations = zoperations.next();
            
            
            if (operations.equals("+"))
                System.out.println(raj1 + raj2);
            else if(operations.equals("-"))
                    System.out.println(raj1 - raj2);
            else if(operations.equals("*"))
                    System.out.println(raj1 * raj2);
            else if(operations.equals("/"))
                    System.out.println(raj1 / raj2);
            else
                System.out.println("End of process:)");
        }*/