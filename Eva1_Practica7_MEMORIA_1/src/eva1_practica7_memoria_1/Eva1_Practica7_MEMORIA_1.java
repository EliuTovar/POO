
package eva1_practica7_memoria_1;

/**
 *
 * @author tovar
 */
public class Eva1_Practica7_MEMORIA_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = 5;//4 bytes
        String cade = "Hola";
        Prueba obj = new Prueba();
        
        System.out.println("Valor: " + valor);
        System.out.println("Cadena: " + cade);
        System.out.println("Objeto" + obj);
    }
    
}
class Prueba{
    public void saludar(){
        System.out.println("Hola mundo!!");
    
    }

}
