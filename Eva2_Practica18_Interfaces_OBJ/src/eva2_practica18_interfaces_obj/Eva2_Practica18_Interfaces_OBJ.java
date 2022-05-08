package eva2_practica18_interfaces_obj;


public class Eva2_Practica18_Interfaces_OBJ {

    
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Ana");
        
        Mensajes mensajes = persona;
        mensajes.mostrarMensajes();
    }
    
}

interface Mensajes{
    public void mostrarMensajes();
}

class Persona implements Mensajes{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void mostrarMensajes() {
        System.out.println(nombre);
    }
    
}
