/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author tovar
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona per1 = new Persona();//Instanciar (crear un objeto)
        per1.setId("00112233");
        per1.setNombre("ELIU");
        per1.setEdad(18);
        System.out.println("Nombre: " + per1.getNombre());
        System.out.println("ID: " + per1.getId());
        System.out.println("Edad: " + per1.getEdad());
        
        Persona per2 = new Persona();
        per2.setId("21550363");
        per2.setNombre("DAVID");
        per2.setEdad(17);
        System.out.println("Nombre: " + per2.getNombre());
        System.out.println("ID: " + per2.getId());
        System.out.println("Edad: " + per2.getEdad());
    }
    
}
class Persona{
//ATRIBUTOS (VARIABLES) - PROPIEDADES
private String id;
private String nombre;
private int edad;
//COMPORTAMIENTO (METODOS)
///PAR LEER Y MODIFICAR LOS ATRIBUTOS, USAMOS METODOS DE LECTURA/ESCRITURA

//LEER --> GET
public String getId(){
   return id;
}
public String getNombre(){
   return nombre;
}
public int getEdad(){
   return edad;
}
//ASIGNAR --> SET
public void setId(String valor){
id = valor;
}
public void setNombre(String valor){
nombre = valor;
}
public void setEdad(int valor){
edad = valor;
}
}
