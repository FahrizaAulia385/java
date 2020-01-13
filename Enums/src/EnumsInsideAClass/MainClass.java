/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumsInsideAClass;

/**
 *
 * @author WINDOWS 10
 */
public class MainClass {
    enum level {
        LOW, MEDIUM, HIGH 
    }
    
    public static void main (String [] args){
        level myVar = level.MEDIUM;
        System.out.println(myVar);
    }
}
