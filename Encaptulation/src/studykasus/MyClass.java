/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studykasus;

/**
 *
 * @author WINDOWS 10
 */
public class MyClass {
    public String name; // private = restricted access
    
    // Getter
    public String getName() {
    return name;
    }
    
    // Setter
    public void setName(String newName) {
    this.name = newName;
  }
}
class saya{
    public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.setName("Fahriza"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}
