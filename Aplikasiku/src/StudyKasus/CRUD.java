/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author WINDOWS 10
 */
public class CRUD {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/minuman";
    static final String USER = "root";
    static final String PASS = "";

    static Connection conn;
    static Statement stmt;
    static ResultSet rs;

    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    
    
    static void showMenu() {
    System.out.println("\n========= MENU UTAMA =========");
    System.out.println("1. Insert Data");
    System.out.println("2. Show Data");
    System.out.println("3. Edit Data");
    System.out.println("4. Delete Data");
    System.out.println("0. Keluar");
    System.out.println("");
    System.out.print("PILIHAN> ");

    try {
        int pilihan = Integer.parseInt(input.readLine());

        switch (pilihan) {
            case 0:
                System.exit(0);
                break;
            case 1:
                insertminuman_dingin();
                break;
            case 2:
                showData();
                break;
            case 3:
                updateminuman_dingin();
                break;
            case 4:
                deleteminuman_dingin();
                break;
            default:
                System.out.println("Pilihan salah!");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    static void showData() {
        String sql = "SELECT * FROM minuman_dingin";
        try {
            rs = stmt.executeQuery(sql);

            System.out.println("+--------------------------------+");
            System.out.println("|      DATA MINUMAN DINGIN       |");
            System.out.println("+--------------------------------+");
            while (rs.next()) {
                int Id_minuman = rs.getInt("Id_minuman");
                String Nama_perusahaan = rs.getString("Nama_perusahaan");
                String Nama_minuman = rs.getString("Nama_minuman");
                String Jenis_minuman = rs.getString("Jenis_minuman");
                String Rasa = rs.getString("Rasa");

                System.out.println(String.format("%d. %s - %s - %s --  (%s) ", Id_minuman, Nama_perusahaan, Nama_minuman, Jenis_minuman, Rasa));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void insertminuman_dingin() {
        try {
            // ambil input dari user
            System.out.print("Id_Minuman        : ");
            int Id_minuman = Integer.parseInt(input.readLine());
            System.out.print("Nama_Perusahaan   : ");
            String Nama_perusahaan = input.readLine().trim();
            System.out.print("Nama_Minuman      : ");
            String Nama_minuman = input.readLine().trim();
            System.out.print("Jenis_Minuman     : ");
            String Jenis_minuman = input.readLine().trim();
            System.out.print("Rasa              : ");
            String Rasa = input.readLine().trim();

            // query simpan
            String sql = "INSERT INTO minuman_dingin(Id_minuman,Nama_perusahaan,Nama_minuman,Jenis_minuman, Rasa) VALUE(%d,'%s','%s','%s','%s')";
            sql = String.format(sql,Id_minuman,Nama_perusahaan,Nama_minuman,Jenis_minuman,Rasa);

            // simpan buku
            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void updateminuman_dingin() {
        try {  
            // ambil input dari user
            System.out.print("Id yang mau di edit    : ");
            int Id_minuman = Integer.parseInt(input.readLine());
            System.out.print("Nama_perusahaan        : ");
            String Nama_perusahaan = input.readLine().trim();
            System.out.print("Nama_minuman           : ");
            String Nama_minuman = input.readLine().trim();
            System.out.print("Jenis_minuman          : ");
            String Jenis_minuman = input.readLine().trim();
            System.out.print("Rasa                   : ");
            String Rasa = input.readLine().trim();

            // query update
            String sql = "UPDATE minuman_dingin SET Nama_perusahaan='%s', Nama_minuman='%s', Jenis_minuman='%s', Rasa='%s' WHERE Id_minuman=%d";
            sql = String.format(sql,Nama_perusahaan, Nama_minuman, Jenis_minuman, Rasa, Id_minuman);

            // update data buku
            stmt.execute(sql);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    static void deleteminuman_dingin() {
        try {

            // ambil input dari user
            System.out.print("ID yang mau dihapus: ");
            int Id_minuman = Integer.parseInt(input.readLine());

            // buat query hapus
            String sql = String.format("DELETE FROM minuman_dingin WHERE Id_minuman=%d", Id_minuman);
            // hapus data
            stmt.execute(sql);

            System.out.println("Data telah terhapus...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        try {
            // register driver
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();

            while (!conn.isClosed()) {
                showMenu();
            }

            stmt.close();
            conn.close();

        } catch (Exception e) {
        e.printStackTrace();
        }

    }
}
