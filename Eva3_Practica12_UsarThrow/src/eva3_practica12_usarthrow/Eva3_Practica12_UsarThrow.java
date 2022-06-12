
package eva3_practica12_usarthrow;

import java.util.Scanner;


public class Eva3_Practica12_UsarThrow {

    
    public static void main(String[] args) {
        int edad = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        try{
        System.out.println("Introduce tu edad (numero entero positivo)");
        edad = entrada.nextInt();
        if(edad < 0)
            throw new Exception("La edad " + edad + " no es una edad valida");
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("La edad capturada es: " + edad);
    }
    
}
