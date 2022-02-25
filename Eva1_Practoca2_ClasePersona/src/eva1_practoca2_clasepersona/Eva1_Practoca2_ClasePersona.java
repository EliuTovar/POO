/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practoca2_clasepersona;

/**
 *
 * @author tovar
 */
public class Eva1_Practoca2_ClasePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        //implementacion {}
        System.out.println("Hola mundo!!");
        Persona estudiante = new Persona();//declaro un identificador (objeto) tipo persona
        estudiante.id = "00112233";
        estudiante.nombre = "Juan Perez Jolote";
        estudiante.edad = 10;
        estudiante.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante.calcularAñoNaciemiento());
        
        Persona estudiante2 = new Persona();
        estudiante2.nombre = "Ruben";
        estudiante2.id = "11111";
        estudiante2.edad = 40;
        estudiante2.imprimirDatos();
        System.out.println("Año d nacimiento: " + estudiante2.calcularAñoNaciemiento());
        
        Persona estudiante3 = new Persona();
        estudiante3.nombre = "Pedro";
        estudiante3.edad = 50;
        estudiante3.id = "654654";
        estudiante3.imprimirDatos();
        System.out.println("Año de nacimiento: " + estudiante3.calcularAñoNaciemiento());
        
       
    }
    
}
class Persona{//implementacion
    //ATRIBUTOS DE LA CLASE
    String id;
    String nombre;
    int edad;
    
    //COMPORTAMIENTO 
    //metodo imprimir datos --> metodo/fucion --> f(3) = x + 1
    //valor de retorno + nombre de la funcion { argunmentos }
    void imprimirDatos(){//implementacion
    System.out.println("El nombre es: " + nombre);
    System.out.println("Su ID es: " + id);
    System.out.println("Su edad es: " + edad);
    
}
    //Calcular año de nacimiento
    int calcularAñoNaciemiento(){
        int añoNac = 2022 - edad;
      return añoNac;  
    }        
}
/*
Persona:
//Datos --> ATRIBUTOS DE LA CLASE
ID: cadena
Nombre: Cadena
Edad: entero
*/
