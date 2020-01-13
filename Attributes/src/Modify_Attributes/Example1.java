/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modify_Attributes;

/**
 *
 * @author WINDOWS 10
 */
public class Example1 {
     final int x = 10;

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}
