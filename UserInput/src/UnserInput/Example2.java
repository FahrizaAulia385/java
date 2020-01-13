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
public class Example2 {
    public static void main (String [] args ){
        Scanner myObj = new Scanner (System.in);
        
        System.out.println("Enter name, age and salary");
        
        //String input 
        String name = myObj.nextLine();
        
        //Numerik Input
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();
        
        //Output input by user
        System.out.println("Name    : "+name);
        System.out.println("Age     : "+age);
        System.out.println("Salary  : "+salary);
    }
}
