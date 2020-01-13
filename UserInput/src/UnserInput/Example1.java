/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnserInput;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class Example1 {
    public static void main (String [] args){
        Scanner myObj = new Scanner (System.in);
        System.out.println ("Enter Username");
        
        String username = myObj.nextLine();
        System.out.println ("Username is : " +username);
    }
}
