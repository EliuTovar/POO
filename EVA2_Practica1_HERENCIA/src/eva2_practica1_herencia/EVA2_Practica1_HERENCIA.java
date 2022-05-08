/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica1_herencia;

/**
 *
 * @author tovar
 */
public class EVA2_Practica1_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estu1 = new Estudiante("JUANA", 22, "00112255");
        //estu1.setNombre("JUANA");
        //estu1.setEdad(22);
        //estu1.mostrarNombre();
        //estu1.setNumControl("00112233");
        estu1.imprimirDatos();
        
        Maestro maes1 = new Maestro("Ricardo", 57, 13246979);
        maes1.imprimirDatos();
       
    }
}

//SUBCLASE MAESTRO
class Maestro extends Persona{
    //NO_DE_REGISTRO ENTERO
    private int numDeRegistro;
    
    public Maestro(){
        super();
        System.out.println("Clase Maestro");
    }
  
    public Maestro(String nombre, int edad, int numDeRegistro){
        super(nombre, edad);
        this.numDeRegistro = numDeRegistro;
    }

    public int getNumDeRegistro() {
        return numDeRegistro;
    }

    public void setNumDeRegistro(int numDeRegistro){
        this.numDeRegistro = numDeRegistro;
    }
  
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de registro: " + numDeRegistro);
    }
}

//SUBCLASE (HIJO)
//EXTENDS --> IS-A --> Estudiante ES-UNA Persona
class Estudiante extends Persona{
    private String numControl;
    
    //CONSTRUCTOR DEFAULT:
    public Estudiante(){
        super();//LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        System.out.println("Clase estudiante");
    }
    
    public Estudiante(String nombre, int edad, String numControl){
        super(nombre, edad);
        this.numControl = numControl;
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }
    
    public void mostrarNombre(){
        System.out.println("Nombre del estudiante: " + getNombre());
    }
    
    //BUSCAR QUE ES OVERRIDE
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();//AQUI ESTOY LLAMANDO AL METODO IMPRIMIR DATOS DE PERSONA(SUPERCLASE)
        System.out.println("Numero de control: " + numControl);
    }
    
}

class Persona{//SUPERCLASE (PADRE)
    
    private String nombre;
    private int edad;

    public Persona() {
        this.nombre = "xxxxxxxxxxxxx";
        this.edad = 100000000;
        System.out.println("Clase persona");
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
    
    public void imprimirDatos(){
        System.out.println("Nombre " + nombre);
        System.out.println("Edad " + edad);
    }
}

