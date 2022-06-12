/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_practica13_mejorarcapturaedad;

import java.util.Scanner;

/**
 *
 * @author tovar
 */
public class Eva3_Practica13_MejorarCapturaEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true; //el ususario siempre se equivoca
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        do{
        try{
        System.out.println("Introduce tu edad(numero entero): ");
        edad = entrada.nextInt();
        if(edad < 0)
            throw new Exception("La edad " + edad + " no es una edad valida");
            datoErroneo = false;
        }catch(Exception e){
            e.printStackTrace();
        }
                System.out.println("Tu edad es: " + edad);
        }while(datoErroneo);
    }
    
}
