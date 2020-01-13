/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultipleInterface;

/**
 *
 * @author WINDOWS 10
 */
interface FirstInterface {
   public void method ();
}

interface SoundInterface {
    public void myOtherMethod();
}

class Demo implements FirstInterface, SoundInterface{
    public void method (){
        System.out.println("Some text ...");
    }
    public void myOtherMethod(){
        System.out.println("Some Other Text");
    }
}

class Main {
    public static void main (String [] args){
        Demo myObj = new Demo ();
        myObj.method();
        myObj.myOtherMethod();
    }
}
