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
public class parameter {
    int x;

  public parameter(int y) {
    x = y;
  }

  public static void main(String[] args) {
    parameter myObj = new parameter(5);
    System.out.println(myObj.x);
  }
}
