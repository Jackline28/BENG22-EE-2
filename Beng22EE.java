1/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beng22ee;

import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Beng22EE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Classes
        DIT di=new DIT();
        Scanner sc=new Scanner(System.in);
        
        //User interface
        System.out.println("Enter the 1st number : \n");
        di.x=sc.nextInt();
        System.out.println("Enter the 2nd number : \n");
        di.y=sc.nextInt();
        
        //User's choice interface
        int choice;
        choice=1;
           System.out.println("""
                              Enter Choice based on the following : 
                              1: Summation 
                              2: Substraction""");
        while(choice<2){
            System.out.println("Enter Choice \n");
            choice=sc.nextInt();
                
                 switch(choice){
                     case 1:
                         //Addition Output
                         di.add();
                         break;
                         
                     case 2:
                         //Substraction Output
                         di.sub();
                         break;
                 }
                 choice++;
        }
    }
    
}
