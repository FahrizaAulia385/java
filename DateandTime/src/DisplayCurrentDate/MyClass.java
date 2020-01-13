/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayCurrentDate;

import java.time.LocalDate;

/**
 *
 * @author WINDOWS 10
 */
public class MyClass {
    public static void main (String []args){
        LocalDate myObj = LocalDate.now();//creeat a date object
        System.out.println(myObj);//Display the current date
    }
}
