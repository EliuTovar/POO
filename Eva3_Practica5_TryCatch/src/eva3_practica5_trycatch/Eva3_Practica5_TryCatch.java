
package eva3_practica5_trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Eva3_Practica5_TryCatch {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingresa tu edad (numero entero): ");
        int edad = 0;
        try{//Adentro del try va el codigo que puede fallar
            edad = entrada.nextInt();
        }catch(InputMismatchException e){
        //Adentro del catch va el codigo que se va a ejecutar si se produce una falla
            System.out.println("Uops!! Fallo la captura!!!");
        }
        System.out.println("Tu edad: " + edad);    
        
    }
    
}
