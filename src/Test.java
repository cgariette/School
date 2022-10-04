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
public class Test {
    public static void main(String args []){
        
        Scanner s=new Scanner(System.in);
        
        String boy,girl;
        int x,y;
        System.out.println("Please enter the boy's name:");
        boy=s.nextLine();
        System.out.println("Please enter the girl's name:");
        girl=s.nextLine();
        System.out.println("Please enter the boy's age");
        x=s.nextInt();
        System.out.println("please enter the girl's age:");
        y=s.nextInt();
        
        System.out.println(boy + "is" +x + "years old while" +girl +"is" +y +"years old"  );
        
        
    }
    }

