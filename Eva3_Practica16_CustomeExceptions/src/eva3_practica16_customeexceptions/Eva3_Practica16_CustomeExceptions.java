package eva3_practica16_customeexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Eva3_Practica16_CustomeExceptions {

    
    public static void main(String[] args) throws ExcepcionDeCaptura {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Captura la edad: ");
        int valor = 0;
        try{
         valor = entrada.nextInt();
        }catch(InputMismatchException ex){
            throw new ExcepcionDeCaptura("Intodujiste una cadena de texto, no es numero entero");
            
        }  
    }
    
}

//EXCEPCION PERSONALIZADA
//HERENCIA DE EXCEPTION

class ExcepcionDeCaptura extends Exception{

    public ExcepcionDeCaptura() {
    }

    public ExcepcionDeCaptura(String message) {
        super(message);
    }
    
}