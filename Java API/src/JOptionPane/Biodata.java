/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JOptionPane;

import javax.swing.JOptionPane;

/**
 *
 * @author WINDOWS 10
 */
public class Biodata {
    public static void main (String []args){
        String nama, alamat, jurusan;//variabel string untuk menyimpan input
        //memunculkan pesan dialog 
        nama = JOptionPane.showInputDialog("Siapa Nama Kamu ?");
        alamat = JOptionPane.showInputDialog("Diamana Alamat Kamu ?");
        jurusan = JOptionPane.showInputDialog("Apa Jurusan Kamu ?");
        //menampilkan pesan kepada user 
        JOptionPane.showMessageDialog(null, "Salam Kenal"+nama +alamat +jurusan);
    }
}
