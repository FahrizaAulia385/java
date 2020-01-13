/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author WINDOWS 10
 */
public class contoh {
    public static void main (String []args){
        //membuat object dari class BufferedReader 
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        String Universitas;
        try {
            System.out.print("Masukkan Universiatas : ");
            Universitas = input.readLine();//Mendapatkan Input String
            System.out.println("Saya Kuliah Di "+ Universitas);//cetak
        }catch(IOException ex){
            //jika terdapat kesalahan saat menginputkan data
            System.out.println("Terjadi Kesalahan Pada Input");
        }
    }
}
