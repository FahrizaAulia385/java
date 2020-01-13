/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiple_Object;

/**
 *
 * @author WINDOWS 10
 */
public class MyClass {
  int x = 5;

    public static void main(String[] args) {
        MyClass myObj1 = new MyClass();  // Object 1
        MyClass myObj2 = new MyClass();  // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x);  // Outputs 5
        System.out.println(myObj2.x);  // Outputs 25
    }
}
