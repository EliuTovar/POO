
package eva3_practica21_serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Eva3_Practica21_Serializable {

    
    public static void main(String[] args) {
        //binarios y de texto
        //ESPECIFICAR QUE OBJETOS (CLASES) SON SERIALES
        //DEBEMOS DE HACER QUE LA CLASE IMPLEMENTE LA INTERFAZ SERIALIZABLE
        Persona perso = new Persona("Pedro", "Paramo");
        escribirObj(perso);
    }
    
    //GUARDAR OBJETOS
    public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/archivos/archivo3.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Eva3_Practica21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Eva3_Practica21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    //LEER OBJETOS
    public static void leerObj(Object obj){
        try {
            FileInputStream abrirArch = new FileInputStream("c:/archivos/archivo3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch);
            Persona persona = (Persona)leerObjeto.readObject();//
            System.out.println("Nombre: " + persona.getNombre() + " " +
                    persona.getApellido());
            leerObjeto.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Eva3_Practica21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Eva3_Practica21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Eva3_Practica21_Serializable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}

class Persona implements Serializable{
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}
