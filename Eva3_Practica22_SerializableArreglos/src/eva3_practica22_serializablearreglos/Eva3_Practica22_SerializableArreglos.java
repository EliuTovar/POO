
package eva3_practica22_serializablearreglos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Eva3_Practica22_SerializableArreglos {

    
    public static void main(String[] args) {
        ArrayList <Persona> miListaPerso = new ArrayList();//COLLECTIONS. <Tipos de datos genericos>
        //JAVA --> LISTAS, ARREGLOS, ETC: 0 --> N - 1
        miListaPerso.add(new Persona("Juan", "Perez"));
        miListaPerso.add(new Persona("Pedro", "Perez"));
        miListaPerso.add(new Persona("Ana", "Perez"));
        miListaPerso.add(new Persona("Filomento", "Perez"));
        miListaPerso.add(new Persona("Antonio", "Perez"));
        miListaPerso.add(new Persona("Lupita", "Perez"));
        miListaPerso.add(new Persona("Nepomuceno", "Perez"));
        escribirObj(miListaPerso);
        
        
    }
    public static void escribirObj(Object obj){
        try {
            FileOutputStream abrirArch = new FileOutputStream("c:/archivos/archivo4.obj");
            ObjectOutputStream guardarObj = new ObjectOutputStream(abrirArch);
            guardarObj.writeObject(obj);
            guardarObj.flush();
            guardarObj.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    public static void leerObj(Object obj){
        try {
            FileInputStream abrirArch = new FileInputStream("c:/archivos/archivo3.obj");
            ObjectInputStream leerObjeto = new ObjectInputStream(abrirArch);
            ArrayList<Persona> miListaPerso = (ArrayList)leerObjeto.readObject();//
            for(int i = 0; i < miListaPerso.size(); i++){
                Persona persona = miListaPerso.get(i);
                System.out.println("Nombre: " + persona.getNombre() + " " +
                    persona.getApellido());
            }
            
            
            leerObjeto.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
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
