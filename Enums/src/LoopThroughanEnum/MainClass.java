/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoopThroughanEnum;

/**
 *
 * @author WINDOWS 10
 */
   enum level{
   Fahriza,Aulia,informatika
}
public class MainClass {
    
    public static void main(String [] args){
       // level myVar = level.MEDIUM;
        
        for (level myVar : level.values()){
            System.out.println (myVar);
        }
    }
}
