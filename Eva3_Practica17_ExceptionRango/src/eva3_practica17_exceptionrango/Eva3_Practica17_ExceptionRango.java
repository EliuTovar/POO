package eva3_practica17_exceptionrango;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Eva3_Practica17_ExceptionRango {

    
    public static void main(String[] args) throws Exception {
        
        try {
            Persona perso = new Persona("Juan Perez", -150);
        } catch (ExcepcionDeRango ex) {
            ex.printStackTrace();
            
        }
        
        
    }
    
}

class ExcepcionDeRango extends Exception{

    public ExcepcionDeRango() {
    }

    public ExcepcionDeRango(String message) {
        super(message);
    }
    
}

class Persona{
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        setEdad(edad);
        
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

    public void setEdad(int edad) throws ExcepcionDeRango{
        if((edad >= 0) && (edad <= 130))
            this.edad = edad;
        else
            throw new ExcepcionDeRango("Rango de edad incorrecto!!");
    }
    
    
}
