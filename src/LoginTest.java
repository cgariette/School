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
public class LoginTest {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        String un;
        String pw;
        
        System.out.println("Please enter your username:");
        un=scanner.nextLine();
        System.out.println("Please enter your password:");
        pw=scanner.nextLine();
        
        if(un=="Cgariette" && pw=="19708363Ac."){
        System.out.println("Login successful");
    }
        else{
            System.out.println("Please input the right username or password");
            
        }
        
    }
}
