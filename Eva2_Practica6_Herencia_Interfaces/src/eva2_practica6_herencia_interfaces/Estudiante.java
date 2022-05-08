/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author tovar
 */
public class Estudiante extends Persona implements MuestraDatos{
    private String numeroControl;

    public Estudiante() {
        super(); //constructor default de persona
        this.numeroControl = "";
    }

    public Estudiante(String numeroControl, String nombre, int edad) {
        super(nombre, edad);//CONSTRUCTOR DE PERSONA (SUPERCLASE)
        this.numeroControl = numeroControl;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }
    
    @Override
    public void imprimirDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Numero de control: " + numeroControl);
    }
    
    
}
