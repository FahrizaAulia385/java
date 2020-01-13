/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumInASwitchStatement;

/**
 *
 * @author WINDOWS 10
 */
enum level{
    LOW,MEDIUM,HIGH
}
public class MainClass {
    public static void main(String [] args){
        level myVar = level.MEDIUM;
        
        switch (myVar){
            case LOW :
                System.out.println ("Low Level");
                break;
            case MEDIUM :
                System.out.println ("Medium Level");
                break;
            case HIGH :
                System.out.println ("High Level");
                break;
        }
    }
}
