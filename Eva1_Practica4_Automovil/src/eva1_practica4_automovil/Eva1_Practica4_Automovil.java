/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica4_automovil;

/**
 *
 * @author tovar
 */
public class Eva1_Practica4_Automovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil auto1 = new Automovil();
        auto1.setMarca("Ford");
        auto1.setModelo("Mustang");
        auto1.settipoVehiculo("Sedan");
        auto1.setAño(2022);
        auto1.setColor("Rojo");
        auto1.setPrecio(1167000.00);
        auto1.imprimirDatos();
    }
    
}
    
        // TODO code application logic here
        
       
class Automovil{
    //ATRIBUTOS - PRIVADOS
private String marca;
private String modelo;
private String tipoVehiculo;
private int año;
private String color;
private double precio;

public String  getMarca(){
   return marca;
}
public String getModelo(){
   return modelo;
}
public String gettipoVehiculo(){
   return tipoVehiculo;
}
public int getAño(){
   return año;
}
public String getColor(){
   return color;
}
public double getPrecio(){
   return precio;
}

public void setMarca(String valor){
    marca = valor;
}
public void setModelo(String valor){
    modelo = valor;
}
public void settipoVehiculo(String valor){
    tipoVehiculo = valor;
}
public void setAño(int valor){
    año = valor;
}
public void setColor(String valor){
    color = valor;
}
public void setPrecio(double valor){
    precio = valor;
}
public void imprimirDatos(){
    System.out.println("Datos del vehiculo:");
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Tipo de vehiculo: " + tipoVehiculo);
    System.out.println("Año: " + año);
    System.out.println("Color: " + color);
    System.out.println("Precio: " + precio);
    System.out.println("Precio del IVA: " + (precio * 0.16));
} 
}