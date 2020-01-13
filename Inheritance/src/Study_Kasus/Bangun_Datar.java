/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Study_Kasus;

/**
 *
 * @author WINDOWS 10
 */
public class Bangun_Datar extends Vehicle{
    private String Rumus = " Lingkaran       = Phi * r * r \n"
                         + " Persegi Panjang = P * L \n"
                         + " Segitiga        = A * T / 2 \n"
                         + " Persegi         = S * S";
    public static void main (String [] args){
       Bangun_Datar MTK = new Bangun_Datar();
       
       MTK.bangun_datar();
       
       System.out.println ();
       System.out.println (MTK.Tema );
       System.out.println (MTK.Rumus);
    }
}
