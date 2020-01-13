/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;
import java.util.HashMap;
/**
 *
 * @author MASTER-PC
 */
public class Example {
      public static void main(String[] args) {

    HashMap<String, Long> people = new HashMap<String, Long>();

    people.put("Fahriza", 201869040030L);
    people.put("Aulia", 201869040028L);
    people.put("irfan", 2018690400331L);

    for (String i : people.keySet()) {
      System.out.println("Name: " + i +" >> "+" NIM: " + people.get(i));
    }
  }  
}
