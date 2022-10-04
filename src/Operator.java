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
public class Operator {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first integer:");
        int x=scanner.nextInt();
        System.out.println("Please enter the operator(+,-,*,/):");
        char char1=scanner.next().charAt(0);
        System.out.println("Please enter the second integer:");
        int y=scanner.nextInt();
        
        if(char1=='+'){
            int sum=x+y;
            System.out.println("The sum of the two integers is:" +sum);
        }
        else if(char1=='-'){
            int sub=x-y;
            System.out.println("The result of subtracting the two integers is:" +sub);
        }
            else if(char1=='*'){
            int mul=x*y;
            System.out.println("The result of multiplying the two integers is:" +mul);
        }
        else if(char1=='/'){
            int div=x/y;
            System.out.println("The result of dividing the two integers is:" +div);
        }
            }
    
    }
    
    

