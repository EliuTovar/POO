/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica12_arreglos2;

import java.util.Scanner;

/**
 *
 * @author tovar
 */
public class Eva2_Practica12_ARREGLOS2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglosEdad = new int[32];//bytes ocupa un entero --> 4bytes
        Scanner input = new Scanner(System.in);
        //32 capturas --> for
        //CAPTURA DE DATOS
        for(int i = 0; i < 32; i++){//i --> index --> indic
            System.out.println("¿Cual es tu edad?");
            arreglosEdad[i] = input.nextInt();
        }
        
        //Mostrar Datos
        for(int i = 0; i < 32; i++){
            System.out.println("[" + arreglosEdad[i] + "]");
        }
        
    }
    
}
