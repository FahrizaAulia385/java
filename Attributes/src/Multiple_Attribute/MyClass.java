/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Multiple_Attribute;

/**
 *
 * @author WINDOWS 10
 */
public class MyClass {
  String fname = "John";
  String lname = "Doe";
  int age = 24;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
