/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_13_access_modifiers;

/**
 *
 * @author tovar
 */
public class Automovil {
    private String modelo;
    private String marca;
    private int año;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
}
class Carreta{//MODIFICADORES DE ACCESO --> DEFAULT
    private String marcas;

    public String getMarcas() {
        return marcas;
    }

    public void setMarcas(String marcas) {
        this.marcas = marcas;
    }
    
    void imprimirMensaje(){
        System.out.println("Hola Mundo");
}
}
