/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getandset;

/**
 *
 * @author WINDOWS 10
 */
public class Person {
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
