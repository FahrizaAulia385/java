/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author WINDOWS 10
 */
public class myClass3 {
    public static void main(String[] args) {  
        LocalDateTime myDateObj = LocalDateTime.now();  
        System.out.println("Before Formatting: " + myDateObj);  
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");  

        String formattedDate = myDateObj.format(myFormatObj);  
        System.out.println("After Formatting: " + formattedDate);  
  } 
}
