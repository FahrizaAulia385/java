/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author WINDOWS 10
 */
public class mahasiswa {
    public static void main (String []args){
        List <String> mahasiswa = new ArrayList<>();
        
        mahasiswa.add (" Fahriza Aulia ");
        mahasiswa.add (" Kurniawati ");
        mahasiswa.add (" Dewi Anita ");
        mahasiswa.add (" Dewi Sukmawati ");
        
        List <Integer> nim = new ArrayList<>();
        nim.add (001);
        nim.add (002);
        nim.add (003);
        nim.add (004);
        
        System.out.println(mahasiswa);
        System.out.println(nim);
        
    }
}
