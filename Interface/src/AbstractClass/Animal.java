/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractClass;

/**
 *
 * @author WINDOWS 10
 */
interface Manusia{
    public void SuaraManusia();
    public void sleep ();
}

class Perempuan implements Manusia{
    public void SuaraManusia(){
        System.out.println ("Suara Perempuan : waaa waaa");
    }
    public void sleep (){
        System.out.println("Zzzz");
    }
}

class MainClass{
    public static void main (String []args ){
        Perempuan myperempuan = new Perempuan();
        myperempuan.SuaraManusia();
        myperempuan.sleep();
    }
}

