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
public class Contoh {
    public static void main (String []args){
        String nama;//variabel string untuk menyimpan input
        //memunculkan pesan dialog 
        nama = JOptionPane.showInputDialog("Siapa Nama Kamu ?");
        //menampilkan pesan kepada user 
        JOptionPane.showMessageDialog(null, "Salam Kenal"+nama);
    }
}
