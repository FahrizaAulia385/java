/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

/**
 *
 * @author WINDOWS 10
 */
public class Animal {
    public void animalSound (){
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("The pig says : wee wee");
    }
}

class Dog extends Animal{
    public void animalSound(){
        System.out.println("The dog says : bow bow");
    }
}

class MyMainClass {
    public static void main (String [] args){
        Animal myAnimal = new Animal ();
        Animal myPig = new Pig ();
        Animal myDog = new Dog ();
        
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
