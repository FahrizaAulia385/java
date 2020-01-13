/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author WINDOWS 10
 */
public class Car extends Vehicle {
    private String modelName = "Mustang";
    public static void main (String [] args){
        
        Car myCar = new Car() ;
        
        myCar. honk();
        
        System.out.println (myCar.brand + " " + myCar.modelName);
    }
}
