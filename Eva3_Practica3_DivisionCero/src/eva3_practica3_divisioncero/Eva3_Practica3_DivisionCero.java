
package eva3_practica3_divisioncero;

import java.util.Scanner;


public class Eva3_Practica3_DivisionCero {

    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       
       System.out.print("Introduce un numero entero 1: ");
       int entero = entrada.nextInt();
       
       System.out.print("Introduce un numero entero 1: ");
       int entero2 = entrada.nextInt();
       
       System.out.print("Divison: " + (entero/entero2));
    }
    
}
