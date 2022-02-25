/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica5_computadora;

/**
 *
 * @author tovar
 */
public class Eva1_Practica5_Computadora {

    /**
     * @param  the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu1 = new Computadora();
        compu1.setMarca("Lenovo");
        compu1.setPrecio(8000.99);
        compu1.setColor("Negra");
        compu1.setTipoComputadora("Laptop");
        compu1.imprimirDatos();
        
    }   
}
class Computadora {
    private String marca;
    private double precio;
    private String color;
    private String tipoComputadora;
    
    public String getMarca(){
        return  marca;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public String getColor(){
        return color;
    }
    public String getTipoComptadora(){
        return tipoComputadora;
    }
    
    public void setMarca(String valor){
        marca = valor;
    }
    
    public void setPrecio(double valor){
        precio = valor;
    }
    
    public void setColor(String valor){
        color = valor;
    }
    
    public void setTipoComputadora(String valor){
        tipoComputadora = valor;
    }
    
    public void imprimirDatos(){
        System.out.println("Datos de la computadora:");
        System.out.println("Marca: " + marca);
        System.out.println("Precio: " + precio);
        System.out.println("Color: " + color);
        System.out.println("Tipo de computadora (Laptop/Escritorio): " + tipoComputadora);
        System.out.println("Precio del IVA: " + (precio * 0.16));
    }
}