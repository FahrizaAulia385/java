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
public class Biodata {
    public static void main (String []args){
        //membuat object dari class BufferedReader 
        BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
        String nim, nama, alamat, jurusan,angkatan, jk;
        try {
            System.out.println("===============================");
            System.out.println("         Biodataku");
            System.out.println("===============================");
            
            System.out.print("Nim             : ");
            nim = input.readLine();
            System.out.print("Nama            : ");
            nama = input.readLine();
            System.out.print("Alamat          : ");
            alamat = input.readLine();
            System.out.print("Jurusan         : ");
            jurusan = input.readLine();
            System.out.print("Angkatan        : ");
            angkatan = input.readLine();
            System.out.print("Jenis Kelamin   : ");
            jk = input.readLine();
            
            System.out.println("===============================");
            System.out.println("           Selamat");
            System.out.println("===============================");
            
            System.out.println("Nim    : "+ nim);
            System.out.println("Nama   : "+ nama);
            System.out.println("Nama   : "+ alamat);
            System.out.println("Nama   : "+ jurusan);
            System.out.println("Nim    : "+ angkatan);
            System.out.println("Nama   : "+ jk);//cetak
        }catch(IOException ex){
            //jika terdapat kesalahan saat menginputkan data
            System.out.println("Terjadi Kesalahan Pada Input");
        }
    }
}
