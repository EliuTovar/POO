/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica13_arreglos3objetos;

import java.util.Scanner;

/**
 *
 * @author tovar
 */
public class Eva2_Practica13_Arreglos3Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Persona[] arreglosPer = new Persona[10];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            //crear el objeto:
            arreglosPer[i] = new Persona();
            System.out.println("¿Cual es tu nombre? ");
            arreglosPer[i].setNombre(input.nextLine());
        }
        
        //MOSTRAR DATOS:
        for(int i = 0; i < 10; i++){
            System.out.println("Nombre: " + arreglosPer[i].getNombre());
        }
    }
    
}

class Persona{
    private String nombre;

    public Persona() {
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
