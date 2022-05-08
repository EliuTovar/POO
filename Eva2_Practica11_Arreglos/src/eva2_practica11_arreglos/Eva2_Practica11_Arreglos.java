/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica11_arreglos;

/**
 *
 * @author tovar
 */
public class Eva2_Practica11_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Arreglos:
        //Fila o columna de excel
        //Almacenan datos del mismo tipo
        //Se pueden acceder por indices
        //JAVA: primer posicion --> 0, ultima: cantidad de elementos -1
        //JAVA: arreglos son objetos
        int[] arreglo = new int [10];//arreglo con 10 enteros
        //como los usamos?
        arreglo[0] = 100;//el arreglo en la posicion 0, se le asigna 10
        System.out.println("El valor de arreglo[0] = " + arreglo[0]);
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        arreglo[9] = 1000;
        //arregloarreglo[10] = 200 //aqui nos pasamos del arreglo
        String [] arreCade = new String[10];
        arreCade[5] = "Hola Mundo";
        double[] arreDouble = new double[1000000];
        arreDouble[999999] = 0.2;
        Persona[] clasePOO = new Persona[32];//Arreglo para 32 objetos tipo Persona
    
    
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
}
