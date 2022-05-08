
package eva2_practica17_polimorfismo_int;


public class Eva2_Practica17_Polimorfismo_INT {

    
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
       // prueba.mostrarMensaje("HOLA MUNDO");
        //prueba.otroMetodo();
        mostrar(prueba);
    }
    
    public static void mostrar(Mensajes m){
        m.mostrarMensaje("Hola mundo");
    }
}


