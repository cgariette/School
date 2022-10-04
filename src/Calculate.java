/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
import java.util.Scanner;
public class Calculate {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        
        System.out.println("This is a simple calculator");
        System.out.println("\nKindly choose the operation you would like to perform out of the ones listed before:");
        System.out.println("\n1. Addition");
        System.out.println("\n2. Subtraction");
        System.out.println("\n3. Multiplication");
        System.out.println("\n4. Division");
        
        System.out.println("\nWhat operation do you want to perform");
        int choice=s.nextInt();
        
        
        
        if(choice== 1){
         addition();
        }
        else if (choice==2){
            subtraction();
        }
        else if (choice==3){
            multiplication();
        }
        else if (choice==4){
            division();
        }
        
        
        
    }
    
  
    static void addition(){
        
     Scanner s=new Scanner(System.in);
        System.out.println("please enter the first integer:");
        
       int x=s.nextInt();
       System.out.println("please enter the second interger:");
       int y=s.nextInt();
       
       int sum=x+y;
       
       System.out.println("The sum of the two integers is:"  +sum);
       
       
    }
   static void subtraction(){
        
        Scanner z= new Scanner(System.in);
        System.out.println("please enter the first integer:");
        
       int x=z.nextInt();
       System.out.println("please enter the second interger:");
       int y=z.nextInt();
       
       int sub=x-y;
       
       System.out.println("The result is:" +sub);
       
       
    }
   static void multiplication(){
        
        Scanner z= new Scanner(System.in);
        System.out.println("please enter the first integer:");
        
       int x=z.nextInt();
       System.out.println("please enter the second interger:");
       int y=z.nextInt();
       
       int mult=x*y;
       
       System.out.println("The result is:" +mult);
       
       
    }
   
   static void division(){
        
        Scanner z= new Scanner(System.in);
        System.out.println("please enter the first integer:");
        
       int x=z.nextInt();
       System.out.println("please enter the second interger:");
       int y=z.nextInt();
       
       int div=x/y;
       
       System.out.println("The result is:" +div);
       
       
    }
   
}
