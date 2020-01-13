/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudyKasus;

/**
 *
 * @author WINDOWS 10
 */
public class AlatMusik {
      public void Sound (){
        System.out.println("Suara Alat Musik");
    }
}

class Gitar extends AlatMusik{
    public void Sound(){
        System.out.println("Suara Gitar : Jreng Jreng Jreng");
    }
}

class Drum extends AlatMusik{
    public void Sound(){
        System.out.println("Suar Drum   : Dum Dum Dum");
    }
}

class MyMainClass {
    public static void main (String [] args){
        AlatMusik myMusik = new AlatMusik ();
        AlatMusik myGitar = new Gitar ();
        AlatMusik myDrum = new Drum ();
        
        myMusik.Sound();
        myGitar.Sound();
        myDrum.Sound();
    }
}
