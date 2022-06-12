package eva3_practica14_throw2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Eva3_Practica14_Throw2 {


    public static void main(String[] args) {
        Persona perso = new Persona();
        perso.setNombre("Juana Perez");
        try {
            perso.setEdad(capturarEdad());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            Persona perso2 = new Persona("Juan Perez", capturarEdad());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
    public static int capturarEdad() throws Exception{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Captura la edad: ");
        int valor = 0;
        try{
         valor = entrada.nextInt();
        }catch(InputMismatchException ex){
            throw new Exception("Intodujiste una cadena de texto, no es numero entero");
            
        }  
        return valor;
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

    public void setEdad(int edad) throws Exception {
        if((edad >= 0) && (edad <= 130))
            this.edad = edad;
        else
            throw new Exception("Rango de edad incorrecto!!");
    }
    
    
}
