/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_practica16_comunicacion;

/**
 *
 * @author tovar
 */
public class Eva1_Practica16_COMUNICACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseA objA = new ClaseA();
        ClaseB objB = new ClaseB();
        objA.setValorA(100);
        objB.setValorB(objA.getValorA());
        System.out.println("Valor A " + objA.getValorA());
        System.out.println("Valor B " + objB.getValorB());
        
    }
}

class ClaseA{
    private int valorA;

    public int getValorA() {
        return valorA;
    }

    public void setValorA(int valorA) {
        this.valorA = valorA;
    }
}

class ClaseB{
    private int valorB;

    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }
}
