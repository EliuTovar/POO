package eva3_practica19_buffers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Eva3_Practica19_Buffers {

    
    public static void main(String[] args)  {
        //Definir la ruta
        Path ruta = Paths.get("c:/archivos/ExperimentoX.txt");
        
        //ABRIMOS EL ARCHIVO
        InputStream abrirArch;
        
        //LEEMOS EL ARCHIVO
        InputStreamReader leerArch;
        
        //CONVERTIMOS BYTES A CARACTERES
        BufferedReader leerTexto;
        
        try {
            abrirArch = Files.newInputStream(ruta);
            leerArch = new InputStreamReader(abrirArch);
            leerTexto = new BufferedReader(leerArch);
            String linea = leerTexto.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = leerTexto.readLine();
            }
                    
                    } catch (IOException ex) {
           
        }
        
    }
    
}
