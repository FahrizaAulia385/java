/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstrac;

/**
 *
 * @author WINDOWS 10
 */
abstract class suarahati {
    // Abstract method (does not have a body)
  public abstract void hatiSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class sakit extends suarahati {
  public void hatiSound() {
    // The body of animalSound() is provided here
    System.out.println("hati yang menangis: hihiihii");
  }
}

class MyClass {
  public static void main(String[] args) {
    sakit mysakit = new sakit(); // Create a Pig object
    mysakit.hatiSound();
    mysakit.sleep();
  }
}
