package eva3_practica1_overflow;


public class Eva3_Practica1_OVERFLOW {

    public static int cont = 0;
    public static void main(String[] args) {
        
        int x = 10;
        terminarStack();
        
    }
    
    //Stack es la memoria para variables locales y llamadas a funcion
    public static void terminarStack(){
        cont = cont + 1;
        System.out.println(cont);
        terminarStack();//recursividad
    }
    
}
