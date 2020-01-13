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
public class Segitiga extends Bangun_Datar{
    public void Segitiga(){
        double ls, as, ts, ss, ks;
        Scanner a = new Scanner (System.in);
        System.out.println ("SEGITIGA");
        System.out.println ("==========");
        System.out.print("Masukkan alas   : ");
        as = a.nextDouble();
        System.out.print("Masukkan tinggi : ");
        ts = a.nextDouble();
        System.out.print("MAsukkan sisi   : ");
        ss = a.nextDouble();
        ls = (as*ts)/2;
        ks = (ss*2)+as;
        System.out.println("Luas Segitiga adalah     : " +ls);
        System.out.println("Keliling Segitiga adalah : " +ks);
    }
}
