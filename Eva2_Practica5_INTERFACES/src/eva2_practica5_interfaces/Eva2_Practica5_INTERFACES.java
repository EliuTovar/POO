/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica5_interfaces;

/**
 *
 * @author tovar
 */
public class Eva2_Practica5_INTERFACES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.setNombre("Eliu");
        perso.setEdad(18);
        perso.imprimirDatos();
        
        Vehiculo vehiculo = new Vehiculo("Ford", "Mustang");
        vehiculo.imprimirDatos();
        vehiculo.MostrarMensaje();
        
        //MuestraDatos datos = new MuestraDatos();
    }
    
}

class Vehiculo implements MuestraDatos, Mensaje{
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
    
    @Override
    public void MostrarMensaje(){
        System.out.println("Hola Mundo");
        
    }
}

class Persona implements MuestraDatos{
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

interface MuestraDatos{
    //SOLO ACEPTAN METODOS PUBLICOS
    //SOLO ACEPTA DECLARACION DE METODOS --> SOLO ACEPTA METODOS ABSTRACTOS
    public void imprimirDatos();
}

interface Mensaje{
    public void MostrarMensaje();
}


