/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Study_Kasus_2;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class Bangun_Datar {
    public static void main (String []args){
        int pilihan;
        Lingkaran L = new Lingkaran ();
        Segitiga S = new Segitiga ();
        Persegi P = new Persegi ();
        Persegi_Panjang PP = new Persegi_Panjang ();
        
        Scanner BD = new Scanner (System.in);
        System.out.println("PILIH BANGUN DATAR");
        System.out.println("====================");
        System.out.println("1. Lingkaran ");
        System.out.println("2. Segitiga ");
        System.out.println("3. Persegi ");
        System.out.println("4. Peregi Panjang ");
        System.out.println("5. Exit ");
        System.out.println("");
        System.out.print("PILIHAN : ");
        pilihan = BD.nextInt();
        switch (pilihan){
            case 1 : L.Lingkaran();
                break;
            case 2 : S.Segitiga();
                break;
            case 3 : P.Persegi();
                break;
            case 4 : PP.Persegi_Panjang();
                break;
            case 5 : System.exit(0);
        }
    }
}
