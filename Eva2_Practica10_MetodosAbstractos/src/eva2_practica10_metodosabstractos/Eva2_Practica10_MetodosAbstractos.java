/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_practica10_metodosabstractos;

/**
 *
 * @author tovar
 */
public class Eva2_Practica10_MetodosAbstractos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
class ImplementaAbstracto extends ClaseAbstracta{

    @Override
    public void metodoAbstracto() {
        
    }
    
}

//METODO ABSTRACTO: SIN CUERPO (SIN IMPLEMENTACION, SIN LLAVES)
abstract class ClaseAbstracta{
    public void metodoImplementado(){
        System.out.println("Metodo implemetado");
    }
    public abstract void metodoAbstracto();
}
