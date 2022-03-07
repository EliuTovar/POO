/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_static;

/**
 *
 * @author tovar
 */
public class Eva1_14_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INSTANCIAR
        /*FormulasMatematicas misFor = new FormulasMatematicas();
        double area = misFor.calcularAreaCirculo(100);
        System.out.println("Area del ciruclo: " + area);*/
        double area = FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area Circulo: " + area);
        double areaT = FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Area Triangulo: " + areaT);
        FormulasMatematicas obj1 = new FormulasMatematicas();
        obj1.imprimirMensaje();
    }
    
}

class FormulasMatematicas{
    
    static int valor = 100;
    //area circulo:
    public static double calcularAreaCirculo(double radio){
        double area;
        area = 3.1416 * radio * radio;
        return area;
    }
    //area del triangulo
    public static double calcularAreaTriangulo(double base, double altura){
        double areaT;
        areaT = (base * altura) / 2.0;
        return areaT;
    }
    public void imprimirMensaje(){
        System.out.println("Hola Mundo");
    }
}
