
package eva3_practica18_archivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Eva3_Practica18_Archivos {

   
    public static void main(String[] args) {
        try {
            //RUTA:
            //FileInputStream
            FileInputStream archivo = new FileInputStream("C:\\Archivos/Clase.txt");
            /*System.out.println("Leer: " + archivo.read());
            System.out.println("Leer: " + archivo.read());*/
            //Leer todo el archivo:
            int caracter = archivo.read();
            while(caracter != -1){
                System.out.print((char)caracter);
                caracter = archivo.read();
            }
            
        } catch (FileNotFoundException ex) {
           ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
    }
    
}
