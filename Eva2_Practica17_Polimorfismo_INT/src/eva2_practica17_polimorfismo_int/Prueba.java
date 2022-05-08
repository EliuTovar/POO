
package eva2_practica17_polimorfismo_int;

//                  is-a
public class Prueba implements Mensajes{

    @Override
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public void otroMetodo(){
        System.out.println("Metodo Adicional");
    }
}
