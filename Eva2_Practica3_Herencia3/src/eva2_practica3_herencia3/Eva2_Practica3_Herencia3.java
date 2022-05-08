/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica3_herencia3;

/**
 *
 * @author tovar
 */
public class Eva2_Practica3_Herencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal = new Animal();
        animal.mover();
    }
    
}

class Humano extends Primates(){
    public Humano(){
        
    }
}

class Primates extends Mamifero{
    public Primates(){
        System.out.println("PRIMATES");
    }
    public void agarrarObjetos(){
        System.out.println("Primates: Agarran objetos");
    }
}
        

class Mamifero extends Animal{
    public Mamifero(){
        System.out.println("MAMIFEROS");
    }
    public void tenerPelo(){
       System.out.println("Mamifero: tiene pelo");
    }
}

class Vertebrado extends Animal{
    public Vertebrado(){
        System.out.println("VERTEBRADO");
    }
    public void tenerEsqueleto(){
        System.out.println("VERTEBRADO: tiene esqueleto");
    }
}


class Animal{
    public Animal(){
    System.out.println("Animal");
}
    
    public void mover(){
        System.out.println("Animal: Movimiento");
    }
}
