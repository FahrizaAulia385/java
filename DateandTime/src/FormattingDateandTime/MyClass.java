/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormattingDateandTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author WINDOWS 10
 */
public class MyClass {
    public static void main (String [] args){
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting : "+myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting : "+formattedDate);
    }
}
