/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WINDOWS 10
 */
public class construktors {
    long modelNim;
    String modelNama;
    String modelAlamat;
    String modelJurusan;
    int modelAngkatan;
    
    public construktors (){
       modelNim = 201869040030l ;
       modelNama = "Fahriza Aulia";
       modelAlamat = "Garman Sekarmojo";
       modelJurusan = "Teknik Informatika";
       modelAngkatan = 2018;
    }

    public static void main (String [] args){
        construktors data = new construktors () ;
        System.out.println("Nim       = "+data.modelNim );
        System.out.println("Nama      = "+data.modelNama );
        System.out.println("Alamat    = "+data.modelAlamat );
        System.out.println("Jurusan   = "+data.modelJurusan );
        System.out.println("Angkatan  = "+data.modelAngkatan );
    }
}
