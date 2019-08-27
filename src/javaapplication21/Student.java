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
public class Student {
    
    private String firstname;
    private String lastname;
    private int grade_year;
    private String StudentID;
    private String courses = "MECHNIACL";
    private int feesbalance;
    private int cost_of_course = 5000;
    private static int id = 9999;
    
   
    public Student(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First name: ");
        this.firstname = obj.nextLine();
        
        System.out.println("Enter last name: ");
        this.lastname = obj.nextLine();
        System.out.println("Category of students class level:)");
        System.out.println("1:MECHANICAL\n2:CIVIL\n3:ELECTRICAL\n4:COMPUTER\nEnter student class level:");
        this.grade_year = obj.nextInt();
        
        
        setStudentID();   
    }
    
    private void setStudentID(){
        id++;
        this.StudentID = grade_year + "" + id; 
    }
    public void rollno(){
        
        do{
        System.out.print("Enter name of subject and marks:(E for EXIT:)");
        Scanner obj = new Scanner (System.in);
        String course = obj.nextLine();
        if(!course.equals("E")){
            courses = courses +"\n" + course;
            feesbalance = feesbalance + cost_of_course;
        }
        else{
            break;
        }
        }while(1 != 0);
       
    }
     
    public void displaybalance(){
        System.out.println("your balance is: $" + cost_of_course);
    }
    public void paytution(){
        displaybalance();
        System.out.println("Enter you amount $");
        Scanner obj = new Scanner (System.in);
        int payment = obj.nextInt();
        cost_of_course = cost_of_course - payment;
        System.out.println("Thanks for paying fees $" + payment);
        displaybalance();
    }
   
    
    public String toString(){
        return"Name: " + firstname + "" + lastname +"\nGRADE: " + grade_year 
                +"\nStudentID: " + StudentID +"\nBranch Name: " + courses +"\nBalance: " + cost_of_course;
                
    }
    
    
}
