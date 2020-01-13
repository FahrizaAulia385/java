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
public class Lingkaran extends Bangun_Datar{
    public void Lingkaran (){
        double rl, ll, kl, phi = 3.14;
        Scanner b = new Scanner (System.in);
        System.out.println("LINGKARAN");
        System.out.println("==========");
        System.out.print("Masukkan Jari-Jari :");
        rl = b.nextDouble();
        ll = phi*rl*rl;
        kl = 2*phi*rl;
        System.out.println("Luas Lingkaran adalah     : " +ll);
        System.out.println("Keliling Lingkaran adalah : " +kl);
    }
}
