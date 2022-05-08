package eva2_practica19_clasesanonimas;


public class Eva2_Practica19_ClasesAnonimas {

    
    public static void main(String[] args) {
        Mensajes mensajes = new Mensajes(){//clase anonima
            @Override
            public void mostrarMensajes() {
                System.out.println("Hola Mundo!");
            }
            
        };
        mensajes.mostrarMensajes();
    }
    
}

interface Mensajes{
    public void mostrarMensajes();
}


