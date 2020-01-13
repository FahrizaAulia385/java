/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class contoh {
    public static void main (String []args){
        Scanner input = new Scanner (System.in) ;
        String nama;
        System.out.println("Siapa Nama Kamu");
        nama = input.nextLine();
        System.out.println ("Nama Saya " + nama);
    }
}
