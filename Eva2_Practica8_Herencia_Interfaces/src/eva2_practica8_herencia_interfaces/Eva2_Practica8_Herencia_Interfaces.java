/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica8_herencia_interfaces;

/**
 *
 * @author tovar
 */
public class Eva2_Practica8_Herencia_Interfaces {
    
    int A = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Prueba prueba = new Prueba();
        prueba.metodoA();
        prueba.metodoB();
        //System.out.println(A);
    }
    
}

class Prueba implements B{
    
    @Override
    public void metodoB() {
        
    }

    @Override
    public void metodoA() {
        
    }
    
}

interface A{
    public void metodoA();
}

interface B extends A{
    public void metodoB();
}
