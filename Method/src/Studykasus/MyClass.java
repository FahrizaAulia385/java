/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Studykasus;

/**
 *
 * @author WINDOWS 10
 */
public class MyClass {
     // Create a fullThrottle() method
  public void Name() {
    System.out.println("Fahriza Aulia");
  }

  // Create a speed() method and add a parameter
  public void age(int age) {
    System.out.println("Umur saya: " + age);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    MyClass Bio = new MyClass();     // Create a myCar object
    Bio.Name();      // Call the fullThrottle() method
    Bio.age(19);          // Call the speed() method
  }
}
