
package eva3_practica10_.pkgfinally;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Eva3_Practica10_Finally {

    
    public static void main(String[] args) {
        
        try{
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un dato entero: ");
        int valor = entrada.nextInt();
        
        System.out.println("El valor es: " + valor);
        
        }catch(InputMismatchException e){
            e.printStackTrace();
        }finally{//Esta seccion siempre se ejecuta a pesar de que se prodisca una excepsion
        System.out.println("ESTA LINEA SIEMPRE DEBE EJECUTARSE");
        }
        
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
