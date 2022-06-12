/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica9_claseexception;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Eva3_Practica9_ClaseException {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        try{//AQUI VA EL CODIGO QUE PUEDE FALLAR
            System.out.println("Introduce un numero entero 1:");
        int entero = entrada.nextInt();
        
        System.out.println("Introduce un numero entero 2:");
        int entero2 = entrada.nextInt();
        
            System.out.println("Division: " + (entero/entero2));
            
        }catch(ArithmeticException e){//ACCION REMEDIAL
            e.printStackTrace();//imprime la exception sin que el programa termine
            System.out.println("Se produjo una division entre cero");
            
        }catch(Exception e){//ACCION REMEDIAL
            e.printStackTrace();
            
        }
        System.out.println("FIN DEL PROGRAMA");
    }
    
}
