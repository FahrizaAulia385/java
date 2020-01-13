/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayCurrentDateandTime;

import java.time.LocalDateTime;

/**
 *
 * @author WINDOWS 10
 */
public class MyClass {
    public static void main (String [] args){
        LocalDateTime myObj = LocalDateTime.now();
        System.out.println(myObj);
    }
}
