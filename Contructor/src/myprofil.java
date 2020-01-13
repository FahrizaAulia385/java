/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class myprofil {
    long modelNim;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    int modelAngkatan;
    
    public myprofil(long Nim, String Nama, String Alamat, String Jurusan, int Angkatan){
        modelNim = Nim;
        modelNama = Nama;
        modelAlamat = Alamat;
        modelJurusan = Jurusan;
        modelAngkatan = Angkatan;
    }

    public static void main (String [] args){
        myprofil data = new myprofil(201869040030l , "Fahriza Aulia", "Garman Purwosari","Teknik Informatika", 2018);
        System.out.println("Nim       = " + data.modelNim );
        System.out.println("Nama      = " + data.modelNama );
        System.out.println("Alamat    = " + data.modelAlamat );
        System.out.println("Jurusan   = " + data.modelJurusan );
        System.out.println("Angkatan  = " + data.modelAngkatan );
    }
}
