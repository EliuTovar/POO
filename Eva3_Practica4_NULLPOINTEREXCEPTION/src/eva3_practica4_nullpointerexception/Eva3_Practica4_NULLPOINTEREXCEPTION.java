
package eva3_practica4_nullpointerexception;


public class Eva3_Practica4_NULLPOINTEREXCEPTION {

    
    public static void main(String[] args) {
        Persona persona = null;
        imprimir(persona);
        System.out.println("fin de main");
        
    }
    
    public static void imprimir(Persona perso){
        masComplicado(perso);
        System.out.println("fin de imprimir");
    }
    
    public static void masComplicado(Persona perso){
        System.out.println("Nombre: " + perso.getNombre());
        System.out.println("fin de mas complicado");
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
