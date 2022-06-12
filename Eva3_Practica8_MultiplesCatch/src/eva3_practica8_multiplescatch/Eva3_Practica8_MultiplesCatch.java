/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica8_multiplescatch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tovar
 */
public class Eva3_Practica8_MultiplesCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        try{//AQUI VA EL CODIGO QYE PUED FALLAR
            System.out.println("Introduce un numero entero 1:");
        int entero = entrada.nextInt();
        
        System.out.println("Introduce un numero entero 2:");
        int entero2 = entrada.nextInt();
        
            System.out.println("Division: " + (entero/entero2));
            
        }catch(ArithmeticException e){//ACCION REMEDIAL
            e.printStackTrace();//imprime la exception sin que el programa termine
            System.out.println("Se produjo una division entre cero");
            
        }catch(InputMismatchException e){//ACCION REMEDIAL
            System.out.println("El valor capturado no es numero valido");
            
        }
        System.out.println("FIN DEL PROGRAMA");
            
        
    }
    
}
