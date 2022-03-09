/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author tovar
 */
public class Eva1_Practica15_FORMULAS_TEMP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca los grados celcius: ");
        double gradosCelsius = in.nextDouble();
        
        double CaF = Temperaturas.convertirCaF(gradosCelsius);
        System.out.println(gradosCelsius + "ºC = " + CaF + "ºF");
        
        double CaK = Temperaturas.convertirCaK(gradosCelsius);
        System.out.println(gradosCelsius + "ºC = " + CaK + "ºK" );
        
        System.out.println("Introduzca los grados Fahrenheit: ");
        double gradosFahrenheit = in.nextDouble();
        
        double FaC = Temperaturas.convertirFaC(gradosFahrenheit);
        System.out.println(gradosFahrenheit + "ºF = " + FaC + "ºC");
        
        double FaK = Temperaturas.convertirFaK(gradosFahrenheit);
        System.out.println(gradosFahrenheit + "ºF = " + FaK + "ºK");
        
        System.out.println("Introduzca grados Kelvin: ");
        double gradosKelvin = in.nextDouble();
        
        double KaF = Temperaturas.convertirKaF(gradosKelvin);
        System.out.println(gradosKelvin + "ºK = " + KaF + "ºF");
        
        double KaC = Temperaturas.convertirKaC(gradosKelvin);
        System.out.println(gradosKelvin + "ºK = " + KaC + "ºC");
        
        
        
        
    }
    
}
class Temperaturas{
    
    public static double convertirCaF(double gradosCelsius){
        double CaF;
        CaF = (1.8 * gradosCelsius) + 32;
        return CaF;  
    }
    
    public static double convertirCaK(double gradosCelsius){
        double CaK;
        CaK = gradosCelsius + 273.15;
        return CaK;
    }
    
    public static double convertirFaC(double gradosFahrenheit){
        double FaC;
        FaC = (gradosFahrenheit - 32)/1.8;
        return FaC;
    }
    public static double convertirFaK(double gradosFahrenheit){
        double FaK;
        FaK = (gradosFahrenheit - 32)/1.8 + 273.15;
        return FaK;
    }
    
    public static double convertirKaF(double gradosKelvin){
        double KaF;
        KaF = ((gradosKelvin - 273.15) * 1.8) + 32;
        return KaF;
    }
    public static double convertirKaC(double gradosKelvin){
        double KaC;
        KaC = gradosKelvin - 273.15;
        return KaC;
    }
}
/*C - F
C - K
F - C
F - K
K - F
K - C
*/
