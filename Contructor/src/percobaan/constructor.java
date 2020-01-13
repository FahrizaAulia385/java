/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author WINDOWS 10
 */
public class constructor {
    int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public constructor() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    constructor myObj = new constructor(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}
