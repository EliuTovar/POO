
package eva3_practica6_trycatchzero;

import java.util.Scanner;


public class Eva3_Practica6_TryCatchZero {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero entero 1:");
        int entero = entrada.nextInt();
        
        System.out.println("Introduce un numero entero 2:");
        int entero2 = entrada.nextInt();
        
        try{
            System.out.println("Division: " + (entero/entero2));
        }catch(ArithmeticException e){
            e.printStackTrace();//imprime la exception sin que el programa termine
            System.out.println("Se produjo una division entre cero");
        }
        System.out.println("FIN DEL PROGRAMA");
            
        }
    
    
}
