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
public class Biodata {
    public static void main (String[]args){
        long nim;
        int angkatan;
        String namadpn,alamat,jurusan,jk;
        
        Scanner input = new Scanner (System.in);// membuat object dari C
       
        System.out.println("===============================");
        System.out.println("         Biodataku");
        System.out.println("===============================");
        
        System.out.print("Nama            : ");
        namadpn = input.nextLine();
        System.out.print("Alamat          : ");
        alamat = input.nextLine();
        System.out.print("Jurusan         : ");
        jurusan = input.nextLine();
        System.out.print("Jenis Kelamin   : ");
        jk = input.nextLine();
        System.out.print("Nim             : ");
        nim = input.nextLong();
        System.out.print("Angkatan        : ");
        angkatan = input.nextInt();
        
        System.out.println("===============================");
        System.out.println("           Selamat");
        System.out.println("===============================");
        
        System.out.println("Nim Saya            :" +nim);//mencetak output
        System.out.println("Nama Saya           :" +namadpn);
        System.out.println("Alamat Saya         :" +alamat);
        System.out.println("Jurusan Saya        :" +jurusan);
        System.out.println("Angkatan Saya       :" +angkatan);
        System.out.println("Jenis Kelamin Saya  :" +jk);
        
        
    }
}
